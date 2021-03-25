package Util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import TestCasesScripts.*;

public class RunnerClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiruraja\\E2EPracticeWorkspace\\E2EProject\\chromedriver.exe");
		
		NavigateToFlipkart navigate= new NavigateToFlipkart();
		navigate.navigateToFlipkart();
		
		SkipLogin skiplogin=new SkipLogin();
		skiplogin.skipLogin();
		
		HasDealsOfTheDay hasDeals= new HasDealsOfTheDay();
		hasDeals.hasDealsOfTheDay();
		
		//TrendingOffers trendoffers=new TrendingOffers();
		//trendoffers.trendingOffersheading();
		
		DealOfTheDayViewall dealViewAll=new DealOfTheDayViewall();
		dealViewAll.dealOfTheDayViewall();
		Thread.sleep(5000);
	}

}
