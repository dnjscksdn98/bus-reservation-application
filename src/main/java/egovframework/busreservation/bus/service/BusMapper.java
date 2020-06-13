package egovframework.busreservation.bus.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

import egovframework.busreservation.bus.dto.BusDto;

@Repository("busMapper")
public class BusMapper extends EgovAbstractMapper {

	public BusDto getBusById(int id) {
		return selectOne("BusMapper.getBusById", id);
	}
	
	public List<BusDto> getBuses() {
		return selectList("BusMapper.getBuses");
	}
}
