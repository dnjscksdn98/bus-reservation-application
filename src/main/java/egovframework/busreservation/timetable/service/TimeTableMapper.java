package egovframework.busreservation.timetable.service;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

import egovframework.busreservation.timetable.dto.TimeTableDto;

@Repository("timeTableMapper")
public class TimeTableMapper extends EgovAbstractMapper {

	public List<TimeTableDto> getTimeTable(String time, int start, int end) {
		Map<String, Object> map = new HashMap<>();
		map.put("time", time);
		map.put("start", start);
		map.put("end", end);
		
		return selectList("TimeTableMapper.getTimeTable", map);
	}
	
	public TimeTableDto getTimeTableById(int id) {
		return selectOne("TimeTableMapper.getTimeTableById", id);
	}
	
	public int getCountByTime(String time) {
		return selectOne("TimeTableMapper.getCountByTime", time);
	}
	
	public int findTimeTableByTime(String time) {
		return selectOne("TimeTableMapper.findTimeTableByTime", time);
	}
	
	public String findTimeTableBySeqNo(int seqNo) {
		return selectOne("TimeTableMapper.findTimeTableBySeqNo", seqNo);
	}
}
