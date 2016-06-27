package in.co.trish.marketscan.application;

public class MarketScanUtils {

	public static double distanceInMeter(double lat1, double lon1, double lat2, double lon2) {
		int EARTH_RADIUS_KM = 6371;
		double lat1Rad = Math.toRadians(lat1);
		double lat2Rad = Math.toRadians(lat2);
		double deltaLonRad = Math.toRadians(lon2 - lon1);

		return Math.acos(
				Math.sin(lat1Rad) * Math.sin(lat2Rad) + Math.cos(lat1Rad) * Math.cos(lat2Rad) * Math.cos(deltaLonRad))
				* EARTH_RADIUS_KM * 1000;
	}

}
