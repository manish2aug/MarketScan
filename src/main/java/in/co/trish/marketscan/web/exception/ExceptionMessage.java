package in.co.trish.marketscan.web.exception;

public class ExceptionMessage {
	
	private String error;
	
	public ExceptionMessage(String error) {
		this.error = error;
	}
	
	/**
	 * @return the error
	 */
	public String getError() {
		return error;
	}
	
}
