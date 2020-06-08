package egovframework.busreservation.timetable.exception;

public class InvalidTimeTableException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	private String message;
	
	public InvalidTimeTableException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
