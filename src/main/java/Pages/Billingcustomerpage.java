package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Billingcustomerpage extends PageBase
{

	public Billingcustomerpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// SelectedCust_NameAr assert is disabled
	@FindBy(id="SelectedCust")
	public WebElement  SelectedCust_NameAr;

	@FindBy(id="DateFrom")
	public WebElement  DateFrom;
	public void enterserachbydateform(String value1) 
	{
		EnterValue(DateFrom, value1);
		DateFrom.sendKeys(Keys.TAB);				
	}

	@FindBy(id="DateTo")
	public WebElement  DateTo;
	public void enterserachbydateto(String value2) 
	{
		EnterValue(DateTo, value2);
		DateTo.sendKeys(Keys.TAB);				
	}

	// حالة السداد كومبو
	@FindBy(id="BillStatusId")
	public WebElement BillStatusId;
	public void selectbillstatus(String text) 
	{
		SelectBytext(BillStatusId, text);
	}

	@FindBy(id="btnSearch")
	public WebElement btnSearch;
	// طباعة الكشف الاجمالى
	@FindBy(id="btnPrint")
	public WebElement btnPrint;
	public void searchandprintbill() throws InterruptedException 
	{
		clickbutton(btnSearch);
		Thread.sleep(2000);
		clickbutton(btnPrint);
	}





}
