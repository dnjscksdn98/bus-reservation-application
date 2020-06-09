package egovframework.busreservation.appointment.service;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import egovframework.busreservation.appointment.dto.AppointmentDto;
import egovframework.busreservation.auth.InvalidAuthenticationException;


@Service("appointmentService")
public class AppointmentServiceImpl implements AppointmentService {

	@Resource(name="appointmentMapper")
	private AppointmentMapper appointmentMapper;
	
	@Override
	@Transactional
	public void reserve(AppointmentDto resource, HttpSession session) {
		if(session.getAttribute("userId") == null) {
			throw new InvalidAuthenticationException("인증되지 않은 사용자입니다");
		}
		appointmentMapper.reserve(resource);
		int busNo = appointmentMapper.getBusBySeq(resource.getSeqNo());
		appointmentMapper.reduceSeat(busNo);
	}
}
