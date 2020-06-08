package egovframework.busreservation.appointment.service;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

import egovframework.busreservation.appointment.dto.AppointmentDto;


@Repository("appointmentMapper")
public class AppointmentMapper extends EgovAbstractMapper {

	public void reserve(AppointmentDto resource) {
		insert("AppointmentMapper.reserve", resource);
	}
}
