package egovframework.busreservation.section.service;

import javax.servlet.http.HttpSession;

import egovframework.busreservation.section.dto.SectionRequestDto;
import egovframework.busreservation.section.dto.SectionResponseDto;

public interface SectionService {

	public SectionResponseDto findSectionByCd(SectionRequestDto resource, HttpSession session);
	
	public String findSectionNameByCd(String cd);
	
	public SectionResponseDto findSectionById(int sectionNo);
}
