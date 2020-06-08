package egovframework.busreservation.timetable.service;

import java.util.List;

import egovframework.busreservation.timetable.dto.TimeTableDto;

public interface TimeTableService {

	public List<TimeTableDto> getTimeTable(int start, int end);
	
	public TimeTableDto getTimeTableById(int id);
}
