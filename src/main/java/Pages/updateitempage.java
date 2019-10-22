package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class updateitempage extends PageBase

{

	public updateitempage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//*[@id=\"Editform\"]")
	  public WebElement modalcontent1;
	public void SwithTopopup(String frameElement)
	{
		driver.switchTo().frame(frameElement);
		driver.switchTo().defaultContent();
	}
	
	@FindBy(xpath="//*[@id=\"Editform\"]")
	  public WebElement modalcontent;
	public void SwithtoALert(String keysToSend)
	{
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(keysToSend);
	}
	
	@FindBy(xpath="//*[@id=\"Editform\"]/div/div")
	WebElement popup;
	public void getpopup ()
	{
		
		System.out.println();    
		
	}
	
	
	// تغيير الى طرد
	 @FindBy(id="ItemTypeDllEdit")
	   public WebElement ItemTypeDllEdit;
	 public void ItemTypeDllEdit(String text)
	 {
		 
		 select = new Select(ItemTypeDllEdit);
		select.selectByValue(text);
	 }
	 // وزن البعيثة
	 @FindBy(id="ItemWeightEdit")
	 WebElement ItemWeightEdit;
	 public void enterItemWeightEdit(String value)
	 {
		 ClearValue(ItemWeightEdit);
		 EnterValue(ItemWeightEdit, value);
	 }
	 // الرقم المرجعى
	 @FindBy(id="ReferenceIdTxtEdit")
	 WebElement ReferenceIdTxtEdit;
	 public void enterReferenceIdTxtEdit(String value)
	 {
		 EnterValue(ReferenceIdTxtEdit, value);
	 }
	 
	 // اسم الجهة
	 @FindBy(id="NameReceptionEdit")
	 WebElement NameReceptionEdit;
	 public void enterNameReceptionEdit(String value)
	 {
		 EnterValue(NameReceptionEdit, value);
	 }
	 // العنوان الوطنى
	 @FindBy(id="NationalRadioEdit")
	 WebElement NationalRadioEdit;
	 public void clickNationalRadioEdit()
	 {
		 clickbutton(NationalRadioEdit);
	 }
	 // حفظ
	 @FindBy(id="saveEditBtn")
	 WebElement saveEditBtn;
	 public void clicksaveEditBtn()
	 {
		 clickbutton(saveEditBtn);
	 }
	 
	 //
	 
	

}
