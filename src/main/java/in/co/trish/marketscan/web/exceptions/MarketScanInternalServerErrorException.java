package in.co.trish.marketscan.web.exceptions;

public class MarketScanInternalServerErrorException extends RuntimeException {
	
	private static final long serialVersionUID = 2791912466297760531L;

	public MarketScanInternalServerErrorException() {
		super();
	}
	
	public MarketScanInternalServerErrorException(String message) {
		super(message);
	}
	
	public MarketScanInternalServerErrorException(String message, Throwable cause) {
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
