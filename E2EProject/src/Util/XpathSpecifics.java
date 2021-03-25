package Util;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import TestCasesScripts.*;

public class XpathSpecifics extends TestBase{
	
	 XpathSpecifics() {
		// TODO Auto-generated constructor stub
		TestBase tb=new TestBase();

	}

	
	//skiploginEle xpath
	public WebElement skiploginEle() {

		By skiplogin=By.xpath("//div[@class='_2QfC02']/button");		
		return driver.findElement(skiplogin);
		
	}
	
	//deals Of The day
	public WebElement dealsOfTheDayText() {

		By dealsOfTheDayTitle=By.xpath("//h2[text()='Deals of the Day']");		
		return driver.findElement(dealsOfTheDayTitle);
		
	}
	
	//trending offers
	public WebElement trendingoffersText() {

		By dealsOfTheDayTitle=By.xpath("(//div[@class='_3E8aIl KdL3Vb'])[4]/div/div/h2[contains(text(),'Trending Offers')]");		
		return driver.findElement(dealsOfTheDayTitle);
		
	}

	//deals Of The day view all
		public WebElement dealsOfTheDayViewAll() {

			By dealsOfTheDayTitle=By.xpath("//h2[text()='Deals of the Day']/following-sibling::div[2]/a[text()='VIEW ALL']");		
			return driver.findElement(dealsOfTheDayTitle);
			
		}

}

