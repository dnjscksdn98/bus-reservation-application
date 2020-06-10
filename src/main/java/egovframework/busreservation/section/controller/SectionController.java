package egovframework.busreservation.section.controller;

import java.util.Map;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import egovframework.busreservation.section.dto.SectionRequestDto;
import egovframework.busreservation.section.dto.SectionResponseDto;
import egovframework.busreservation.section.service.SectionService;
import egovframework.busreservation.timetable.service.TimeTableService;


@Controller
public class SectionController {

	@Autowired
	private SectionService sectionService;
	
	@Autowired
	private TimeTableService timeTableService;
	
	@RequestMapping(value="home_section.do", method=RequestMethod.POST)
	public ModelAndView homeSection(@ModelAttribute SectionRequestDto resource, HttpSession session) {
		SectionResponseDto section = sectionService.findSectionByCd(resource, session);
		String startName = sectionService.findSectionNameByCd(resource.getStartCd());
		String endName = sectionService.findSectionNameByCd(resource.getEndCd());
		
		String time = "2020" + resource.getMonth() + resource.getDay() + resource.getTime();
		int seqNo = timeTableService.findTimeTableByTime(time);
		String startTime = timeTableService.findTimeTableBySeqNo(seqNo);
		
		Map<String, Object> map = new HashMap<>();
		map.put("section", section);
		map.put("startName", startName);
		map.put("endName", endName);
		map.put("seqNo", seqNo);
		map.put("startTime", startTime);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("appointment/reserve");
		mav.addObject("map", map);
		return mav;
	}
	
	@RequestMapping(value="section.do", method=RequestMethod.POST)
	public ModelAndView section(@ModelAttribute SectionRequestDto resource, HttpSession session) {
		
		SectionResponseDto section = sectionService.findSectionByCd(resource, session);
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
