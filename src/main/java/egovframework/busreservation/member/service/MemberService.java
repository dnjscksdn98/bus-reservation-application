package egovframework.busreservation.member.service;

import javax.servlet.http.HttpSession;

import org.springframework.web.multipart.MultipartHttpServletRequest;

import egovframework.busreservation.member.dto.MemberSignupDto;
import egovframework.busreservation.member.dto.MemberLoginDto;

public interface MemberService {
	
	public void signup(MemberSignupDto resource, MultipartHttpServletRequest mpRequest);
	
	public void login(MemberLoginDto resource, HttpSession session);
	
	public void logout(HttpSession session);
	
	public void checkAdminAuth(HttpSession session);
}
