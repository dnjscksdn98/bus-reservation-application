package egovframework.busreservation.member.exception;

public class IdExistsException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	private String message;
	
	public IdExistsException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
