package egovframework.busreservation.auth;

public class InvalidRoleException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	private String message;
	
	public InvalidRoleException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
