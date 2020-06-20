package egovframework.busreservation.section.service;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import egovframework.busreservation.section.dto.SectionRequestDto;
import egovframework.busreservation.section.dto.SectionResponseDto;
import egovframework.busreservation.section.exception.InvalidSectionException;
import egovframework.busreservation.auth.InvalidAuthenticationException;


@Service("sectionService")
public class SectionServiceImpl implements SectionService {

	@Resource(name="sectionMapper")
	private SectionMapper sectionMapper;
	
	@Override
	public SectionResponseDto findSectionByCd(SectionRequestDto resource, HttpSession session) {
		if(session.getAttribute("userId") == null) {
			throw new InvalidAuthenticationException("인증되지 않은 사용자입니다");
		}
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
	
	@Override
	public SectionResponseDto findSectionById(int sectionNo) {
		return sectionMapper.findSectionById(sectionNo);
	}
}
