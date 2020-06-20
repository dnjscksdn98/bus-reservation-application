package egovframework.busreservation.appointment.exception;

public class AppointmentDoesNotExistException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	private String message;
	
	public AppointmentDoesNotExistException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
