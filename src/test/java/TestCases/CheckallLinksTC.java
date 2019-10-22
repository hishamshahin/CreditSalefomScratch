package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Pages.PageBase;
import TESTBASE.TestBase;

public class CheckallLinksTC extends TestBase
{
	
	PageBase pagbaseobj;
	

	@Test
	public void testBrokenLinks() 
	{
		
		
		java.util.List<WebElement> links = driver.findElements(By.tagName("a")); 
		System.out.println("Total Links are: "+ links.size());
		for (int i = 0 ; i < links.size() ; i++ ) 
		{
			WebElement element = links.get(i);
			String url = element.getAttribute("href"); 
			pagbaseobj= new PageBase(driver);
			PageBase.VerifyLink(url);
			
		}
	}


}
