package egovframework.busreservation.appointment.service;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

import egovframework.busreservation.appointment.dto.AppointmentDto;


@Repository("appointmentMapper")
public class AppointmentMapper extends EgovAbstractMapper {

	public void reserve(AppointmentDto resource) {
		insert("AppointmentMapper.reserve", resource);
	}
	
	public int getBusBySeq(int seqNo) {
		return selectOne("AppointmentMapper.getBusBySeq", seqNo);
	}
	
	public void reduceSeat(int busNo) {
		update("AppointmentMapper.reduceSeat", busNo);
	}
	
	public AppointmentDto getAppointmentByUserId(String id) {
		return selectOne("AppointmentMapper.getAppointmentByUserId", id);
	}
}
