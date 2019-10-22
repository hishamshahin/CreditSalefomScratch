
// PROJECT NAME  : SAUDI POST OFFICE TESTING
// MODULE NAME   : TESTING
// PAGE NAME     : تسجيل بعيثة
// CREATION DATE : 16/5/2019
// CREATED BY    : HISHAM SHAHIN
// PAGE DESC : ALL ELEMNET OF PAGE
// MODIFIED BY   : 
// MODIFIED DATE : 
package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class Registeritempage extends PageBase
{
	public Select select ;

	public Registeritempage(WebDriver driver)
	{
		super(driver);

		//WebElement radiobtn = driver.findElement(By.id("Internal"));
		//radiobtn.click()	
	}

	// عنوان داخلى

	@FindBy(id="Internal")
	WebElement Internal;
	public void Internals ()
	{
		clickbutton(Internal);
	}

	// اسم الجهة

	@FindBy(id="NameReception")
	WebElement NameReception;
	public void enterNameReceptions (String name)
	{
		EnterValue(NameReception, name);

	}

	// رقم الجوال

	@FindBy(id="phoneNumb")
	public WebElement phoneNumb;
	public void enterphoneNumbs (String phonenums)
	{

		EnterValue(phoneNumb, phonenums);
	}

	// عنوان خارجى	
	// صندوق بريد

	@FindBy(id="MailBoxRadio")
	WebElement MailBox;
	public void clickMailBoxsradio ()
	{
		clickbutton(MailBox);
	}	



	@FindBy(id="MailBoxzipCode")
	WebElement zipCode;
	public void enterzipCode (String value)
	{
		EnterValue(zipCode, value);
	}

	@FindBy(id="MailPOBox")
	WebElement MailPOBox;
	public void enterMailPOBox (String value)
	{
		EnterValue(MailPOBox, value);
	}

	@FindBy(id="ContentTypeDll")
	WebElement selectbytext;
	public void seleccontentbytext(String text)
	{
		select = new Select(selectbytext);
		select.selectByVisibleText(text);
	}

	@FindBy(id="select2-CityDll-result-8456-43")
	WebElement cityselection;
	public void selectcitybytext(String text)
	{
		select = new Select(cityselection);
		select.selectByVisibleText(text);

	}

	// عنوان وطنى 
	@FindBy(id="NationalRadio")
	WebElement NationalRadio;
	public void clickNationalRadio ()
	{
		clickbutton(NationalRadio);
	}

	@FindBy(id="NationalZipCode")
	WebElement NationalZipCode;
	public void enterNationalZipCode (String value)
	{
		EnterValue(NationalZipCode, value);
	}

	@FindBy(id="NationalBuildingNo")
	WebElement NationalBuildingNo;
	public void enterNationalBuildingNo(String value)
	{
		EnterValue(NationalBuildingNo, value);
	}

	@FindBy(id="NationalAdditionalNum")
	WebElement NationalAdditionalNum;
	public void enterNationalAdditionalNum(String value)
	{
		EnterValue(NationalAdditionalNum, value);
	}

	@FindBy(id="NationalUnitNum")
	WebElement NationalUnitNum;
	public void enterNationalUnitNum (String value)
	{
		EnterValue(NationalUnitNum, value);
	}	

	// محطة طرود

	@FindBy(id="ParcelStationRadio")
	WebElement ParcelStationRadio;
	public void clickParcelStationRadio ()
	{
		clickbutton(ParcelStationRadio);
	}

	@FindBy(id="CityDll3")
	WebElement selectCityDll3bytext;
	public void selectCitylist(String text)
	{
		select = new Select(selectCityDll3bytext);
		select.selectByVisibleText(text);
	}

	@FindBy(id="ParcelStationId")
	WebElement selectParcelStationIdt;
	public void selectParcelStationbytext(String text)
	{
		select = new Select(selectParcelStationIdt);
		select.selectByVisibleText(text);
	}
	// تسليم مكاتب

	@FindBy(id="DeliveryOfficeRadio")
	WebElement DeliveryOfficeRadio;
	public void clickDeliveryOfficeRadio ()
	{
		clickbutton(DeliveryOfficeRadio);
	}

	@FindBy(id="CityDll4")
	WebElement selectCityDll4bytext;
	public void selectCityDll4ist(String text)
	{
		select = new Select(selectCityDll4bytext);		
		select.selectByVisibleText(text);

	}

	@FindBy(id="OffcieId")
	WebElement selectOffcieId;
	public void selectOffcieIdbytext(String text)
	{

		select = new Select(selectOffcieId);
		select.selectByVisibleText(text);

	}

	// عنوان وصفى
	@FindBy(id="InternalDescriptiveRadio")
	WebElement InternalDescriptiveRadio;
	public void clickInternalDescriptiveRadio ()
	{
		clickbutton(InternalDescriptiveRadio);
	}

	@FindBy(id="InternalDescriptiveDistrict")
	WebElement selectInternalDescriptiveDistrict;
	public void selectInternalDescriptiveDistrict(String text)
	{

		select = new Select(selectInternalDescriptiveDistrict);
		select.selectByVisibleText(text);

	}
	@FindBy(id="InternalDescriptiveCityDll")
	WebElement selectInternalDescriptiveCityDll;
	public void selectInternalDescriptiveCity(String text)
	{

		select = new Select(selectInternalDescriptiveCityDll);
		select.selectByVisibleText(text);

	}
	@FindBy(id="InternalDescriptiveStreetName")
	WebElement InternalDescriptiveStreetName;
	public void enterInternalDescriptiveStreetName (String value)
	{
		EnterValue(InternalDescriptiveStreetName, value);
	}


	// عنوان خارجى

	@FindBy(id="External")
	WebElement External;
	public void clickitemExternal ()
	{
		clickbutton(External);
	}

	@FindBy(id="ExternalCountryDll")
	WebElement selectExternalCountryDll;
	public void selecExternalCountry(String text)
	{
		select = new Select(selectExternalCountryDll);
		select.selectByVisibleText(text);
	}

	@FindBy(id="ExternalCityDll")
	WebElement selectExternalCityDll;
	public void selecExternalCity(String text)
	{
		select = new Select(selectExternalCityDll);
		select.selectByVisibleText(text);
	}

	// تسجيل بعيثة  طرود
	@FindBy(id="ItemTypeDll")
	WebElement selectItemTypeDll;
	public void selecItemtarad(String text)
	{
		select = new Select(selectItemTypeDll);
		select.selectByVisibleText(text);
	}



	//وزن البعيثة
	@FindBy(id="ItemWeight")
	WebElement ItemWeight;
	public void enteritem (String value)
	{
		EnterValue(ItemWeight, value);
	}
	// حفظ
	@FindBy(id="SaveButton")
	WebElement Save;
	public void SaveButton ()
	{
		clickbutton(Save);
	}
	// تكوين كشف
	@FindBy(id="CreateStatementBtn")
	WebElement CreateStatementBtn;
	public void clickCreateStatementBtn ()
	{
		clickbutton(CreateStatementBtn);
	}
	// تصدير
	@FindBy(id="btnExportStatements")
	public WebElement btnExportStatements;
	public void clickbtnExportStatements ()
	{
		clickbutton(btnExportStatements);
	}
	
	// assert element of barcode
	@FindBy(xpath="//*[@id=\"esdar\"]/div/div/div[2]/div/label")
	 public WebElement xportLBL;
	
	
	// طباعة
	
	/*public void switchtoiframe ()
	{
		//Alert alert = driver.switchTo().alert();
		//alert.accept();
		driver.switchTo().frame(iframe);		
		//driver.switchTo().defaultContent();				
	}*/
	
	// print ok
	@FindBy(css="button.btn.btn-primary") //id printstatementokbtn
	WebElement printstatementokbtn;
	public void clickprintstatementokbtn ()
	{
		clickbutton(printstatementokbtn);
	}
	@FindBy(xpath="/html/body/div[9]/div")
	public WebElement msgsucsess;
	
	
	@FindBy(className="select2-hidden-accessible")
	public WebElement arrengselect;
	public void selectnumberpage(String value)
	{
		select = new Select(arrengselect);
		select.selectByValue(value);
	}


	@FindBy(id="statementBarcode")
	WebElement statementBarcode;
	public void getrstatementBarcode ()
	{
		System.out.println();

	}


	 
	 static List<WebElement> GetItemFromTable;
	 public void GetDataCoulom() {
		 String[] textArray = new String[100];
		 GetItemFromTable = tableitem.findElements(By.tagName("tr"));
		 int i = 0;

		 for (WebElement row : GetItemFromTable) {
			 List<WebElement> cells = row.findElements(By.tagName("td"));
			 for (WebElement cell : cells) {
				 textArray[i] = cell.getText();
				 i++;
				 System.out.println();
			 }
		 }
	 }

	 @FindBy(id = "ItemsGrid")
	 public WebElement tableitem;
	 @FindBy(tagName="tr")
	 public List< WebElement> allrows;
	 @FindBy(tagName="td")
	 public List< WebElement> allcoulms;
	 
	 @FindBy(xpath="//*[@id=\"ItemsGrid\"]/thead/tr/th[2]")
	 public List< WebElement> col2;
	
	
	 public void getdatafromtable() 
	 {
		 // Get all Rows
		 System.out.println(allrows.size());
		 // Get data from each Row 
		 for(WebElement row : allrows) 
		 {
			 System.out.println(row.getText() + "\t");
			 /*for(WebElement col : allcoulms) 
			 {
				 System.out.println(col.getText()+"\t");
			 }*/
			 /*for (int i = 0; i < allrows.size(); i++) 
			 {*/
		 } 
		 for (int j = 0; j < col2.size(); j++) 
				 {
					col2.get(j).getText();
					
					
					
				}
				
			}

	 

	 @FindBy(id="searchCustomerBtn")
	 WebElement searchgeha;
	 public void searchbtngeha ()
	 {
		 clickbutton(searchgeha);
	 }

	 @FindBy(xpath="//*[@id=\"plugin\"]")
	 WebElement dismissalert;
	 public void dismithisalert()
	 {
		 //String alerttext= dismissalert.getText();
		 Alert disalert = driver.switchTo().alert();
		 disalert.dismiss();
	 }

	 @FindBy(id="ResetItemBtn")
	 WebElement ResetItem;

	 @FindBy(xpath="//*[@id=\"RenderBody\"]/div[2]/div")
	 WebElement Tableofitems;
	 public Boolean checkTableofitems()
	 {
		 Boolean con = false;

		 int count = 0, i = 1;

		 try
		 {
			 while (Tableofitems.isDisplayed())
			 {
				 count += 1;
				 i = i + 1;
			 }
		 }
		 catch (Exception e) {
			 // TODO: handle exception
		 } { }

		 try
		 {
			 for (i = 1; i <= count; i++)
			 {
				 if (Tableofitems.getText().contains("CRDSAL"))
				 {
					 con = true;
					 break;
				 }
			 }
		 }
		 catch (Exception e) {
			 // TODO: handle exception
		 } { }

		 return con;
	 }

	 @FindBy (id="ItemsGrid")
	 WebElement itemgridtble;

	 // شغالة
	 @FindBy(xpath="//*[@id=\"ItemsGrid\"]/tbody/tr[1]/td[6]/a[1]/i")
	 public List<WebElement>  updatetItem;
	 public void clickupdateitemBTN()
	 {
		 updatetItem.get(0).click();		 
	 }
	 // شغالة بردو زيها بس طريقة تانية
	 @FindBy(xpath="//*[@id=\"ItemsGrid\"]/tbody/tr[1]/td[6]/a[1]/i")
	 public WebElement  updatetItem1;
	 public void clickupdateitemBTN1()
	 {
		 clickbutton(updatetItem1);		 
	 }
	 @FindBy(xpath="//*[@id=\"ItemsGrid\"]/thead/tr/th[4]")
	 public WebElement  Itemweightassert;
	 
	 // delete 
	 @FindBy(xpath="//*[@id=\"ItemsGrid\"]/tbody/tr[1]/td[6]/a[2]")
	 public WebElement  deletetItem1;
	 public void clickDeleteitemBTN()
	 {
		 clickbutton(deletetItem1);		 
	 }

	 // delete OK

	 @FindBy(xpath="/html/body/div[9]/div/div/nav")
	 public WebElement modalcontent;
	 public void SwithtoALertok()
	 {
		 clickbutton(modalcontent);
		 /*Alert alert = driver.switchTo().alert()
		alert.accept()*/;
	 }
	 // validatio of delete assert
	 @FindBy(partialLinkText="تم الحذف بنجاح")
	 public WebElement  validationdlete;


	 // print all polisa
	 @FindBy(xpath="//*[@id=\"ItemsGrid\"]/tbody/tr[1]/td[6]/a[3]/i")
	 public WebElement  printItemall;
	 public void clickupprintItemallitemBTN1()
	 {
		 clickbutton(printItemall);		 
	 }
	 // print mini polisa
	 @FindBy(xpath="//*[@id=\"ItemsGrid\"]/tbody/tr[1]/td[6]/a[4]")
	 public WebElement  printminiItema;
	 public void clickprintminiItemallitemBTN1()
	 {
		 clickbutton(printminiItema);		 
	 }
	 
	 //print assertion
	 @FindBy(tagName= "div")
	 public WebElement printassrtionall;
	 public void switchtopopupprint()
	 {
		 driver.switchTo().frame(printassrtionall);
		 Assert.assertEquals("لبرید السعودي - تسجیل بعیثة",printassrtionall.getText());
		 
		 driver.switchTo().defaultContent();
	 }

	 // UPLOAD  FILE
	 
	 @FindBy(id="uploadTemplateIcon")
	 public WebElement uploadTemplatefile;
	 @FindBy(css="span.btn.btn-success.btn-file")
	 public WebElement uploadTemplateIconBtn;
	 
	 public void clickuploadfile() throws AWTException, InterruptedException
	 {
		 clickbutton(uploadTemplateIconBtn);
	 }
	 public void usingrobottoupoladfile() throws InterruptedException, AWTException
	 {
		 String imgename= "3.png";
		 String imgepath= System.getProperty("user.dir")+ "\\uploads\\3.png";
		 // code using robot class to file upload  دة المسؤل ف التعامل مع ويندو ال بتظهر
		 Robot robot = new Robot();
		 // copy imgepath from window
		 StringSelection selection= new StringSelection(imgepath);
		 // put data copy in clipboard 
		 Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		 clipboard.setContents(selection, null);
		 // //  ارفع ايدك //علشان اقف ف المربع واقولة حطيلى الملف هنا // اضغط هنا
		 robot.keyPress(KeyEvent.VK_ENTER);         
		 robot.keyRelease(KeyEvent.VK_ENTER);  
		 robot.delay(2000);
		 // CTRL + V
		 robot.keyPress(KeyEvent.VK_CONTROL);         
		 robot.keyPress(KeyEvent.VK_V); 
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyRelease(KeyEvent.VK_V);
		 robot.delay(2000);
		 Thread.sleep(1000);
		 // press ok
		 robot.keyPress(KeyEvent.VK_ENTER);         
		 robot.keyRelease(KeyEvent.VK_ENTER);  
		 robot.delay(3000);
		 Thread.sleep(1000);
	 } 

}




