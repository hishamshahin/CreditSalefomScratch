package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
			if (crmAccountId.isEnabled()) 
			{
				SelectBytext(crmAccountId, customrrname);
			} 
			else 
			{
				clickbutton(btnSave);

			}
			
			
		}
	//تحميل ملف الاكسل
	@FindBy(css="span.input-group-btn")
	WebElement fileUplaodExcelFile;
	public void clickfileuploadexcel()
	{
		clickbutton(fileUplaodExcelFile);
	}
	public void usingrobottoupoladfile() throws InterruptedException, AWTException
	 {
		 String ExcelFile1Path= "\\DATAFILES\\Prod_Testtst1.xlsx";
		 String imgepath= System.getProperty("user.dir")+ ExcelFile1Path;
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

	
	// زر تحميل 
	@FindBy(id="upload")
	WebElement uploadBTN;
	public void clickuploadBTN()
	{
		clickbutton(uploadBTN);
	}
	//قراءة بالرقم المرجعى
	@FindBy(id="srchReferenceNo")
	WebElement srchReferenceNo;
	// حفظ
	@FindBy(id="btnSave")
	 public WebElement btnSave;
	// تصدير اكسيل
	@FindBy(id="DownloadExcel")
	WebElement DownloadExcel;
	// رفع ملف جديد
	@FindBy(id="btnNewFile")
	WebElement btnNewFile;
	
	@FindBy(className="alertify")
	WebElement btnsuccess;
	public void clicbtnsuccess ()
	{
		
		clickbutton(btnsuccess);
	}
	

}
