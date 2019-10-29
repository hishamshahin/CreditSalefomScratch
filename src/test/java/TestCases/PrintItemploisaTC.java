package TestCases;

import java.lang.invoke.SwitchPoint;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Pages.Registeritempage;
import TESTBASE.TestBase;

public class PrintItemploisaTC extends TestBase
{
	@Test
	public void Printpolisa() throws InterruptedException
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
				
				Registerpageobj.clickupprintItemallitemBTN1();
				Thread.sleep(2000);
				driver.navigate().refresh();
				Thread.sleep(2000);
				Registerpageobj.clickprintminiItemallitemBTN1();
				Thread.sleep(2000);
				driver.navigate().refresh();
		
		
		
		
	}

}
