package egovframework.busreservation.member.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import egovframework.busreservation.member.exception.IdExistsException;
import egovframework.busreservation.member.exception.InvalidPasswordException;
import egovframework.busreservation.member.exception.MemberNotFoundException;


@ControllerAdvice
public class MemberExceptionHandler {

	private static final Logger logger = LoggerFactory.getLogger(MemberExceptionHandler.class);
	
	@ExceptionHandler(IdExistsException.class)
	public ModelAndView handleIdExistsException(IdExistsException e) {
		logger.error(e.getMessage());
		ModelAndView mav = new ModelAndView();
		mav.setViewName("member/signup");
		mav.addObject("msg", "idError");
		return mav;
	}
	
	@ExceptionHandler(InvalidPasswordException.class)
	public ModelAndView handlePasswordConfirmFailedException(InvalidPasswordException e) {
		logger.error(e.getMessage());
		ModelAndView mav = new ModelAndView();
		mav.setViewName("member/signup");
		mav.addObject("msg", "pwError");
		return mav;
	}
	
	@ExceptionHandler(MemberNotFoundException.class)
	public ModelAndView handleMemberDoesNotExistException(MemberNotFoundException e) {
		logger.error(e.getMessage());
		ModelAndView mav = new ModelAndView();
		mav.setViewName("member/login");
		mav.addObject("msg", "error");
		return mav;
	}
}
