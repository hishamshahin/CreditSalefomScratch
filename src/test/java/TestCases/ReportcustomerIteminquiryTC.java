// PROJECT NAME  : SAUDI POST OFFICE TESTING
// MODULE NAME   : TESTING
// PAGE NAME     : تقرير البعائث الصاادرة
// CREATION DATE : 16/10/2019
// CREATED BY    : HISHAM SHAHIN
// TESTCASE DESC :     وتحميل ملف الاكسيل  التحقق من ظهور البحث عند عمل بحث بتاريخ الالتقاط
// MODIFIED BY   : 
// MODIFIED DATE : 

package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.ReportcustomerIteminquiryPage;
import TESTBASE.TestBase;

public class ReportcustomerIteminquiryTC extends TestBase
{
	ReportcustomerIteminquiryPage reportpageobj;
	
	@Test 
	public void searchreportitemibquiry () throws InterruptedException	
	{
		reportpageobj = new ReportcustomerIteminquiryPage(driver);
		driver.navigate().to("http://10.10.110.44:1000/report/customerIteminquiry/1012");
		reportpageobj.serachbyformdate("2019-10-16");
		Thread.sleep(1000);
		reportpageobj.serachbytodate("2019-10-16");
		//Assert.assertTrue(reportpageobj.dateofexport.getText().contains("2019-10-16"));
		Thread.sleep(2000);
		reportpageobj.clickExcelxportBTN();
		ReportcustomerIteminquiryPage.DownloadchromeOption();
		reportpageobj.clickprintBTN();
		
		
	}
		

}
