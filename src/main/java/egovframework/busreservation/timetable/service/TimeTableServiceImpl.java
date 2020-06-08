package egovframework.busreservation.timetable.service;

import java.util.List;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import egovframework.busreservation.timetable.dto.TimeTableDto;


@Service("timeTableService")
public class TimeTableServiceImpl implements TimeTableService {

	@Resource(name="timeTableMapper")
	private TimeTableMapper timeTableMapper;
	
	@Override
	public List<TimeTableDto> getTimeTable(String time, int start, int end) {
		return timeTableMapper.getTimeTable(time, start, end);
	}
	
	@Override
	public TimeTableDto getTimeTableById(int id) {
		return timeTableMapper.getTimeTableById(id);
	}
	
	@Override
	public int getCountByTime(String time) {
		return timeTableMapper.getCountByTime(time);
	}
}
