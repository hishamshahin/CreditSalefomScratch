package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Pages.PageBase;
import Pages.Registeritempage;
import Pages.updateitempage;
import TESTBASE.TestBase;

public class DeleteitemTC extends TestBase
{
	Registeritempage Registerpageobj;
	PageBase pagebaseobJ;
	updateitempage updateitempageobj;
	Faker filefaker = new Faker();
	String phonenums= filefaker.number().digits(10).toString();
	
	@Test
	public void Userupdateitem() throws InterruptedException
	{
		Registerpageobj= new Registeritempage(driver);
		pagebaseobJ= new PageBase(driver);
		
		WebElement link = driver.findElement(By.partialLinkText("مبيعات قطاع الاعمال"));
		link.click();
		Thread.sleep(4000);
		WebElement link1 = driver.findElement(By.partialLinkText("إدارة البعائث"));
		link1.click();
		Thread.sleep(4000);
		WebElement link2 = driver.findElement(By.partialLinkText("تسجيل بعيثة - المبيعات"));
		link2.click();
		Thread.sleep(2000);

		// تسجيل بعيثة بصندوق بريد

		Registerpageobj.enterNameReceptions("hisham");
		Registerpageobj.enterphoneNumbs(phonenums);	
		
		Registerpageobj.clickMailBoxsradio();
		Thread.sleep(1000);
		Registerpageobj.enterzipCode("11466");
		Registerpageobj.enterMailPOBox("25001");
		Thread.sleep(2000);
		Registerpageobj.enteritem("3000");
		Thread.sleep(5000);
		Assert.assertTrue(Registerpageobj.msgsucsess.getText().contains("عنوان صحيح"));
		Registerpageobj.seleccontentbytext("ورق ومستندات");
		Registerpageobj.SaveButton();
		Thread.sleep(4000);

		driver.navigate().refresh();
		Thread.sleep(4000);
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, 250)");
		Thread.sleep(4000);
		//Assert.assertEquals("3000", Registerpageobj.Itemweightassert.toString());
				
	
		Registerpageobj.clickDeleteitemBTN();
		Registerpageobj.SwithtoALertok();
		Assert.assertTrue(Registerpageobj.validationdlete.isDisplayed());
		
	}

}
