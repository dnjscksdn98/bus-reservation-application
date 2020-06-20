package egovframework.busreservation.section.service;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

import egovframework.busreservation.section.dto.SectionRequestDto;
import egovframework.busreservation.section.dto.SectionResponseDto;


@Repository("sectionMapper")
public class SectionMapper extends EgovAbstractMapper {

	public SectionResponseDto findSectionByCd(SectionRequestDto resource) {
		return selectOne("SectionMapper.findSectionByCd", resource);
	}
	
	public String findSectionNameByCd(String cd) {
		return selectOne("SectionMapper.findSectionNameByCd", cd);
	}
	
	public SectionResponseDto findSectionById(int sectionNo) {
		return selectOne("SectionMapper.findSectionById", sectionNo);
	}
}
