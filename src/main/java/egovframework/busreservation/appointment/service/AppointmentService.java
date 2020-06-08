package egovframework.busreservation.appointment.service;

import javax.servlet.http.HttpSession;

import egovframework.busreservation.appointment.dto.AppointmentDto;


public interface AppointmentService {

	public int reserve(AppointmentDto resource, HttpSession session);
}
