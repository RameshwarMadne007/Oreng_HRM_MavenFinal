package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class dashbord_OrangHRM extends basePage{

	public dashbord_OrangHRM(WebDriver driver) {
		super(driver);
	}

 @FindBy(xpath="//span[text()='Dashboard']")
  WebElement dashbord_Visibality;
public Object dashbord()
{
	boolean res = dashbord_Visibality.isDisplayed();
	return res;
}
}