package egovframework.busreservation.appointment.dto;

public class AppointmentDto {

	private int seqNo;  // 타임 테이블 일련 번호
	private int sectionNo;  // 구간 번호
	private String id;  // 회원 아이디
	private String startTime;  // 출발 시간
	
	public AppointmentDto() {
		
	}

	public AppointmentDto(int seqNo, int sectionNo, String id, String startTime) {
		this.seqNo = seqNo;
		this.sectionNo = sectionNo;
		this.id = id;
		this.startTime = startTime;
	}

	public int getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(int seqNo) {
		this.seqNo = seqNo;
	}

	public int getSectionNo() {
		return sectionNo;
	}

	public void setSectionNo(int sectionNo) {
		this.sectionNo = sectionNo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	
}
