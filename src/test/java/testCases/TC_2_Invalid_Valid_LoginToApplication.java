package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.dashbord_OrangHRM;
import pageObject.orangHRMHomePage;
import testBase.baseClass;

public class TC_2_Invalid_Valid_LoginToApplication extends baseClass{
	
	@Test(groups="sanity")
	public void login()
	{
		
			
		
		//logger.info("****starting test case***");
		orangHRMHomePage oh=new orangHRMHomePage(driver);
		oh.SetUsername("Admin");
		oh.SetPassword("admin123");
		oh.ClickLogin();

		dashbord_OrangHRM doh=new dashbord_OrangHRM(driver);
		Object res1 = doh.dashbord();
		Assert.assertEquals(res1, true);
		
		//logger.info("****finish***");
	
		
	}
	
}
