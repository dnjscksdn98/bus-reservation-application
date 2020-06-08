package egovframework.busreservation.auth;

public class InvalidAuthenticationException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	private String message;
	
	public InvalidAuthenticationException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
