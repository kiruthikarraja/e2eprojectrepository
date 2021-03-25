package TestCasesScripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Util.ApplicationUtility;

public class NavigateToFlipkart {

 @Test(priority=1)
	public static void navigateToFlipkart() {
		// TODO Auto-generated method stub
		
		ApplicationUtility appUtility=new ApplicationUtility(); 
		appUtility.navigateFlipkart();
	    System.out.println("****Navigation to flipkart done testcase java file!");

	}

}
