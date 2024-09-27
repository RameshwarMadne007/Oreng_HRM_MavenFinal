package testCases;
import org.testng.Assert;

import org.testng.annotations.Test;

import pageObject.dashbord_OrangHRM;
import pageObject.orangHRMHomePage;
import testBase.baseClass;

  public class TC_001oginToApplication extends baseClass {

	   @Test(groups="rigression")
   public void Login_orengHRM()
  {
		   
		//   logger.info("*****starting test case*****");
	orangHRMHomePage hp=new orangHRMHomePage(driver);
	hp.SetUsername("Admin");
	hp.SetPassword("admin123");
	 //logger.info("*****click login*****");
	hp.ClickLogin();

 
 
	   
		   
	   
		// logger.info("*****verify the result as expected *****");
	   dashbord_OrangHRM verify=new dashbord_OrangHRM(driver);
	  Object res = verify.dashbord();
	  Assert.assertEquals(res,true);
	   }
	  /*/ catch(Exception e)
	   {
		   logger.error("test failed ");
		   logger.debug("debug the logs..");
		   Assert.fail();
	}
	   logger.info("*****finish tstcase *****"); 
   }
   */
  
   

 }
