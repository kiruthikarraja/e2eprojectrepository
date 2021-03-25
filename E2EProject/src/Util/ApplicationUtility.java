package Util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ApplicationUtility  extends TestBase{
    XpathSpecifics xpathlist=new XpathSpecifics();

	 public ApplicationUtility() {
		TestBase testbase=new TestBase();
		// TODO Auto-generated constructor stub
	}


	public void navigateFlipkart() {
		// TODO Auto-generated method stub

	System.out.println("1.navigateFlipkart?");
	driver.get("https://www.flipkart.com/");
    System.out.println("Done  navigation-application utility");
	}

	public void skipLogin() {
		// TODO Auto-generated method stub
	System.out.println("2.skiplogin?");
    xpathlist.skiploginEle().click();
    System.out.println("Done ApplicationUtility-skip login");
	}	

	public void dealsOfTheDay() throws InterruptedException
	{
		System.out.println("3.Deals of the day exists?");		
	    if(xpathlist.dealsOfTheDayText().isDisplayed()) 
	    	System.out.println("Deals of the day displaying");
	    else
	    	System.out.println("Deals of the day NOT displaying");
	    Thread.sleep(8000);	}

	public void trendingOffers() throws InterruptedException
	{
		System.out.println("4.Trending offers there?");		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1600)");

        if(driver.getPageSource().contentEquals("Trending Offers"))
        	System.out.println("TRUE");

	    if(xpathlist.trendingoffersText().isDisplayed()) 
	    	System.out.println("trending Offers displaying");
	    else
	    	System.out.println("trendingOffers NOT displaying");
	}
	
	public void DealOfThedayViewall() throws InterruptedException
	{
		System.out.println("4.Deals of the day viewALl there?");
		
		Actions a =new Actions(driver);
		a.doubleClick(xpathlist.dealsOfTheDayText()).build().perform();
		Thread.sleep(7000);
		if (xpathlist.dealsOfTheDayViewAll().getText()=="VIEW ALL") {
		a.moveToElement(xpathlist.dealsOfTheDayViewAll()).click().build().perform();
		System.out.println("dealsOfTheDayViewAll list selected");}
	}
	
	
	}


