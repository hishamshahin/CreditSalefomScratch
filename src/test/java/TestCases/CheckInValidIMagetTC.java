package TestCases;

import java.io.IOException;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.http.HttpClient;
import org.openqa.selenium.remote.http.HttpResponse;
import org.testng.annotations.Test;

import Tests.TestBase;

public class CheckInValidIMagetTC extends TestBase
{
	@Test
	public void testBrokenImages() 
	{
		invalidImageCount = 0 ; 
		List<WebElement> imageList = driver.findElements(By.tagName("img")); 
		for(WebElement imgElement : imageList) 
		{
			if (imgElement != null) 
			{
				VerifyImageActive(imgElement);
			}
		}
		System.out.println("Total no. of invalid Images are : " + invalidImageCount);
	}
	
	
	public void VerifyImageActive(WebElement imgElement) 
	{
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(imgElement.getAttribute("src"));
		
		try {
			HttpResponse response = client.execute(request);
			
			if (response.getStatusLine().getStatusCode() != 200) 
			{
				invalidImageCount++ ; 
			}
			
		} catch (ClientProtocolException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		

}
