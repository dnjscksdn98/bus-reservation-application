package egovframework.busreservation.appointment.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
		int result = appointmentService.reserve(resource, session);
		
		ModelAndView mav = new ModelAndView();
		if(result == -1) {
			mav.setViewName("member/login");
		}
		else {
			// TODO: 예약 성공 페이지 꾸미기
			mav.setViewName("appointment/reserve_success");
		}
		return mav;
	}
}
