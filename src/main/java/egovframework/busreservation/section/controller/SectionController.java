package egovframework.busreservation.section.controller;

import java.util.Map;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import egovframework.busreservation.section.dto.SectionRequestDto;
import egovframework.busreservation.section.dto.SectionResponseDto;
import egovframework.busreservation.section.service.SectionService;


@Controller
public class SectionController {

	@Autowired
	private SectionService sectionService;
	
	@RequestMapping(value="section.do", method=RequestMethod.POST)
	public ModelAndView section(@ModelAttribute SectionRequestDto resource) {
		
		SectionResponseDto section = sectionService.findSectionByCd(resource);
		String startName = sectionService.findSectionNameByCd(resource.getStartCd());
		String endName = sectionService.findSectionNameByCd(resource.getEndCd());
		int seqNo = resource.getSeqNo();
		
		String busStartTime = resource.getStartTime();
		// TODO: 출발 시간 계산하기
		// TODO: 결제 비용 계산하기
		
		Map<String, Object> map = new HashMap<>();
		map.put("section", section);
		map.put("startName", startName);
		map.put("endName", endName);
		map.put("seqNo", seqNo);
		map.put("startTime", resource.getStartTime());
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("appointment/reserve");
		mav.addObject("map", map);
		return mav;
	}
}
