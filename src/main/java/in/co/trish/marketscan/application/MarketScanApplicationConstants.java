package in.co.trish.marketscan.application;

public class MarketScanApplicationConstants {

	public static final String ACCEPTED_CONTENT_TYPE_VERSION_1 = "application/vnd.market-scan.v1+json";
	public static final String[] CLASSPATH_RESOURCE_LOCATIONS = {"classpath:/META-INF/resources/", "classpath:/resources/", "classpath:/static/", "classpath:/public/" };
	
	public static final String BAD_REQUEST = "Request is not valid, please check again!";
	public static final String METHOD_NOT_ALLOWED = "Requested service not exposed!";
	public static final String INTERNAL_SERVER_ERROR = "Server is unable to process the request due to some internal error!";
	
	public static final String PATTERN_VALID_MAC_ADDRESS = "^([a-fA-F0-9]{2}[:-]){5}[a-fA-F0-9]{2}$|^([a-fA-F0-9]{4}[.]){2}[a-fA-F0-9]{4}$";
	public static final String PATTERN_VALID_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	public static final String PATTERN_VALID_IP_ADDRESS = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

}
