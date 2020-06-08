package egovframework.busreservation.utils;

import java.io.File;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;


@Component("fileUtils")
public class FileUtils {
	
	private static final String filePath = "C:\\mp\\file\\";  // 파일 저장 경로
	
	public List<Map<String, Object>> parseInsertFileInfo(
			String id, 
			MultipartHttpServletRequest mpRequest) throws Exception{
		
		Iterator<String> iterator = mpRequest.getFileNames();
		
		MultipartFile multipartFile = null;
		String originalFileName = null;
		String originalFileExtension = null;
		String saveFileName = null;
		
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		Map<String, Object> listMap = null;
		
		File file = new File(filePath);
		if(file.exists() == false) {  // 파일 경로가 없으면 새로 생성
			file.mkdirs();
		}
		
		while(iterator.hasNext()) {
			multipartFile = mpRequest.getFile(iterator.next());
			if(multipartFile.isEmpty() == false) {
				originalFileName = multipartFile.getOriginalFilename();
				originalFileExtension = originalFileName.substring(originalFileName.lastIndexOf("."));
				saveFileName = getRandomString() + originalFileExtension;
				
				file = new File(filePath + saveFileName);
				multipartFile.transferTo(file);
				listMap = new HashMap<String, Object>();
				listMap.put("id", id);
				listMap.put("fileName", originalFileName);
				listMap.put("saveFileName", saveFileName);
				listMap.put("fileSavePath", filePath);
				list.add(listMap);
			}
		}
		return list;
	}
	
	public static String getRandomString() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
	
}
