// PROJECT NAME  : SAUDI POST OFFICE TESTING
// MODULE NAME   : TESTING
// PAGE NAME     : تسجيل عميل HQHTN 
// CREATION DATE : 16/10/2019
// CREATED BY    : HISHAM SHAHIN
// TESTCASE DESC : التحقق من ان اضافة تسجيل عيمل جديد بنجاح 
// MODIFIED BY   : 
// MODIFIED DATE : 
package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Pages.Addsubuserpage;
import TESTBASE.TestBase;

public class AddsubuserTC extends TestBase

{
	Addsubuserpage addsubuserpageobj;
	Faker faker= new Faker();
	String Nationalid= faker.number().digits(10).toString();
	String mobilNumber= faker.number().digits(10).toString();
	String email = faker.internet().emailAddress().toString();
			

	
	@Test
	public void addsubuser() throws InterruptedException
	{
		 addsubuserpageobj = new Addsubuserpage(driver);
		 addsubuserpageobj.clicklinksubuser();
		// Assert.assertTrue(addsubuserpageobj.RequestAccount_NameAr.getText().contains("مؤسسة سدك للمقاولات"));
		 addsubuserpageobj.IsInSameBranchchecked();
		 addsubuserpageobj.Entersubuserdata("hisham","shahin",Nationalid,email,mobilNumber,"P@ssw0rd1234","P@ssw0rd1234");
		// Assert.assertTrue(addsubuserpageobj.successmsg.getText().contains("تم الحفظ بنجاح"));
		 addsubuserpageobj.deleteSubUser();
		 
		
	}

}
