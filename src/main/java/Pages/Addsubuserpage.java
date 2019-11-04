// PROJECT NAME  : SAUDI POST OFFICE TESTING
// MODULE NAME   : TESTING
// PAGE NAME     : تسجيل عميل اضافى
// CREATION DATE : 16/10/2019
// CREATED BY    : HISHAM SHAHIN
// PAGE DESC : ALL ELEMNET OF PAGE
// MODIFIED BY   : 
// MODIFIED DATE : 
package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.bytebuddy.asm.Advice.Enter;

public class Addsubuserpage extends PageBase
{

	public Addsubuserpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//links
	
	@FindBy(partialLinkText="مبيعات قطاع الاعمال")
	 public WebElement  linksubuser1;
	
		 @FindBy(partialLinkText="إدارة الاشتراكات")
		 public WebElement  linksubuser2;
		 
		 @FindBy(partialLinkText="تسجيل عميل اضافي")
		 public WebElement  linksubuser3;
		 
		 public void clicklinksubuser() throws InterruptedException
		 {
			 
			 clickbutton(linksubuser1);
			 Thread.sleep(4000);
			 clickbutton(linksubuser2);
			 Thread.sleep(4000);
			 clickbutton(linksubuser3);
			 
		 }
		 
	
	// RequestAccount_NameAr 
	 @FindBy(id="RequestAccount_NameAr")
	 public WebElement  RequestAccount_NameAr;
	 public void chekelemntisdisplayed()
	 {
		 RequestAccount_NameAr.isDisplayed();
	 }
	 
	 
	 
	 // branch
	 @FindBy(id="IsInSameBranch")
	 public WebElement  IsInSameBranch;
	 public void IsInSameBranchchecked()
	 {
		 if ( IsInSameBranch.isSelected()) 
		 {
			 IsInSameBranch.click();
		}
		 else 
		 {
			 IsInSameBranch.click();
			
		}
	 }
	 // العنوان الوطني للجهة / الشركة
	 @FindBy(id="BuildingNo")
	 public WebElement  BuildingNo;
	 
	 @FindBy(id="AdditionalNo")
	 public WebElement  AdditionalNo;
	 
	 @FindBy(id="ZipCode")
	 public WebElement  ZipCode;
	 
	 @FindBy(id="UnitNo")
	 public WebElement  UnitNo;
	 public void Enternationalzipcode(String bilindingno,String addtionalno,String zipcod,String unitno)
	 {
		 EnterValue(BuildingNo, bilindingno);
		 EnterValue(AdditionalNo, addtionalno);
		 EnterValue(ZipCode, zipcod);
		 EnterValue(UnitNo, unitno);
	 }
	 
	 	 
	 // بيانات العميل الاضافى
	 @FindBy(id="FirstName")
	 public WebElement  FirstName;
	 
	 @FindBy(id="FamilyName")
	 public WebElement  FamilyName;
	 
	 @FindBy(id="NationalId")
	 public WebElement  NationalId;
	 
	 @FindBy(id="Email")
	 public WebElement  Email;
	 
	 @FindBy(id="MobilNumber")
	 public WebElement  MobilNumber;
	 
	 @FindBy(id="Password")
	 public WebElement  Password;
	 
	 @FindBy(id="ConfirmPassword")
	 public WebElement  ConfirmPassword;
	 @FindBy(id="SaveButton")
	 public WebElement  SaveButton;
	 	 	 	 
	 public void Entersubuserdata(String firstname,String familyname,String Nationalid,String email,String mobilNumber,String password,String confirmPassword)
	 {
		 EnterValue(FirstName, firstname);
		 EnterValue(FamilyName, familyname);
		 EnterValue(NationalId, Nationalid);
		 EnterValue(Email, email);
		 EnterValue(MobilNumber, mobilNumber);
		 EnterValue(Password, password);
		 EnterValue(ConfirmPassword, confirmPassword);
		 clickbutton(SaveButton);		 
	 }
	 
	 // validation  success assertion
	 @FindBy(xpath="/html/body/div[9]/div")
	  public WebElement successmsg;
	 
	 // AddDocument
	 @FindBy(css="button.btn.btn-xs.btn-primary.AddDocument")
	 public WebElement  AddDocument;
	 public void adddrocument()
	 {
		 clickbutton(AddDocument);
	 }
	 // delete
	 @FindBy(css="button.btn.btn-xs.btn-danger.deleteSubUser")
	 public WebElement  deleteSubUser;
	 @FindBy(partialLinkText="موافق")
	 public WebElement  deleteSubUserok;
	 
	 public void deleteSubUser()
	 {
		 clickbutton(deleteSubUser);
		 clickbutton(deleteSubUserok);
	 }
	 public void deleteSubUserok()
	 {
		 
		 clickbutton(deleteSubUserok);
	 }
	 
	 @FindBy(xpath="//*[@id=\"site-navbar-collapse\"]/ul[2]/li[10]/a")
	 public WebElement  logout;
	 
	 public void clicklogout() throws InterruptedException
	 {
		 Thread.sleep(3000);
		 clickbutton(logout);
		 
	 }
	 
	 
	 
	 
	 
	 

}
