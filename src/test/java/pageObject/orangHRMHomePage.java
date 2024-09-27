package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orangHRMHomePage extends basePage  {
	
	
	public orangHRMHomePage(WebDriver driver)
	{
        super(driver);
	}
	
	
 // locators
@FindBy(xpath="//input[@name='username']") 
WebElement txt_username ;
@FindBy(xpath="//input[@name='password']")
WebElement txtPassword;
@FindBy(xpath="//button[text()=' Login ']")
WebElement clicklogin;



public void SetUsername(String username)
{
txt_username.sendKeys(username);
}
public void SetPassword(String pass)
{
txtPassword.sendKeys(pass);
}
public void ClickLogin()
{
clicklogin.click();
}


}
