package egovframework.busreservation.timetable.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import egovframework.busreservation.timetable.dto.TimeTableDto;

public interface TimeTableService {

	public List<TimeTableDto> getTimeTable(String time, int start, int end);
	
	public TimeTableDto getTimeTableById(int id);
	
	public int getCountByTime(String time);
	
	public int findTimeTableByTime(String time);
	
	public String findTimeTableBySeqNo(int seqNo);
	
	public void createTimeTable(TimeTableDto resource, HttpSession session);
}
