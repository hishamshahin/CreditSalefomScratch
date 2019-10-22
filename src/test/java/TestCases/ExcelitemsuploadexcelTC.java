package TestCases;

import java.awt.AWTException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Pages.ExcelitemsuploadexcelPage;
import TESTBASE.TestBase;

public class ExcelitemsuploadexcelTC extends TestBase
{
	ExcelitemsuploadexcelPage ExcelitemsuploadexcelOBJ;
	
	@Test
	public void Saveuploadexcelfile() throws InterruptedException
	{
		ExcelitemsuploadexcelOBJ = new ExcelitemsuploadexcelPage(driver);
		driver.navigate().to("http://10.10.110.44:1000/excelitems/uploadexcel/1015");
		//ExcelitemsuploadexcelOBJ.clicklinkuploadexcel();
		Thread.sleep(7000);
		
		ExcelitemsuploadexcelOBJ.selectcustomrrname("مؤسسه فهد مدني سحله للمقاولات");
		Thread.sleep(3000);
		
		ExcelitemsuploadexcelOBJ.clickfileuploadexcel();
		try {
			ExcelitemsuploadexcelOBJ.usingrobottoupoladfile();
		} catch (AWTException e)
		{		
			e.printStackTrace();
		}
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ExcelitemsuploadexcelOBJ.btnSave));
		
		ExcelitemsuploadexcelOBJ.clickuploadBTN();
	}

}
