package TestCasesScripts;

import org.testng.annotations.Test;

import Util.ApplicationUtility;


public class HasDealsOfTheDay {
@Test(priority=3)
	public static void hasDealsOfTheDay() throws InterruptedException {
		// TODO Auto-generated method stub
		ApplicationUtility appUtility=new ApplicationUtility(); 
		appUtility.dealsOfTheDay();
	    System.out.println("*****Has deal of the day tc completed!");
	}

}
