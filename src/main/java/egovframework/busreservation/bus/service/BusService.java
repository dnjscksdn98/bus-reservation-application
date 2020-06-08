package egovframework.busreservation.bus.service;

import egovframework.busreservation.bus.dto.BusDto;

public interface BusService {

	public BusDto getBusById(int id);
	
	public void reserveBusById(int id);
}
