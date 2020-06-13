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
	
	public String getTableMonth() {
		return tableMonth;
	}

	public void setTableMonth(String tableMonth) {
		this.tableMonth = tableMonth;
	}

	public String getTableDay() {
		return tableDay;
	}

	public void setTableDay(String tableDay) {
		this.tableDay = tableDay;
	}

	public String getTableTime() {
		return tableTime;
	}

	public void setTableTime(String tableTime) {
		this.tableTime = tableTime;
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
