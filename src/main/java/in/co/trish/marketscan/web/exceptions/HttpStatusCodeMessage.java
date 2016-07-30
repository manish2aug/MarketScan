package in.co.trish.marketscan.web.exceptions;

import org.springframework.http.HttpStatus;

import in.co.trish.marketscan.application.MarketScanApplicationConstants;

public enum HttpStatusCodeMessage {
	BAD_REQUEST,
	METHOD_NOT_ALLOWED,
    INTERNAL_SERVER_ERROR;

    String message() {
        switch (this) {
            case BAD_REQUEST:
                return MarketScanApplicationConstants.BAD_REQUEST;
            case METHOD_NOT_ALLOWED:
                return MarketScanApplicationConstants.METHOD_NOT_ALLOWED;
            case INTERNAL_SERVER_ERROR:
                return MarketScanApplicationConstants.INTERNAL_SERVER_ERROR;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    }

    HttpStatus httpStatus() {
    	switch (this) {
    	case BAD_REQUEST:
    		return HttpStatus.BAD_REQUEST;
    	case METHOD_NOT_ALLOWED:
    		return HttpStatus.METHOD_NOT_ALLOWED;
    	case INTERNAL_SERVER_ERROR:
    		return HttpStatus.INTERNAL_SERVER_ERROR;
    	default:
    		throw new AssertionError("Unknown operations " + this);
    	}
    }
}
