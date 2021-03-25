package TestCasesScripts;

import org.testng.annotations.Test;

import Util.ApplicationUtility;

public class SkipLogin {
@Test (priority=2)
public  void skipLogin() {
		// TODO Auto-generated method stub
		ApplicationUtility appUtility=new ApplicationUtility(); 
		appUtility.skipLogin();
	    System.out.println("******Skip Logged in tcs successfully!");	}

}
