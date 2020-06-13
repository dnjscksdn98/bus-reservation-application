package egovframework.busreservation.bus.service;

import java.util.List;

import egovframework.busreservation.bus.dto.BusDto;

public interface BusService {

	public BusDto getBusById(int id);
	
	public List<BusDto> getBuses();
}
