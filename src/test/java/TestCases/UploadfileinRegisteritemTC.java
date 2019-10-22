package TestCases;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Pages.Registeritempage;
import TESTBASE.TestBase;

public class UploadfileinRegisteritemTC extends TestBase
{
	@Test
	public void uploadfile() throws InterruptedException, AWTException
	{
		
		Registeritempage Registerpageobj;
		Registerpageobj= new Pages.Registeritempage(driver);
		
		Faker filefaker = new Faker();
		String phonenums= filefaker.number().digits(10).toString();
		
		WebElement link = driver.findElement(By.linkText("مبيعات قطاع الاعمال"));
		link.click();
		Thread.sleep(4000);
		WebElement link1 = driver.findElement(By.linkText("إدارة البعائث"));
		link1.click();
		Thread.sleep(4000);
		WebElement link2 = driver.findElement(By.partialLinkText("تسجيل بعيثة - المبيعات"));
		link2.click();
		Thread.sleep(2000);
		
		// تسجيل بعيثة صندوق بريد طرود
				Registerpageobj.enterNameReceptions("hisham");
				Registerpageobj.enterphoneNumbs(phonenums);
				Registerpageobj.clickMailBoxsradio();
				Registerpageobj.enterzipCode("11466");
				Registerpageobj.enterMailPOBox("25001");
				Thread.sleep(2000);
				Registerpageobj.selecItemtarad("طرد");
				Registerpageobj.enteritem("30");
				Registerpageobj.seleccontentbytext("مواد غذائيه");
				Thread.sleep(2000);
				JavascriptExecutor js = ((JavascriptExecutor) driver);
				js.executeScript("window.scrollTo(0, 250)");
				Thread.sleep(4000);
				Registerpageobj.clickuploadfile();
				Thread.sleep(3000);
				Registerpageobj.usingrobottoupoladfile();
				Assert.assertTrue( Registerpageobj.uploadTemplatefile.isDisplayed());
								
				Registerpageobj.SaveButton();
				Thread.sleep(4000);
				driver.navigate().refresh();
				Thread.sleep(1000);
				Registerpageobj.getdatafromtable();
				
				Registerpageobj.clickCreateStatementBtn();
				Registerpageobj.clickbtnExportStatements();
				Thread.sleep(2000);
				// Assert.assertTrue(Registerpageobj.xportLBL.getText().contains("تم تكوين كشف بعائث برقم"));
				Registerpageobj.clickprintstatementokbtn();
	}

}
