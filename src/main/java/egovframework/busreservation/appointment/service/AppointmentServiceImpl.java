package egovframework.busreservation.appointment.service;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import egovframework.busreservation.appointment.dto.AppointmentDto;


@Service("appointmentService")
public class AppointmentServiceImpl implements AppointmentService {

	@Resource(name="appointmentMapper")
	private AppointmentMapper appointmentMapper;
	
	@Override
	public int reserve(AppointmentDto resource, HttpSession session) {
		if(session.getAttribute("userId") == null) {
			return -1;
		}
		appointmentMapper.reserve(resource);
		return 1;
	}
}
