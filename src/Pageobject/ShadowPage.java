package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShadowPage
{
	WebElement element = null;
	String message = null;
	Messages msg= new Messages();
	
	public WebElement txt_Login (WebDriver d) throws Exception 
	{
	  try
	  {
		  element= d.findElement(By.id("login"));
			 System.out.println("Login label found");  
	  }
	  
	  catch(Exception e)
	  {
		  throw e;
	  }
	
	   return element;
		
	}
	
	
	public WebElement txt_username (WebDriver d) throws Exception 
	{
	  try
	  {
		  element= d.findElement(By.name("user[email]"));
			 System.out.println("Valid Email found");  
	  }
	  
	  catch(Exception e)
	  {
		  throw e;
	  }
	
	   return element;
		
	}


   public WebElement txt_password(WebDriver d)throws Exception
   {
	   try
	   {
		   element= d.findElement(By.id("user_password"));
		   System.out.println("Password field found");
	   }
	   
	   catch(Exception e)
		 {
		   throw e;
		  }
		
		 return element;
    }
   
    public WebElement btn_login(WebDriver d) throws Exception
    {
    	try
    	{
    		element=d.findElement(By.name("commit"));
    		System.out.println("Login button found");
    	}
    	
    	catch(Exception e)
    	{
    		throw e;
    	}
		return element;
    }
     
 }