package co.in.trish.marketscan.application;

import org.junit.Test;

import in.co.trish.marketscan.application.MarketScanUtils;

public class MarketScanUtilsTest {
	
	@Test
	public void testDistanceFormula() {
		double distanceInMeter = MarketScanUtils.distanceInMeter(025.8597922,28.1767133, 25.8543822,28.190323300);
		System.out.println(distanceInMeter);
	}
}
