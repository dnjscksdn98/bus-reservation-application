package egovframework.busreservation.section.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import egovframework.busreservation.section.dto.SectionRequestDto;
import egovframework.busreservation.section.dto.SectionResponseDto;


@Service("sectionService")
public class SectionServiceImpl implements SectionService {

	@Resource(name="sectionMapper")
	private SectionMapper sectionMapper;
	
	@Override
	public SectionResponseDto findSectionByCd(SectionRequestDto resource) {
		// TODO: 없는 섹션일 때의 예외처리
		return sectionMapper.findSectionByCd(resource);
	}
	
	@Override
	public String findSectionNameByCd(String cd) {
		return sectionMapper.findSectionNameByCd(cd);
	}
}
