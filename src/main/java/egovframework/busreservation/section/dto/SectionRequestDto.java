package egovframework.busreservation.section.dto;

public class SectionRequestDto {

	private int seqNo;  // 타임 테이블 구간 번호
	private String startTime;  // 출발 시간
	private String startCd;  // 출발지 코드
	private String endCd;  // 도착지 코드
	
	public SectionRequestDto() {
		
	}
	
	public SectionRequestDto(int seqNo, String startTime, String startCd, String endCd) {
		this.seqNo = seqNo;
		this.startTime = startTime;
		this.startCd = startCd;
		this.endCd = endCd;
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

	public String getStartCd() {
		return startCd;
	}

	public void setStartCd(String startCd) {
		this.startCd = startCd;
	}

	public String getEndCd() {
		return endCd;
	}

	public void setEndCd(String endCd) {
		this.endCd = endCd;
	}
	
}
