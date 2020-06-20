package egovframework.busreservation.appointment.service;

import javax.servlet.http.HttpSession;

import egovframework.busreservation.appointment.dto.AppointmentDto;


public interface AppointmentService {

	public void reserve(AppointmentDto resource, HttpSession session);
	
	public AppointmentDto getAppointmentByUserId(String id);
	
	public void deleteAppointmentById(String id);
}
