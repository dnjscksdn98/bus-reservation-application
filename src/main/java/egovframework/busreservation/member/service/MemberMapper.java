package egovframework.busreservation.member.service;

import java.util.Map;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

import egovframework.busreservation.member.dto.MemberSignupDto;
import egovframework.busreservation.member.dto.MemberLoginDto;


@Repository("memberMapper")
public class MemberMapper extends EgovAbstractMapper {
	
	public void insertMember(MemberSignupDto resource) {
		insert("MemberMapper.insertMember", resource);
	}
	
	public String findMemberById(String id) {
		return selectOne("MemberMapper.findMemberById", id);
	}
	
	public String findMemberByIdWithPw(MemberLoginDto resource) {
		return selectOne("MemberMapper.findMemberByIdWithPw", resource);
	}
	
	public void insertFile(Map<String, Object> map) {
		insert("MemberMapper.insertFile", map);
	}
	
	public String findAdminById(String id) {
		return selectOne("MemberMapper.findAdminById", id);
	}
	
	public String findMemberCdById(String userId) {
		return selectOne("MemberMapper.findMemberCdById", userId);
	}
}
