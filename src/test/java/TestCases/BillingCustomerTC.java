package TestCases;

import org.testng.annotations.Test;

import Pages.Billingcustomerpage;
import TESTBASE.TestBase;

public class BillingCustomerTC extends TestBase
{
	Billingcustomerpage billcustomerobj;

	@Test
	public void Searchandpritbillbarcode() throws InterruptedException
	{
		driver.navigate().to("http://10.10.110.44:1000/billing/index/1011");
		billcustomerobj = new Billingcustomerpage(driver);
		if (! billcustomerobj.SelectedCust_NameAr.isEnabled()) 
		{
			billcustomerobj.enterserachbydateform("10/15/2019");
			billcustomerobj.selectbillstatus("غير مسددة");
			billcustomerobj.searchandprintbill();			
		}
	}

}
