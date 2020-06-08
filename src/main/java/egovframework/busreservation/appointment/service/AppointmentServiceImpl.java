package egovframework.busreservation.appointment.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import egovframework.busreservation.appointment.dto.AppointmentDto;

@Service("appointmentService")
public class AppointmentServiceImpl implements AppointmentService {

	@Resource(name="appointmentMapper")
	private AppointmentMapper appointmentMapper;
	
	@Override
	public void reserve(AppointmentDto resource) {
		appointmentMapper.reserve(resource);
	}
}
