package egovframework.busreservation.member.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import egovframework.busreservation.member.dto.MemberSignupDto;
import egovframework.busreservation.member.dto.MemberLoginDto;

import egovframework.busreservation.utils.FileUtils;
import egovframework.busreservation.auth.InvalidRoleException;
import egovframework.busreservation.auth.InvalidAuthenticationException;
import egovframework.busreservation.member.exception.IdExistsException;
import egovframework.busreservation.member.exception.InvalidPasswordException;
import egovframework.busreservation.member.exception.MemberNotFoundException;


@Service("memberService")
public class MemberServiceImpl implements MemberService {

	@Resource(name="memberMapper")
	private MemberMapper memberMapper;
	
	@Resource(name="fileUtils")
	private FileUtils fileUtils;
	
	@Override
	@Transactional
	public void signup(MemberSignupDto resource, MultipartHttpServletRequest mpRequest) {
		if(findMemberById(resource.getId()) == -1) {
			throw new IdExistsException("아이디가 이미 존재합니다");
		}
		if(confirmPassword(resource.getPasswd(), resource.getConfirmPasswd()) == -1) {
			throw new InvalidPasswordException("비밀번호가 불일치합니다");
		}
		memberMapper.insertMember(resource);
		
		List<Map<String, Object>> list;
		try {
			list = fileUtils.parseInsertFileInfo(resource.getId(), mpRequest);
			int size = list.size();
			for(int i=0; i < size; i++){ 
				memberMapper.insertFile(list.get(i)); 
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void login(MemberLoginDto resource, HttpSession session) {
		if(findMemberByIdWithPw(resource) == -1) {
			throw new MemberNotFoundException("아이디 또는 비번이 틀렸습니다");
		}
		String userId = resource.getId();
		String memberCd = memberMapper.findMemberCdById(userId);
		session.setAttribute("userId", userId);
		session.setAttribute("memberCd", memberCd);
	}
	
	@Override
	public void logout(HttpSession session) {
		session.invalidate();
	}
	
	@Override
	public void checkAuth(HttpSession session) {
		if(session.getAttribute("userId") == null) {
			throw new InvalidAuthenticationException("인증 되지 않은 사용자입니다");
		}
	}
	
	@Override
	public void checkAdminAuth(HttpSession session) {
		String id = memberMapper.findAdminById((String)session.getAttribute("userId"));
		if(id == null) {
			throw new InvalidRoleException("접근 불가능한 사용자입니다");
		}
	}
	
	private int findMemberByIdWithPw(MemberLoginDto resource) {
		if(memberMapper.findMemberByIdWithPw(resource) != null) {
			return 1;
		}
		return -1;
	}
	
	private int findMemberById(String id) {
		if(memberMapper.findMemberById(id) != null) {
			return -1;
		}
		return 1;
	}
	
	private int confirmPassword(String passwd, String confirmPasswd) {
		if(passwd.equals(confirmPasswd)) {
			return 1;
		}
		return -1;
	}
}
