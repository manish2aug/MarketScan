package in.co.trish.marketscan.web.exceptions;

public class MarketScanMethodNotAllowedException extends RuntimeException {
	
	private static final long serialVersionUID = 2791912466297760531L;

	public MarketScanMethodNotAllowedException() {
		super();
	}
	
	public MarketScanMethodNotAllowedException(String message) {
		super(message);
	}
	
	public MarketScanMethodNotAllowedException(String message, Throwable cause) {
		super(message, cause);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	@Override
	public String getMessage() {
		return super.getMessage();
	}
	
}
