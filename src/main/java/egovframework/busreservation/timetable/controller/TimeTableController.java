package egovframework.busreservation.timetable.controller;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import egovframework.busreservation.utils.DateUtils;
import egovframework.busreservation.bus.dto.BusDto;
import egovframework.busreservation.bus.service.BusService;
import egovframework.busreservation.member.service.MemberService;
import egovframework.busreservation.timetable.dto.TimeTableDto;
import egovframework.busreservation.timetable.service.TimeTableService;
import egovframework.busreservation.timetable.pagination.TimeTablePagination;

@Controller
@RequestMapping("/timetable/*")
public class TimeTableController {

	@Autowired
	private TimeTableService timeTableService;
	
	@Autowired
	private MemberService memberService;
	
	@Autowired
	private BusService busService;
	
	@RequestMapping("list.do")
	public ModelAndView timeTableView(
			@RequestParam(defaultValue="1") int curPage,
			@RequestParam(defaultValue="") String month,
			@RequestParam(defaultValue="") String day,
			@RequestParam(defaultValue="") String time) {

		String date = "2020" + month + day + time;
		int count = timeTableService.getCountByTime(date);
		
		TimeTablePagination pagination = new TimeTablePagination(count, curPage);
		int start = pagination.getPageBegin();
		int end = pagination.getPageEnd();
		
		List<TimeTableDto> timetable = timeTableService.getTimeTable(date, start, end);
		
		DateUtils dateUtils = new DateUtils();
		Map<String, Object> map = new HashMap<>();
		map.put("timetable", timetable);
		map.put("pagination", pagination);
		map.put("count", count);
		map.put("months", dateUtils.getMonths());
		map.put("days", dateUtils.getDays());
		map.put("times", dateUtils.getTimes());
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("map", map);
		mav.setViewName("home");
		return mav;
	}
	
	@RequestMapping(value="detail.do", method=RequestMethod.GET)
	public ModelAndView detail(@RequestParam int id) {
		TimeTableDto detail = timeTableService.getTimeTableById(id);
		BusDto bus = busService.getBusById(detail.getBusNo());
		
		Map<String, Object> map = new HashMap<>();
		map.put("detail", detail);
		map.put("bus", bus);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("timetable/detail");
		mav.addObject("map", map);
		return mav;
	}
	
	@RequestMapping(value="create_view.do", method=RequestMethod.GET)
	public ModelAndView createView(HttpSession session) {
		memberService.checkAdminAuth(session);
		
		Map<String, Object> map = new HashMap<>();
		DateUtils dateUtils = new DateUtils();
		map.put("months", dateUtils.getMonths());
		map.put("days", dateUtils.getDays());
		map.put("times", dateUtils.getTimes());
		map.put("buses", busService.getBuses());
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("map", map);
		mav.setViewName("timetable/create");
		return mav;
	}
	
	// TODO: 각 컨트롤러단의 ERD, UCD 생성
	@RequestMapping(value="create.do", method=RequestMethod.POST)
	public ModelAndView create(@ModelAttribute TimeTableDto resource, HttpSession session) {
		timeTableService.createTimeTable(resource, session);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		return mav;
	}
}
