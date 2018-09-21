package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import csvRead.ShadowLoginDetails;
import stepDefinition.Common;

public class Common {

	WebElement element;
	ShadowLoginDetails shadow = new ShadowLoginDetails(); 

	public WebDriver loginSetup(WebDriver driver) throws Exception
	{
		try
		{
			System.out.println("Login setup entered");
			Common common = new Common();
//			driver.get("wid.int.travelpass.com");
	    	shadow.csvDataRead(driver);
	    	driver.findElement(By.name("commit")).click();
	    	WebDriverWait wait = new WebDriverWait(driver, 80);
//	    	System.out.println(driver.getCurrentUrl());
//	    	wait.until(ExpectedConditions.visibilityOf(common.header_pageTitle(driver)));
	    	if(common.header_pageTitle(driver).getText().contains("Signed in successfully"))
	    	{
	    		System.out.println("Logged In Successfully");
	    	}
	    	else
	    	{
	    		System.out.println("Unsuccessful Login");
	    	}
		}
		catch(Exception e)
		{
			System.out.println("loginSetup failed");
			throw e;
		}
		return driver;
	}

	private WebElement header_pageTitle(WebDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}
}