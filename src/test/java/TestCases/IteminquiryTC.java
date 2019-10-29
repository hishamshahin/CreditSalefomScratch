// PROJECT NAME  : SAUDI POST OFFICE TESTING
// MODULE NAME   : TESTING
// PAGE NAME     : الاستعلام عن بعائث
// CREATION DATE : 16/10/2019
// CREATED BY    : HISHAM SHAHIN
// TESTCASE DESC : عمل بحث واستعلام عن بعائث بالرقم المرجعى والبعيثة 
// MODIFIED BY   : 
// MODIFIED DATE : 
package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

import Pages.IteminquiryPage;
import TESTBASE.TestBase;

public class IteminquiryTC extends TestBase
{
	IteminquiryPage iteminquirypageobj;
	
	@Test
	public void searconitemandprint() throws InterruptedException
	{
		driver.navigate().to("http://10.10.110.44:1000/pickupmanagement/iteminquiry/967");
		iteminquirypageobj = new IteminquiryPage(driver);
		iteminquirypageobj.iteminqurysearch("CRDSAL0000129619", "1");
		//Assert.assertTrue(iteminquirypageobj.itembarcode.isDisplayed());
		Verify.verify(iteminquirypageobj.itembarcode.isDisplayed());
		Thread.sleep(2000);
		iteminquirypageobj.Print1resultofserch();
		Thread.sleep(4000);
		driver.navigate().refresh();
		iteminquirypageobj.Printr2esultofserch();
		Thread.sleep(4000);
		driver.navigate().refresh();
		// passed
		
		
	}

}
