// PROJECT NAME  : SAUDI POST OFFICE TESTING
// MODULE NAME   : TESTING
// PAGE NAME     : Register item
// CREATION DATE : 16/10/2019
// CREATED BY    : HISHAM SHAHIN
// TESTCASE DESC : التحقق من ان حقل اسم الجهة غير مفعل وعمل تشيك ع زر من نفس الفرع
// MODIFIED BY   : 
// MODIFIED DATE : 

package TestCases;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Pages.Addsubuserpage;
import TESTBASE.TestBase;

public class Checkisbranschsubuser extends TestBase
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
		addsubuserpageobj.IsInSameBranchchecked();
		addsubuserpageobj.Enternationalzipcode("6998", "3570", "12613", "0055");
		addsubuserpageobj.Entersubuserdata("hisham","shahin",Nationalid,email,mobilNumber,"P@ssw0rd1234","P@ssw0rd1234");
	}
	


}
