package in.co.trish.marketscan.web.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class MarketScanExceptionHandler extends ResponseEntityExceptionHandler {
	
	protected static final Logger logger = LoggerFactory.getLogger(MarketScanExceptionHandler.class);;
	
	@ExceptionHandler(MarketScanBadRequestException.class)
	@ResponseBody
	ResponseEntity<Object> handleBadRequest(RuntimeException ex, WebRequest request) {
		logger.error("Exception captured", ex);
		return handleExceptionInternal(ex, new ExceptionMessage("Ip address is mandatory"), new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
	}
	
	@Override
	protected ResponseEntity<Object> handleNoHandlerFoundException(NoHandlerFoundException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
		// TODO Auto-generated method stub
		return super.handleNoHandlerFoundException(ex, headers, status, request);
	}
}
