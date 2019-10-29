// PROJECT NAME  : SAUDI POST OFFICE TESTING
// MODULE NAME   : TESTING
// PAGE NAME     : TEST BASE
// CREATION DATE : 16/10/2019
// CREATED BY    : HISHAM SHAHIN
// TESTCASE DESC : @ BEFOR TEST AND @AFTER TEST
// MODIFIED BY   : 
// MODIFIED DATE : 
package TESTBASE;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import Pages.mainloginPage;
import utilities.Helper;

public class TestBase 
{
	Helper helperforscreenshots;
	public static WebDriver driver ;
	mainloginPage loginobj;
	
	
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

	@BeforeSuite
	@Parameters({"browser"})
	public void Startdriver( @Optional("chrome") String browsername) 
	{
		if (browsername.equalsIgnoreCase("chrome"))
		{
			
			System.setProperty
			("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver(DownloadchromeOption());
			

		}

		else if (browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty
			("webdriver.gecko.driver", System.getProperty("user.dir")+ "\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}

		String[] Url=  new String [] {"https://demo.nopcommerce.com/","http://10.10.110.44:8080/Login/Index"};
		//String users [][] ={ {"Cust_1010142007","Q87J6"},{"Amdaheem","Permi$$ion@SP "}};

		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.navigate().to(Url[1]);
		
		try {
			loginobj= new mainloginPage(driver);
			loginobj.login("Cust_1010142007","Q87J6");
			//loginobj.login("Amdaheem","Permi$$ion@SP");
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.urlToBe("http://10.10.110.44:8080/"));
			
		} catch (Exception e) {
			System.out.println("login issue"+ e.getCause());
			
		}
		
		
	}
	
	



	/*@AfterSuite
	public void StopDriver() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}*/
	
	// After all failure method take screenshot
	@AfterMethod
	public void ScreenshOnFailure (ITestResult Result)
	{
		
		if (Result.getStatus()==ITestResult.FAILURE) 
		{
			System.out.println("taking Sceen on fail..");
			Helper.captureScreenshot(driver, Result.getName());
		}
		
		else if (Result.getStatus()==ITestResult.SKIP) 
		{
			System.out.println("taking Sceen on skip..");
			//helperforscreenshots.captureScreenshot(driver, Result.getName());
			Helper.captureScreenshot(driver, Result.getName());
		}
		
		else if (Result.getStatus()==ITestResult.SUCCESS)
		{
			System.out.println("taking Sceen on success..");
			Helper.captureScreenshot(driver, Result.getName());
		}
	}

}
