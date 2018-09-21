package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import csvRead.AddUser;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driverinit.Appdriver;
import Pageobject.MenuSubmenu;
import Pageobject.ShadowPage;
import Pageobject.Users;
import Pageobject.Messages;
import csvRead.ShadowLoginDetails;

public class APIKeys
{
	WebElement element = null;
	String message = null;

	public WebElement btn_addapi(WebDriver d)throws Exception
	{
		try
		{
			element=d.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div/div/div/a"));
			Thread.sleep(7000);
			System.out.println("Add api button found");	
		}
		
		catch(Exception e)
		{
			throw e;
		}
		return element;
		
		
	}
	
	
	public WebElement session_name(WebDriver d)throws Exception
	{
		try
		{
			element=d.findElement(By.id("api_key_label"));
			Thread.sleep(7000);
			System.out.println("Session name found");	
		}
		
		catch(Exception e)
		{
			throw e;
		}
		return element;
		
	}	
		
		public WebElement addapi_btn(WebDriver d)throws Exception
		{
			try
			{
				element=d.findElement(By.name("commit"));
				Thread.sleep(7000);
				System.out.println("Add API Key button found");	
			}
			
			catch(Exception e)
			{
				throw e;
			}
			return element;	
		
	}
	
		public WebElement editapi_btn(WebDriver d)throws Exception
		{
			try
			{
				element=d.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div/div/div/div[2]/div/div[1]/table/tbody/tr[1]/td[7]/a[1]/span"));
				Thread.sleep(7000);
				System.out.println("Edit button found");	
			}
			
			catch(Exception e)
			{
				throw e;
			}
			return element;	
		}
		
		public WebElement editsession_name(WebDriver d)throws Exception
		{
			try
			{
				element=d.findElement(By.id("api_key_label"));
				Thread.sleep(7000);
				System.out.println("Session name found");	
			}
			
			catch(Exception e)
			{
				throw e;
			}
			return element;	
		}
		
		public WebElement generateapi_key(WebDriver d)throws Exception
		{
			try
			{
				element=d.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div/form/div[1]/div[2]/div[2]/a"));
				Thread.sleep(7000);
				System.out.println("Generate api key button found");	
			}
			
			catch(Exception e)
			{
				throw e;
			}
			return element;	
		}
		
		public WebElement save_btn(WebDriver d)throws Exception
		{
			try
			{
				element=d.findElement(By.name("commit"));
				Thread.sleep(7000);
				System.out.println("Save button found");	
			}
			
			catch(Exception e)
			{
				throw e;
			}
			return element;	
		}
		
		
		
		public WebElement deactivate_btn(WebDriver d)throws Exception
		{
			try
			{
				element=d.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div/div/div/div[2]/div/div[1]/table/tbody/tr[1]/td[7]/a[2]/span"));
				Thread.sleep(7000);
				System.out.println("Deactivate button found");	
			}
			
			catch(Exception e)
			{
				throw e;
			}
			return element;	
		}
		
		public WebElement btn_deactivate(WebDriver d)throws Exception
		{
			try
			{
				element=d.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div/div[3]/div/a"));
				Thread.sleep(7000);
				System.out.println("Deactivate button found on pop up");	
			}
			
			catch(Exception e)
			{
				throw e;
			}
			return element;	
		}
		
		public WebElement activate_btn(WebDriver d)throws Exception
		{
			try
			{
				element=d.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div/div/div/div[2]/div/div[1]/table/tbody/tr[1]/td[7]/a[3]/span"));
				Thread.sleep(7000);
				System.out.println("Deactivate button found on pop up");	
			}
			
			catch(Exception e)
			{
				throw e;
			}
			return element;	
		}
		
		public WebElement btn_activate(WebDriver d)throws Exception
		{
			try
			{
				element=d.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div/div[3]/div/a"));
				Thread.sleep(7000);
				System.out.println("activate button found on pop up");	
			}
			
			catch(Exception e)
			{
				throw e;
			}
			return element;	
		}
		
		
		
		
}