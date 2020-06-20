package egovframework.busreservation.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import egovframework.busreservation.appointment.dto.AppointmentDto;
import egovframework.busreservation.appointment.service.AppointmentService;
import egovframework.busreservation.member.service.MemberService;
import egovframework.busreservation.member.dto.MemberSignupDto;
import egovframework.busreservation.member.dto.MemberLoginDto;


@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@Autowired
	private AppointmentService appointmentService;
	
	@RequestMapping(value="/signup_view.do", method=RequestMethod.GET)
	public String signupView() {
		return "member/signup";
	}
	
	@RequestMapping(value="/login_view.do", method=RequestMethod.GET)
	public String loginView() {
		return "member/login";
	}
	
	@RequestMapping(value="/signup.do", method=RequestMethod.POST)
	public ModelAndView signup(@ModelAttribute MemberSignupDto resource, MultipartHttpServletRequest mpRequest) {
		memberService.signup(resource, mpRequest);
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "success");
		mav.setViewName("member/login");
		return mav;
	}
	
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public ModelAndView login(@ModelAttribute MemberLoginDto resource, HttpSession session) {
		memberService.login(resource, session);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		return mav;
	}
	
	@RequestMapping("/logout.do")
	public ModelAndView logout(HttpSession session) {
		memberService.logout(session);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		return mav;
	}
	
	@RequestMapping(value="/profile_view.do", method=RequestMethod.GET)
	public ModelAndView profileView(HttpSession session) {
		String id = memberService.checkAuth(session);
		AppointmentDto appointment = appointmentService.getAppointmentByUserId(id);
		ModelAndView mav = new ModelAndView();
		mav.addObject("appointment", appointment);
		mav.setViewName("member/profile");
		return mav;
	}
	
}
