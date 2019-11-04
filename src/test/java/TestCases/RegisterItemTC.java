// PROJECT NAME  : SAUDI POST OFFICE TESTING
// MODULE NAME   : TESTING
// PAGE NAME     : Register item
// CREATION DATE : 16/10/2019
// CREATED BY    : HISHAM SHAHIN
// TESTCASE DESC : تسجيل بعيثة بريد وومحطة طرود وتسليم مكاتب وعنوان وصفى وعمل حفظ وتصدير الكشف
// MODIFIED BY   : 
// MODIFIED DATE : 
package TestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.github.javafaker.Faker;

import TESTBASE.TestBase;

public class RegisterItemTC extends TestBase
{
	Pages.Registeritempage Registerpageobj;
	@Test ()
	public  void Registeritem () throws InterruptedException
	{

		// دايما بناخد اويجيكت من الكلاس ال فيها البيج اوبكيت  للعناصر الصفحة
		///call method from test base common method, new object from class page of elements
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		Registerpageobj= new Pages.Registeritempage(driver);
		
		Faker filefaker = new Faker();
		String phonenums= filefaker.number().digits(10).toString();
		String phonenums1= filefaker.number().digits(10).toString();
		String phonenums2= filefaker.number().digits(10).toString();
		String phonenums3= filefaker.number().digits(10).toString();
		String phonenums4= filefaker.number().digits(10).toString();
		String phonenums5= filefaker.number().digits(10).toString();
		String phonenums6= filefaker.number().digits(10).toString();
		String phonenums7= filefaker.number().digits(10).toString();
		String phonenums8= filefaker.number().digits(10).toString();
		String phonenums9= filefaker.number().digits(10).toString();
		String phonenums10= filefaker.number().digits(10).toString();
		String phonenums11= filefaker.number().digits(10).toString();
		
		//LINKS OF TREE
		WebElement link = driver.findElement(By.linkText("مبيعات قطاع الاعمال"));
		link.click();
		Thread.sleep(4000);
		WebElement link1 = driver.findElement(By.linkText("إدارة البعائث"));
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
		Registerpageobj.enteritem("5000");
		Thread.sleep(5000);
		Assert.assertTrue(Registerpageobj.msgsucsess.getText().contains("عنوان صحيح"));
		Registerpageobj.seleccontentbytext("ورق ومستندات");
		Registerpageobj.SaveButton();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(4000);

		// تسجيل بعيثة بعنوان وطنى 
		Registerpageobj.enterNameReceptions("hishamh");
		Registerpageobj.enterphoneNumbs(phonenums1);
		Registerpageobj.clickNationalRadio();
		Registerpageobj.enterNationalZipCode("12613");
		Registerpageobj.enterNationalBuildingNo("6998");
		Registerpageobj.enterNationalAdditionalNum("3570");
		Registerpageobj.enterNationalUnitNum("0055");	
		Registerpageobj.enteritem("5000");
		Thread.sleep(4000);
		Assert.assertTrue(Registerpageobj.msgsucsess.getText().contains("عنوان صحيح"));
		Registerpageobj.seleccontentbytext("ورق ومستندات");
		Registerpageobj.SaveButton();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(1000);

		Registerpageobj.getdatafromtable();

		// محطة طرود
		Registerpageobj.enterNameReceptions("hishamm");
		Registerpageobj.enterphoneNumbs(phonenums2);
		Registerpageobj.clickParcelStationRadio();
		Thread.sleep(2000);
		Registerpageobj.selectCitylist("الرياض");
		Thread.sleep(1000);
		Registerpageobj.selectParcelStationbytext("محطة طرود البريد المركزي - الرياض");
		Registerpageobj.enteritem("5000");
		Registerpageobj.seleccontentbytext("ورق ومستندات");
		Registerpageobj.SaveButton();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(1000);

		// تسليم مكاتب
		Registerpageobj.enterNameReceptions("hishamm");
		Registerpageobj.enterphoneNumbs(phonenums3);
		Registerpageobj.clickDeliveryOfficeRadio();
		Thread.sleep(3000);
		Registerpageobj.selectCityDll4ist("مكة المكرمة");
		Thread.sleep(1000);
		Registerpageobj.selectOffcieIdbytext("اليمانية - العاصمة المقدسة");
		Registerpageobj.enteritem("5000");
		Registerpageobj.seleccontentbytext("ورق ومستندات");
		Registerpageobj.SaveButton();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		// تسجيل بعيثة بوصفى داخلى
		Registerpageobj.enterNameReceptions("hishammoahmed");
		Registerpageobj.enterphoneNumbs(phonenums4);
		Registerpageobj.clickInternalDescriptiveRadio();
		Thread.sleep(2000);
		Registerpageobj.selectInternalDescriptiveCity("الرياض");
		Thread.sleep(1000);
		Registerpageobj.selectInternalDescriptiveDistrict("النموذجية");
		Registerpageobj.enterInternalDescriptiveStreetName("الفرزدق");
		Registerpageobj.enteritem("5000");
		Registerpageobj.seleccontentbytext("ورق ومستندات");
		Registerpageobj.SaveButton();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(1000);

		// تسجيل بعيثة خارجى
		Registerpageobj.clickitemExternal();
		Registerpageobj.enterNameReceptions("hishamshahin");
		Registerpageobj.enterphoneNumbs(phonenums5);
		Thread.sleep(2000);
		Registerpageobj.selecExternalCountry("مصر");
		Thread.sleep(2000);
		Registerpageobj.selecExternalCity("القاهرة");
		Registerpageobj.enteritem("5000");
		Registerpageobj.seleccontentbytext("ورق ومستندات");
		Registerpageobj.SaveButton();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(1000);

		// تسجيل بعيثة خارجى طرود
		Registerpageobj.clickitemExternal();
		Registerpageobj.enterNameReceptions("hishamshahin");
		Registerpageobj.enterphoneNumbs(phonenums6);
		Thread.sleep(2000);
		Registerpageobj.selecExternalCountry("مصر");
		Thread.sleep(2000);
		Registerpageobj.selecExternalCity("القاهرة");
		Registerpageobj.selecItemtarad("طرد");
		Registerpageobj.enteritem("30");
		Registerpageobj.seleccontentbytext("مواد غذائيه");
		Registerpageobj.SaveButton();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(1000);

		// تسجيل بعيثة صندوق بريد طرود
		Registerpageobj.enterNameReceptions("hisham");
		Registerpageobj.enterphoneNumbs(phonenums7);
		Registerpageobj.clickMailBoxsradio();
		Registerpageobj.enterzipCode("11466");
		Registerpageobj.enterMailPOBox("25001");
		Thread.sleep(2000);
		Registerpageobj.selecItemtarad("طرد");
		Registerpageobj.enteritem("30");
		Registerpageobj.seleccontentbytext("مواد غذائيه");
		Thread.sleep(2000);
		Registerpageobj.SaveButton();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		// تسجيل بعيثة عنوان وطنى طرود
		Registerpageobj.enterNameReceptions("hishamh");
		Registerpageobj.enterphoneNumbs(phonenums8);
		Registerpageobj.clickNationalRadio();
		Registerpageobj.enterNationalZipCode("12613");
		Registerpageobj.enterNationalBuildingNo("6998");
		Registerpageobj.enterNationalAdditionalNum("3570");
		Registerpageobj.enterNationalUnitNum("0055");
		Registerpageobj.selecItemtarad("طرد");
		Registerpageobj.enteritem("30");
		Registerpageobj.seleccontentbytext("مواد غذائيه");
		Thread.sleep(2000);
		Registerpageobj.SaveButton();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(1000);

		// تسجيل بعيثة طرود محطة طرود
		Registerpageobj.enterNameReceptions("hishamm");
		Registerpageobj.enterphoneNumbs(phonenums9);
		Registerpageobj.clickParcelStationRadio();
		Thread.sleep(2000);
		Registerpageobj.selectCitylist("الرياض");
		Thread.sleep(1000);
		Registerpageobj.selectParcelStationbytext("محطة طرود البريد المركزي - الرياض");
		Registerpageobj.selecItemtarad("طرد");
		Registerpageobj.enteritem("30");
		Registerpageobj.seleccontentbytext("مواد غذائيه");
		Thread.sleep(2000);
		Registerpageobj.SaveButton();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(1000);

		// تسجيل بعيثة طرود تسليم مكاتب
		Registerpageobj.enterNameReceptions("hishamm");
		Registerpageobj.enterphoneNumbs(phonenums10);
		Registerpageobj.clickDeliveryOfficeRadio();
		Thread.sleep(3000);
		Registerpageobj.selectCityDll4ist("مكة المكرمة");
		Thread.sleep(1000);
		Registerpageobj.selectOffcieIdbytext("اليمانية - العاصمة المقدسة");
		Registerpageobj.selecItemtarad("طرد");
		Registerpageobj.enteritem("30");
		Registerpageobj.seleccontentbytext("مواد غذائيه");
		Thread.sleep(2000);
		Registerpageobj.SaveButton();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(1000);

		// تسجيل بعيثة  طرود بوصفى داخلى
		Registerpageobj.enterNameReceptions("hishammoahmed");
		Registerpageobj.enterphoneNumbs(phonenums11);
		Registerpageobj.clickInternalDescriptiveRadio();
		Thread.sleep(2000);
		Registerpageobj.selectInternalDescriptiveCity("الرياض");
		Thread.sleep(1000);
		Registerpageobj.selectInternalDescriptiveDistrict("النموذجية");
		Registerpageobj.enterInternalDescriptiveStreetName("الفرزدق");
		Registerpageobj.selecItemtarad("طرد");
		Registerpageobj.enteritem("30");
		Registerpageobj.seleccontentbytext("مواد غذائيه");
		Thread.sleep(2000);
		Registerpageobj.SaveButton();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(1000);

		// تكوين وتصدير الكشوفات
		Registerpageobj.clickCreateStatementBtn();
		Registerpageobj.checkTableofitems();
		System.out.println();
		//Registerpageobj.clickbtnExportStatements();
		Thread.sleep(4000);
		//Registerpageobj.getrstatementBarcode();
		Registerpageobj.clickprintstatementokbtn();




















	}	

}
