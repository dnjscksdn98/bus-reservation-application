package egovframework.busreservation.section.service;

import egovframework.busreservation.section.dto.SectionRequestDto;
import egovframework.busreservation.section.dto.SectionResponseDto;

public interface SectionService {

	public SectionResponseDto findSectionByCd(SectionRequestDto resource);
	
	public String findSectionNameByCd(String cd);
}
