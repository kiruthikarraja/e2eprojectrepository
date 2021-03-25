package TestCasesScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Util.ApplicationUtility;

public class TrendingOffers {
@Test(enabled= false)
	public static void trendingOffersheading() throws InterruptedException {
		// TODO Auto-generated method stub
	    System.out.println("Starting TrendingOffers");
		ApplicationUtility appUtility=new ApplicationUtility(); 
		appUtility.trendingOffers();
	    System.out.println("****trending offers testcase java file!");
	}

}
