package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase 
{
	 protected WebDriver driver ;
	 public JavascriptExecutor jse;
	 public Select select;
	 Actions action ;
	 
	 
	 
	public PageBase (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public static void clickbutton( WebElement Button)
	{
		Button.click();
	}
	
	public static void clickbuttonList( List<WebElement> button)
	{
		button.get(0);
	}
	
	
	public static void EnterValue( WebElement textelement, String value)
	{
		textelement.sendKeys(value);
	}
	
	public static void ClearValue( WebElement element)
	{
		element.clear();
	}
	
	public  void Scrollbottom () throws InterruptedException
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, 250)");
		Thread.sleep(4000);
		
	}
	
	public void SelectByindex(WebElement element,int index) 
	{
		select =new Select(element);
		select.selectByIndex(index);
		
	}
	
	public void SelectByvalue(WebElement element,String  value) 
	{
		select =new Select(element);
		select.selectByValue(value);
		
	}
	public void SelectBytext(WebElement element,String  text) 
	{
		select =new Select(element);
		select.selectByVisibleText(text);
		
	}
	public void GetFirstSelectedOption(WebElement element) 
	{
		select =new Select(element);
		select.getFirstSelectedOption();
		
	}
	
	public void DeselectAll(WebElement element) 
	{
		select =new Select(element);
		select.deselectAll();
		
	}
	
	public void EnterKey (WebElement element)
	{
		element.sendKeys(Keys.ENTER);
	}
	
	public void RETURNKey (WebElement element)
	{
		element.sendKeys(Keys.RETURN);
	}
	
	public void tabKey (WebElement element)
	{
		element.sendKeys(Keys.TAB);
	}
	
	
	
	public void hovermainmenu(WebElement main,WebElement submenu) 
	{
		action=new Actions(driver);
		action.moveToElement(main).moveToElement(submenu).click().build().perform();
	}
	
	public void contextClickandnewtab(WebElement clickelement)
	{
		action= new Actions(driver);
		action.contextClick(clickelement).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
		
		
	}
	// دى ميثود مش@test بتخدم ع الميثود الفويد ال هستخدمها ف التست كيس 
	public static void VerifyLink(String urlLink) 
	{
		try {
			URL link = new URL(urlLink);
			// create a connection using URL object
			HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
			httpConn.setConnectTimeout(2000);
			httpConn.connect();
			
			// use getResponseCode() to get the response code
			if(httpConn.getResponseCode() == 200) 
			{
				System.out.println(urlLink+" - "+httpConn.getResponseMessage());
			}
			if (httpConn.getResponseCode() == 404) {
				System.out.println(urlLink+" - "+httpConn.getResponseMessage());
			}
			
			

		} catch (MalformedURLException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}
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
