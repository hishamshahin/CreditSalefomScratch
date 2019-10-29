package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IteminquiryPage extends PageBase
{

	public IteminquiryPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	// رقم البعيثة
	@FindBy(id="itemBarcodeText")
	WebElement itemBarcodeText;
	// الرقم المرجعى
	@FindBy(id="ReferenceIdText")
	WebElement ReferenceIdText;

	@FindBy(id="btnSearch")
	WebElement btnSearch;

	public void iteminqurysearch(String value1, String value2) throws InterruptedException
	{
		EnterValue(itemBarcodeText, value1);
		EnterValue(ReferenceIdText, value2);
		Thread.sleep(2000);
		clickbutton(btnSearch);
	}

	// assert على رقم البعيثة المدخل 
	@FindBy(xpath="//*[@id=\"tableContent\"]/tr/td[1]")
	public WebElement itembarcode;

	// طباعة البوليصة العادية 
	@FindBy(xpath="//*[@id=\"tableContent\"]/tr/td[9]/a[1]")
	WebElement print1;

	// طباعة البوليصة الزيبرا 
	@FindBy(xpath="//*[@id=\"tableContent\"]/tr/td[9]/a[2]")
	WebElement print2;
	public void Print1resultofserch() throws InterruptedException
	{
		clickbutton(print1);
		
	}	
	public void Printr2esultofserch() throws InterruptedException
	{
		clickbutton(print2);
		
	}




}
