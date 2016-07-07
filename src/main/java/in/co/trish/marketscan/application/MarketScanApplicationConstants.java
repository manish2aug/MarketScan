package in.co.trish.marketscan.application;

public class MarketScanApplicationConstants {

	public static final String ACCEPTED_CONTENT_TYPE_VERSION_1 = "application/vnd.market-scan.v1+json";
	public static final String[] CLASSPATH_RESOURCE_LOCATIONS = {"classpath:/META-INF/resources/", "classpath:/resources/", "classpath:/static/", "classpath:/public/" };
	
	public static final String BAD_REQUEST = "Request is not valid, please check again!";
	public static final String METHOD_NOT_ALLOWED = "Requested service not exposed!";
	public static final String INTERNAL_SERVER_ERROR = "Server is unable to process the request due to some internal error!";
}
