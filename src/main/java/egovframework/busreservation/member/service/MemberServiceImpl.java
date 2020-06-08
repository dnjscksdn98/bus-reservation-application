package egovframework.busreservation.member.service;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.multipart.MultipartHttpServletRequest;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

import egovframework.buserservation.utils.FileUtils;
import egovframework.busreservation.member.dto.MemberSignupDto;
import egovframework.busreservation.member.dto.MemberLoginDto;

import egovframework.busreservation.member.exception.IdExistsException;
import egovframework.busreservation.member.exception.InvalidPasswordException;
import egovframework.busreservation.member.exception.MemberNotFoundException;


@Service("memberService")
public class MemberServiceImpl extends EgovAbstractServiceImpl implements MemberService {

	@Resource(name="memberMapper")
	private MemberMapper memberMapper;
	
	@Resource(name="fileUtils")
	private FileUtils fileUtils;
	
	@Override
	public void signup(MemberSignupDto resource, MultipartHttpServletRequest mpRequest) {
		if(findMemberById(resource.getId()) == -1) {
			throw new IdExistsException("아이디가 이미 존재합니다");
		}
		if(confirmPassword(resource.getPasswd(), resource.getConfirmPasswd()) == -1) {
			throw new InvalidPasswordException("비밀번호가 불일치합니다");
		}
		memberMapper.insertMember(resource);
		
		// 파일 업로드
		List<Map<String, Object>> list;
		try {
			list = fileUtils.parseInsertFileInfo(resource.getId(), mpRequest);
			int size = list.size();
			for(int i=0; i < size; i++){ 
				memberMapper.insertFile(list.get(i)); 
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	@Override
	public void login(MemberLoginDto resource, HttpSession session) {
		if(findMemberByIdWithPw(resource) == -1) {
			throw new MemberNotFoundException("아이디 또는 비번이 틀렸습니다");
		}
		session.setAttribute("userId", resource.getId());
	}
	
	@Override
	public void logout(HttpSession session) {
		session.invalidate();
	}
	
	private int findMemberByIdWithPw(MemberLoginDto resource) {
		if(memberMapper.findMemberByIdWithPw(resource) != null) {
			return 1;
		}
		return -1;
	}
	
	private int findMemberById(String id) {
		if(memberMapper.findMemberById(id) != null) {
			return -1;
		}
		return 1;
	}
	
	private int confirmPassword(String passwd, String confirmPasswd) {
		if(passwd.equals(confirmPasswd)) {
			return 1;
		}
		return -1;
	}
}
