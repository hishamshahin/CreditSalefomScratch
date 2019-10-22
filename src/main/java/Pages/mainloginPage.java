package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class mainloginPage extends PageBase
{

	public mainloginPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id="UserName")
	 WebElement usernametxt ;
	
	@FindBy(id="Password")
	WebElement passwordtxt;
	
	@FindBy(id="Submit1")
	WebElement submit;
	
	public void login (String username,String password) 
	{
		usernametxt.sendKeys(username);
		passwordtxt.sendKeys(password);
		submit.click();
	}
	
	
	

}
