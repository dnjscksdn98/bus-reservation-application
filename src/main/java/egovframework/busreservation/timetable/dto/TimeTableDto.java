package egovframework.busreservation.timetable.dto;

public class TimeTableDto {
	
	private int seqNo;
	private String startTime;
	private String endTime;
	private int busNo;
	
	public TimeTableDto() {
		
	}
	
	public TimeTableDto(int seqNo, String startTime, String endTime, int busNo) {
		super();
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
