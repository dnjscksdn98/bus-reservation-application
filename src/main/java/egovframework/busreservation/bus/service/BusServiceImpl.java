package egovframework.busreservation.bus.service;

import java.util.List;

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
	public List<BusDto> getBuses() {
		return busMapper.getBuses();
	}
}
