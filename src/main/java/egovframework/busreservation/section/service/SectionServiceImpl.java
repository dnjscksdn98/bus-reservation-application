package egovframework.busreservation.section.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import egovframework.busreservation.section.dto.SectionRequestDto;
import egovframework.busreservation.section.dto.SectionResponseDto;
import egovframework.busreservation.section.exception.InvalidSectionException;


@Service("sectionService")
public class SectionServiceImpl implements SectionService {

	@Resource(name="sectionMapper")
	private SectionMapper sectionMapper;
	
	@Override
	public SectionResponseDto findSectionByCd(SectionRequestDto resource) {
		SectionResponseDto section = sectionMapper.findSectionByCd(resource);
		if(section == null) {
			throw new InvalidSectionException("존재하지 않는 섹션입니다");
		}
		return section;
	}
	
	@Override
	public String findSectionNameByCd(String cd) {
		return sectionMapper.findSectionNameByCd(cd);
	}
}
