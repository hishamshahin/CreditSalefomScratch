package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ExcelitemsuploadexcelPage extends PageBase
{

	public ExcelitemsuploadexcelPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//links
	
		@FindBy(partialLinkText="مبيعات قطاع الاعمال")
		 public WebElement  link1;
		
			 @FindBy(partialLinkText="إدارة البعائث")
			 public WebElement  link2;
			 
			 @FindBy(css="span.site-menu-title")
			 public WebElement  link3;
			 
			 public void clicklinkuploadexcel() throws InterruptedException
			 {				 
				 clickbutton(link1);
				 Thread.sleep(4000);
				 clickbutton(link2);
				 Thread.sleep(6000);
				 clickbutton(link3);			 
			 }
	// اختيار العميل
		@FindBy(id="crmAccountId")
		WebElement crmAccountId;
		public void selectcustomrrname(String customrrname)
		{
			if ( !crmAccountId.getText().contains("اختر العميل")) 
			{
				SelectBytext(crmAccountId, customrrname);
			} 
			else 
			{
				entersrchReferenceNo("1761531");
				EnterKey(srchReferenceNo);
				driver.navigate().refresh();
				clickbutton(btnSave);

			}
						
		}
	//تحميل ملف الاكسل
	@FindBy(css="span.input-group-btn")
	WebElement fileUplaodExcelFile;
	public void clickfileuploadexcel() throws InterruptedException
	{	//String filepath= System.getProperty("user.dir")+ "\\Downloads\\Prod_Testtst1.xlsx";					
		clickbutton(fileUplaodExcelFile);
		//Thread.sleep(5000);
		//fileUplaodExcelFile.sendKeys(filepath);
	}
	public void usingrobottoupoladfile() throws InterruptedException, AWTException
	 {
		 String ExcelFile1name= "Prod_Testtst1.xlsx";
		 String filepath= System.getProperty("user.dir")+ "\\Downloads\\"+ ExcelFile1name;
		 // code using robot class to file upload  دة المسؤل ف التعامل مع ويندو ال بتظهر
		 Robot robot = new Robot();
		 // copy imgepath from window
		 StringSelection selection= new StringSelection(filepath);
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
		 robot.keyPress(KeyEvent.VK_ENTER);         
		 robot.keyRelease(KeyEvent.VK_ENTER);  
		 robot.delay(2000);
		 Thread.sleep(1000);
		 // press ok
		 robot.keyPress(KeyEvent.VK_ENTER);         
		 robot.keyRelease(KeyEvent.VK_ENTER);  
		 robot.delay(3000);
		 robot.keyPress(KeyEvent.VK_CONTROL);         
		 robot.keyPress(KeyEvent.VK_V); 
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyRelease(KeyEvent.VK_V);
		 robot.delay(2000);
		 robot.keyPress(KeyEvent.VK_ENTER);         
		 robot.keyRelease(KeyEvent.VK_ENTER);  
		 robot.delay(2000);
		 Thread.sleep(1000);
		 Thread.sleep(1000);
	 } 
	
/*	public void testFileUpload() throws InterruptedException 

	{
		
		String filepath= System.getProperty("user.dir")+ "\\Downloads\\Prod_Testtst1.xlsx";	
		
		WebElement fileUplaodExcelFile = driver.findElement(By.cssSelector("span.input-group-btn")); 
		Thread.sleep(5000);
		fileUplaodExcelFile.sendKeys(filepath);
		WebElement fileSubmit = driver.findElement(By.id("file-submit")); 
		
		fileSubmit.click();
		WebElement uploadedFiles = driver.findElement(By.id("uploaded-files")); 
		System.out.println(uploadedFiles.getText());
		Thread.sleep(3000);
		Assert.assertEquals(imageName, uploadedFiles.getText());

	}*/
	
	// زر تحميل 
	@FindBy(id="upload")
	 public WebElement uploadBTN;
	public void clickuploadBTN()
	{
		clickbutton(uploadBTN);
	}
	//قراءة بالرقم المرجعى
	@FindBy(id="srchReferenceNo")
	 public WebElement srchReferenceNo;
	public void entersrchReferenceNo(String number)
	{
		EnterValue(srchReferenceNo, number);
		srchReferenceNo.sendKeys(Keys.ENTER);
	}
	// زؤ مقروء  assert
	@FindBy(id="read")
	 public WebElement btnread;
	 
	// حفظ
	@FindBy(id="btnSave")
	 public WebElement btnSave;
	public void saveBTN()
	{
		clickbutton(btnSave);
	}
	// تصدير اكسيل
	@FindBy(id="DownloadExcel")
	WebElement DownloadExcel;
	// رفع ملف جديد
	@FindBy(id="btnNewFile")
	WebElement btnNewFile;
	
	@FindBy(xpath="/html/body/div[9]/div/div")
	WebElement btnsuccess;
	public void clicbtnsuccess ()
	{
		
		clickbutton(btnsuccess);
	}
	

}
