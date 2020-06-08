package egovframework.busreservation.bus.dto;

public class BusDto {
	
	private int busNo;
	private String busName;
	private int seatCnt;
	private int mileage;
	
	public BusDto() {
		
	}
	
	public BusDto(int busNo, String busName, int seatCnt, int mileage) {
		this.busNo = busNo;
		this.busName = busName;
		this.seatCnt = seatCnt;
		this.mileage = mileage;
	}

	public int getBusNo() {
		return busNo;
	}

	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public int getSeatCnt() {
		return seatCnt;
	}

	public void setSeatCnt(int seatCnt) {
		this.seatCnt = seatCnt;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
}
