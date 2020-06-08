package egovframework.busreservation.section.exception;

public class InvalidSectionException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	private String message;
	
	public InvalidSectionException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
