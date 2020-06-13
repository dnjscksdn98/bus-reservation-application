package egovframework.busreservation.timetable.dto;

public class TimeTableDto {
	
	private int seqNo;
	private String tableMonth;
	private String tableDay;
	private String tableTime;
	private String startTime;
	private String endTime;
	private int busNo;
	
	public TimeTableDto() {
		
	}
	
	public TimeTableDto(String tableMonth, String tableDay, String tableTime, String endTime, int busNo) {
		this.tableMonth = tableMonth;
		this.tableDay = tableDay;
		this.tableTime = tableTime;
		this.endTime = endTime;
		this.busNo = busNo;
	}
	
	public TimeTableDto(int seqNo, String startTime, String endTime, int busNo) {
		this.seqNo = seqNo;
		this.startTime = startTime;
		this.endTime = endTime;
		this.busNo = busNo;
	}

	public int getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(int seqNo) {
		this.seqNo = seqNo;
	}
	
	public String getMonth() {
		return tableMonth;
	}

	public void setMonth(String month) {
		this.tableMonth = month;
	}

	public String getDay() {
		return tableDay;
	}

	public void setDay(String day) {
		this.tableDay = day;
	}

	public String getTime() {
		return tableTime;
	}

	public void setTime(String time) {
		this.tableTime = time;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public int getBusNo() {
		return busNo;
	}

	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}

}
