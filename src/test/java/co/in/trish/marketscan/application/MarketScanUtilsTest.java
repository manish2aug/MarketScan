package co.in.trish.marketscan.application;

import java.text.NumberFormat;
import java.util.Locale;

import javax.money.MonetaryAmount;
import javax.money.format.MonetaryAmountFormat;
import javax.money.format.MonetaryFormats;

import org.javamoney.moneta.Money;
import org.junit.Assert;
import org.junit.Test;

import in.co.trish.marketscan.application.MarketScanUtils;

public class MarketScanUtilsTest {
	
	@Test
	public void testDistanceFormula() {
		double distanceInMeter = MarketScanUtils.distanceInMeter(025.8597922,28.1767133, 25.8543822,28.190323300);
		System.out.println(distanceInMeter);
	}
	
	@Test
	public void testRegexForMacAddress() {
		Assert.assertTrue(MarketScanUtils.isValidMacAddress("abcd.f123.4980"));
	}
	
	@Test
	public void testMoney() {
		
		MonetaryAmount monetaryAmount = Money.of(12345.67, NumberFormat.getCurrencyInstance(Locale.getDefault()).getCurrency().getCurrencyCode());
		MonetaryAmountFormat format = MonetaryFormats.getAmountFormat(Locale.getDefault());
		System.out.println(format.format(monetaryAmount));
		
	}
	
	
}
