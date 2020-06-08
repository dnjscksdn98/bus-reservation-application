package egovframework.busreservation.section.dto;

public class SectionResponseDto {

	private int sectionNo;  // 구간 번호
	private String startCd;  // 출발지 코드
	private String endCd;  // 도착지 코드
	private int time;  // 걸리는 시간
	
	public SectionResponseDto() {
		
	}
	
	public SectionResponseDto(int sectionNo, String startCd, String endCd, int time) {
		this.sectionNo = sectionNo;
		this.startCd = startCd;
		this.endCd = endCd;
		this.time = time;
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

	public int getSectionNo() {
		return sectionNo;
	}

	public void setSectionNo(int sectionNo) {
		this.sectionNo = sectionNo;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
	
}
