package egovframework.busreservation.bus.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import egovframework.busreservation.bus.dto.BusDto;;

@Service("busService")
public class BusServiceImpl implements BusService {

	@Resource(name="busMapper")
	private BusMapper busMapper;
	
	@Override
	public BusDto getBusById(int id) {
		return busMapper.getBusById(id);
	}
	
	@Override
	public void reserveBusById(int id) {
		
	}
}
