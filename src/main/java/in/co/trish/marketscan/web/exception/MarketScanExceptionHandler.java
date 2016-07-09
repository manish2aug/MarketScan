package in.co.trish.marketscan.web.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import in.co.trish.marketscan.web.MarketScanResponseMessage;

@ControllerAdvice
public class MarketScanExceptionHandler extends ResponseEntityExceptionHandler {

	protected static final Logger logger = LoggerFactory.getLogger(MarketScanExceptionHandler.class);;

	@Autowired
	MarketScanResponseMessage response;

	/*@ExceptionHandler(Exception.class)
	ResponseEntity<Object> handleApplicationException(Exception ex, WebRequest request) {
		if(ex instanceof MarketScanBadRequestException){
			return getErrorResponseEntity(ex, "Invalid method", HttpStatus.BAD_REQUEST, request);
		}
		return getErrorResponseEntity(ex, "Invalid method", HttpStatus.BAD_REQUEST, request);
	}*/

	@ExceptionHandler(MarketScanMethodNotAllowedException.class)
	ResponseEntity<Object> handleMarketScanMethodNotAllowedException(RuntimeException ex, WebRequest request) {
		return getErrorResponseEntity(ex, HttpStatusCodeMessage.METHOD_NOT_ALLOWED, request);
	}
	
	@ExceptionHandler(MarketScanBadRequestException.class)
	ResponseEntity<Object> handleMarketScanBadRequestException(RuntimeException ex, WebRequest request) {
		return getErrorResponseEntity(ex, HttpStatusCodeMessage.BAD_REQUEST, request);
	}
	
	@ExceptionHandler(MarketScanInternalServerErrorException.class)
	ResponseEntity<Object> handleMarketScanInternalServerErrorException(RuntimeException ex, WebRequest request) {
		return getErrorResponseEntity(ex, HttpStatusCodeMessage.BAD_REQUEST, request);
	}
	
	@ExceptionHandler(Exception.class)
	ResponseEntity<Object> handleGenericException(RuntimeException ex, WebRequest request) {
		return getErrorResponseEntity(ex, HttpStatusCodeMessage.INTERNAL_SERVER_ERROR, request);
	}

	private HttpHeaders getHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		return headers;
	}

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		return getErrorResponseEntity(ex, HttpStatusCodeMessage.BAD_REQUEST, request);
	}
	
	private ResponseEntity<Object> getErrorResponseEntity(Exception ex, HttpStatusCodeMessage httpStatusCodeMessage, WebRequest request) {
		logger.error("Exception captured", ex);
		response.setStatus("Error");
		response.setDetail(httpStatusCodeMessage.message());
		return handleExceptionInternal(ex, response, getHeaders(), httpStatusCodeMessage.httpStatus(), request);
	}
	
}
