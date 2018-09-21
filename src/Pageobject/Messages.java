package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Messages {

	WebElement element;
	public WebElement txt_breadcrumb(WebDriver driver) throws Exception
	{
		try
		{
			element= driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/p"));
			System.out.println("Breadcrumb found");
		}
	
	    catch(Exception e)
		{
	    	throw e;
		}
		return element;
	
	}
	
	
	public WebElement txt_adduser(WebDriver driver) throws Exception
	{
		try
		{
			element= driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/p"));
			System.out.println("Success Message found");
		}
	
	    catch(Exception e)
		{
	    	throw e;
		}
		return element;
	
	}
	
	

	public WebElement edit_msgs(WebDriver driver) throws Exception
	{
		try
		{
			element= driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/p"));
			System.out.println("Success Message found");
		}
	
	    catch(Exception e)
		{
	    	throw e;
		}
		return element;
	
	}
	
	public WebElement delete_msgs(WebDriver driver) throws Exception
	{
		try
		{
			element= driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/p"));
			System.out.println("Delete Message found");
		}
	
	    catch(Exception e)
		{
	    	throw e;
		}
		return element;
	
	}
	
	
	public WebElement api_create_msgs(WebDriver driver) throws Exception
	{
		try
		{
			element= driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/p"));
			System.out.println("Create Message found");
		}
	
	    catch(Exception e)
		{
	    	throw e;
		}
		return element;
	
	}
	
	public WebElement api_edit_msgs(WebDriver driver) throws Exception
	{
		try
		{
			element= driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/p"));
			System.out.println("Update Message found");
		}
	
	    catch(Exception e)
		{
	    	throw e;
		}
		return element;
	
	}
	
	
	public WebElement api_activate_msgs(WebDriver driver) throws Exception
	{
		try
		{
			element= driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/p"));
			System.out.println("Activate Message found");
		}
	
	    catch(Exception e)
		{
	    	throw e;
		}
		return element;
	
	}
	
}	