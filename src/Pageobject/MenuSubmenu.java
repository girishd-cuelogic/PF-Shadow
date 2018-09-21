package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuSubmenu
{
	WebElement element;
	
	public WebElement menu_Accountmgr(WebDriver driver)throws Exception
	{
		try
		{
			element= driver.findElement(By.xpath("/html/body/div[2]/aside/ul/li[2]/a"));
			System.out.println("Account manager menu found");
		}
		catch(Exception e)
		{
			System.out.println("Account manager menu not found");
			throw e;
			
		}
		return element;
		
	}
	
	public WebElement submenu_users(WebDriver driver)throws Exception
	{
		try
		{
			element= driver.findElement(By.xpath("/html/body/div[2]/aside/ul/li[2]/ul/li[1]/a"));
			System.out.println("Users submenu found");
		}
		catch(Exception e)
		{
			System.out.println("Users submenu not found");
			throw e;
			
		}
		return element;
		
	}
	
	public WebElement submenu_apikey(WebDriver driver)throws Exception
	{
		try
		{
			element= driver.findElement(By.xpath("/html/body/div[2]/aside/ul/li[2]/ul/li[2]/a"));
			System.out.println("API Keys submenu found");
		}
		catch(Exception e)
		{
			System.out.println("API Keys submenu not found");
			throw e;
			
		}
		return element;
		
	}
	
	public WebElement menu_admin(WebDriver driver)throws Exception
	{
		try
		{
			element= driver.findElement(By.xpath("/html/body/div[2]/aside/ul/li[4]/a"));
			System.out.println("Admin menu found");
		}
		catch(Exception e)
		{
			System.out.println("Admin menu not found");
			throw e;
			
		}
		return element;
		
	}
	
	
	
	public WebElement submenu_create_acct(WebDriver driver)throws Exception
	{
		try
		{
			element= driver.findElement(By.xpath("/html/body/div[2]/aside/ul/li[4]/ul/li[1]/a"));
			System.out.println("Create account submenu found");
		}
		catch(Exception e)
		{
			System.out.println("Create account submenu not found");
			throw e;
			
		}
		return element;
		
	}
	
	
	
}