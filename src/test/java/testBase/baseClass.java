package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
// for logger this are the main packages
import org.apache.logging.log4j.LogManager;//Log4j
import org.apache.logging.log4j.Logger;//Log4j

public class baseClass {
	// if we want to access the WebDriver throughout  the package then need to make as public 
	public WebDriver driver;
//	public Logger logger;// log4j
	//public Properties p;
	//@Parameters({"os","browser"})
	//  base class only preferred the before class and after class 
	
	// along with Selenium  grid 
	@BeforeClass(groups={"rigression","rigression"})
	public void TC_001setUp()
	{
		
		//loading config.property file
		//FileReader file = new FileReader("./");
		//p=new Properties();
		//p.load(file);
		
		
		 /*/ logger=LogManager.getLogger(this.getClass());
		  switch(br.toLowerCase())
		  {
		  case "chrome": driver=new ChromeDriver(); break;
		  case "edge" : driver =new EdgeDriver(); break;
		  case "firefox": driver=new FirefoxDriver();break;
		  default : System.out.println("invalid browser"); return ; 
		  }	
		  */
	
		 driver = new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
         
	}
	 @AfterClass(groups={"rigression","rigression"})
	 public void tearDown()
	 {
		driver.close();
	 }

}
