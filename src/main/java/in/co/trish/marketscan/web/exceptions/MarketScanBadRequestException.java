package in.co.trish.marketscan.web.exceptions;

public class MarketScanBadRequestException extends RuntimeException {
	
	private static final long serialVersionUID = 2791912466297760531L;

	public MarketScanBadRequestException() {
		super();
	}
	
	public MarketScanBadRequestException(String message) {
		super(message);
	}
	
	public MarketScanBadRequestException(String message, Throwable cause) {
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
