package egovframework.busreservation.timetable.service;

import java.util.List;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import egovframework.busreservation.timetable.dto.TimeTableDto;
import egovframework.busreservation.timetable.exception.InvalidTimeTableException;


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
		TimeTableDto timetable = timeTableMapper.getTimeTableById(id);
		if(timetable == null) {
			// TODO: 에러 페이지 꾸미기
			throw new InvalidTimeTableException("존재하지 않는 타임 테이블입니다");
		}
		return timetable;
	}
	
	@Override
	public int getCountByTime(String time) {
		return timeTableMapper.getCountByTime(time);
	}
	
	@Override
	public int findTimeTableByTime(String time) {
		return timeTableMapper.findTimeTableByTime(time);
	}
	
	@Override
	public String findTimeTableBySeqNo(int seqNo) {
		return timeTableMapper.findTimeTableBySeqNo(seqNo);
	}
	
	@Override
	public void createTimeTable(TimeTableDto resource, HttpSession session) {
		String startTime = "2020" + resource.getTableMonth() + resource.getTableDay() + resource.getTableTime();
		timeTableMapper.createTimeTable(startTime, resource.getEndTime(), resource.getBusNo());
	}
}
