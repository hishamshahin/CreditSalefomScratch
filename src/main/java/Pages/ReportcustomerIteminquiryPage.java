
// PROJECT NAME  : SAUDI POST OFFICE TESTING
// MODULE NAME   : TESTING
// PAGE NAME     : تقرير البعائث الصادرة
// CREATION DATE : 16/5/2019
// CREATED BY    : HISHAM SHAHIN
// PAGE DESC : ALL ELEMNET OF PAGE
// MODIFIED BY   : 
// MODIFIED DATE : 
package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReportcustomerIteminquiryPage extends PageBase
{

	public ReportcustomerIteminquiryPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(css="input.form-control.datepicker.FormDate")
	WebElement FormDate;
	
	@FindBy(css="input.form-control datepicker ToDate")
	WebElement ToDate;
	
	@FindBy(id="SearchButton")
	WebElement SearchButton;
	
	@FindBy(css="printButton")
	WebElement printButton;
	
	public void enterserachdate(String value1, String value2)
	{
		EnterValue(FormDate, value1);
		EnterValue(ToDate, value2);
		clickbutton(SearchButton);
		clickbutton(printButton);
	}
	
	@FindBy(className="SubUser select2-hidden-accessible")
	WebElement subuserdropdown;
	public void selcteusbuser(String selection)
	{
		SelectBytext(subuserdropdown, selection);
		clickbutton(SearchButton);
		clickbutton(printButton);
	}
	
	@FindBy(className="ItemDeliveryStatus select2-hidden-accessible")
	WebElement itemstatedropdown;
	public void selcteitemstate(String selection1)
	{
		SelectBytext(itemstatedropdown, selection1);
		clickbutton(SearchButton);
		clickbutton(printButton);
	}
	
	@FindBy(css="input.form-control.StatementBarcode")
	WebElement StatementBarcode;
	public void enterbarcodestatment(String text)
	{
		EnterValue(StatementBarcode, text);
	}
	
	


}
