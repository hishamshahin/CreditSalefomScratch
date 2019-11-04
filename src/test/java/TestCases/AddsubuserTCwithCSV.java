// PROJECT NAME  : SAUDI POST OFFICE TESTING
// MODULE NAME   : TESTING
// PAGE NAME     : تسجيل عميل HQHTN 
// CREATION DATE : 16/10/2019
// CREATED BY    : HISHAM SHAHIN
// TESTCASE DESC : التحقق من ان اضافة تسجيل عيمل جديد بنجاح 
// MODIFIED BY   : 
// MODIFIED DATE : 
package TestCases;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.opencsv.CSVReader;

import Pages.Addsubuserpage;
import Pages.mainloginPage;
import TESTBASE.TestBase;
// PASSED
public class AddsubuserTCwithCSV extends TestBase

{
	Addsubuserpage addsubuserpageobj;
	Faker faker= new Faker();
	String Nationalid= faker.number().digits(10).toString();
	String mobilNumber= faker.number().digits(10).toString();
	String email = faker.internet().emailAddress().toString();

	mainloginPage loginobj;
	 CSVReader Reader;
		// get path of CSV file 
		String CSV_file = System.getProperty("user.dir")+"\\src\\main\\java\\DDT\\UserData.csv";

	@Test()
	public void addsubuser() throws InterruptedException, FileNotFoundException
	{
		
		
		 Reader= new CSVReader(new FileReader(CSV_file));
		 String[] csvcell;
		 try {
			while ((csvcell=Reader.readNext())!= null ) 
			 {
				 String usename= csvcell[0];
				 String password= csvcell[1];
				 
				 loginobj= new mainloginPage(driver);
					loginobj.login(usename, password);

					addsubuserpageobj = new Addsubuserpage(driver);
					//addsubuserpageobj.clicklinksubuser();
					driver.navigate().to("http://10.10.110.44:1000/user/addsubuser/897");
					// Assert.assertTrue(addsubuserpageobj.RequestAccount_NameAr.getText().contains("مؤسسة سدك للمقاولات"));
					//addsubuserpageobj.IsInSameBranchchecked();
					addsubuserpageobj.Entersubuserdata("hisham","shahin",Nationalid,email,mobilNumber,"P@ssw0rd1234","P@ssw0rd1234");
					addsubuserpageobj.clicklogout();
				 
			 }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 	
				 
		 
		
	}

	// Assert.assertTrue(addsubuserpageobj.successmsg.getText().contains("تم الحفظ بنجاح"));
	//addsubuserpageobj.deleteSubUser();





}

