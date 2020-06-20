package egovframework.busreservation.appointment.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import egovframework.busreservation.appointment.dto.AppointmentDto;
import egovframework.busreservation.appointment.service.AppointmentService;


@Controller
@RequestMapping("/appointment/*")
public class AppointmentController {

	@Autowired
	private AppointmentService appointmentService;
	
	@RequestMapping(value="/reserve.do", method=RequestMethod.POST)
	public ModelAndView reserve(@ModelAttribute AppointmentDto resource, HttpSession session) {
		appointmentService.reserve(resource, session);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "reserveSuccess");
		mav.setViewName("appointment/reserve_success");
		return mav;
	}
	
	@RequestMapping(value="/delete.do", method=RequestMethod.POST)
	public ModelAndView delete(@RequestParam String id) {
		appointmentService.deleteAppointmentById(id);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "deleteSuccess");
		mav.setViewName("main");
		return mav;
	}
}
