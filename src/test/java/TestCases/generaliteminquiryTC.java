package TestCases;

import org.junit.Assert;
import org.junit.Test;
import org.testng.annotations.DataProvider;

import Pages.generaliteminquiry;
import Pages.mainloginPage;
import TESTBASE.TestBase;

public class generaliteminquiryTC extends TestBase
{
	@DataProvider(name="userlogin")
	public static Object [][] userdata ()
	{
		return new Object[][]
				{{"Amdaheem","Permi$$ion@SP"}};
	}
		
	generaliteminquiry generalinquiryobj;
	mainloginPage loginobj;
	
	@org.testng.annotations.Test(dataProvider="userlogin")
	public void searchandprint(String username, String password) throws InterruptedException
	{
		loginobj= new mainloginPage(driver);
		loginobj.login(username, password);
		driver.navigate().to("http://10.10.110.44:1000/pickupmanagement/generaliteminquiry/1006");
		generalinquiryobj = new generaliteminquiry(driver);
		generalinquiryobj.Genralsearchandprint();
		Assert.assertTrue(generalinquiryobj.barcodenumber.getText().contains("CRDSAL0000211319"));
		System.out.println(generalinquiryobj.barcodenumber.getText());
	}

}
