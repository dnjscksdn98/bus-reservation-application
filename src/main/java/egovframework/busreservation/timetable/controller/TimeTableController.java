package egovframework.busreservation.timetable.controller;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import egovframework.busreservation.bus.dto.BusDto;
import egovframework.busreservation.bus.service.BusService;
import egovframework.busreservation.timetable.dto.TimeTableDto;
import egovframework.busreservation.timetable.service.TimeTableService;
import egovframework.busreservation.timetable.pagination.TimeTablePagination;

@Controller
@RequestMapping("/timetable/*")
public class TimeTableController {

	@Autowired
	private TimeTableService timeTableService;
	
	@Autowired
	private BusService busService;
	
	@RequestMapping("list.do")
	public ModelAndView timeTableView(@RequestParam(defaultValue="1") int curPage) {
		TimeTablePagination pagination = new TimeTablePagination(4, curPage);
		int start = pagination.getPageBegin();
		int end = pagination.getPageEnd();
		
		List<TimeTableDto> timetable = timeTableService.getTimeTable(start, end);
		
		Map<String, Object> map = new HashMap<>();
		map.put("timetable", timetable);
		map.put("pagination", pagination);
		
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
	
}
