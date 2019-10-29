
// PROJECT NAME  : SAUDI POST OFFICE TESTING
// MODULE NAME   : TESTING
// PAGE NAME     : تقرير البعائث الصادرة
// CREATION DATE : 16/5/2019
// CREATED BY    : HISHAM SHAHIN
// PAGE DESC : ALL ELEMNET OF PAGE
// MODIFIED BY   : 
// MODIFIED DATE : 
package Pages;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.FindBy;

public class ReportcustomerIteminquiryPage extends PageBase
{

	public ReportcustomerIteminquiryPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(css="input.form-control.datepicker.FormDate")
	WebElement FormDate;

	@FindBy(xpath="//*[@id=\"ItemsSearch\"]/div/div/div[2]/input")
	WebElement ToDate;

	@FindBy(id="SearchButton")
	WebElement SearchButton;

	@FindBy(id="printButton")
	WebElement printButton;
	public void clickprintBTN()
	{
		clickbutton(printButton);
	}

	@FindBy(css="table.table-condensed")
	WebElement calendertable1;
	public void serachbyformdate(String value1) 
	{
		EnterValue(FormDate, value1);
		FormDate.sendKeys(Keys.TAB);				
	}	

	public void serachbytodate(String value2)
	{
		EnterValue(ToDate, value2);
		ToDate.sendKeys(Keys.TAB);
		clickbutton(SearchButton);
	}

	// assert item in grid
	@FindBy(xpath="//*[@id=\"itemTD\"]/tbody/tr[1]/td[10]")
	public WebElement dateofexport;

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
	// barcode search
	@FindBy(css="input.form-control.StatementBarcode")
	WebElement StatementBarcode;
	public void enterbarcodestatment(String text)
	{
		EnterValue(StatementBarcode, text);
	}

	// export excel
	@FindBy(css="button.btn.btn-primary.btn_Permission.downLoad")
	public WebElement ExcelxportBTN;
	public void clickExcelxportBTN() throws InterruptedException
	{		
		clickbutton(ExcelxportBTN);
		Thread.sleep(3000);				
	}
	// download file from chrome
	public static String downloadPath = System.getProperty("user.dir")+"\\Downloads";

	public static ChromeOptions DownloadchromeOption() 
	{
		ChromeOptions options = new ChromeOptions();
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default.content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadPath);
		options.setExperimentalOption("prefs", chromePrefs);
		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		return options ; 		
	}




}
