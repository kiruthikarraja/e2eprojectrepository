package TestCasesScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Util.ApplicationUtility;

public class DealOfTheDayViewall {
@Test (priority=4)
	public static void dealOfTheDayViewall() throws InterruptedException {
		// TODO Auto-generated method stub
	    System.out.println("Starting DealOfTheDayViewall");
		ApplicationUtility appUtility=new ApplicationUtility(); 
		appUtility.DealOfThedayViewall();
	    System.out.println("****DealOfTheDayViewall testcase java file!");
	
	}

}
