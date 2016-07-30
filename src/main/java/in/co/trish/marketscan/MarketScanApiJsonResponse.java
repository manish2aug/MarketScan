package in.co.trish.marketscan;

import java.util.Collection;

import in.co.trish.marketscan.web.resources.read.MarketScanReadRepresentation;
//TODO: all response should be returned in this form
public class MarketScanApiJsonResponse {
	
	private String status;
	private String status_code;
	private String success_message;
	private String error_message;
	private Collection<? extends MarketScanReadRepresentation> results;
	
	public String getSuccess_message() {
		return success_message;
	}
	
	public void setSuccess_message(String success_message) {
		this.success_message = success_message;
	}
	
	public String getError_message() {
		return error_message;
	}
	
	public void setError_message(String error_message) {
		this.error_message = error_message;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getStatus_code() {
		return status_code;
	}
	
	public void setStatus_code(String status_code) {
		this.status_code = status_code;
	}
	
	public Collection<? extends MarketScanReadRepresentation> getResults() {
		return results;
	}
	
	public void setResults(Collection<? extends MarketScanReadRepresentation> results) {
		this.results = results;
	}
	
}
