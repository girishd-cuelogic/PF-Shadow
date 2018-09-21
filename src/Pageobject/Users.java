package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Users
{
	WebElement element = null;
	String message = null;

	  public WebElement btn_adduser(WebDriver d)throws Exception
	    {
	 	   try
	 	   {
	 		   element= d.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div/div[1]/div/div/div/div/a"));
	 		   System.out.println("Add user button found");
	 	   }
	 	   
	 	   catch(Exception e)
	 		 {
	 		   throw e;
	 		  }
	 		
	 		 return element;
	     }
	  
	  
	  public WebElement txt_firstname(WebDriver d)throws Exception
	    {
	 	   try
	 	   {
	 		   element= d.findElement(By.id("first_name"));
	 		   System.out.println("First Name found");
	 	   }
	 	   
	 	   catch(Exception e)
	 		 {
	 		   throw e;
	 		  }
	 		
	 		 return element;
	     }

	  public WebElement txt_lastname(WebDriver d)throws Exception
	    {
	 	   try
	 	   {
	 		   element= d.findElement(By.id("last_name"));
	 		   System.out.println("Last Name found");
	 	   }
	 	   
	 	   catch(Exception e)
	 		 {
	 		   throw e;
	 		  }
	 		
	 		 return element;
	     }

	  public WebElement txt_phonenumber(WebDriver d)throws Exception
	    {
	 	   try
	 	   {
	 		   element= d.findElement(By.id("phone"));
	 		   System.out.println("Phone number found");
	 	   }
	 	   
	 	   catch(Exception e)
	 		 {
	 		   throw e;
	 		  }
	 		
	 		 return element;
	     }
	  public WebElement txt_email(WebDriver d)throws Exception
	    {
	 	   try
	 	   {
	 		   element= d.findElement(By.id("email"));
	 		   System.out.println("Email found");
	 	   }
	 	   
	 	   catch(Exception e)
	 		 {
	 		   throw e;
	 		  }
	 		
	 		 return element;
	     }


	  
	  public WebElement txt_confirmemail(WebDriver d)throws Exception
	    {
	 	   try
	 	   {
	 		   element= d.findElement(By.id("email_confirmation"));
	 		   System.out.println("Confirmation Email found");
	 	   }
	 	   
	 	   catch(Exception e)
	 		 {
	 		   throw e;
	 		  }
	 		
	 		 return element;
	     }

	  public WebElement btn_add(WebDriver d)throws Exception
	    {
	 	   try
	 	   {
	 		   element= d.findElement(By.name("commit"));
	 		   System.out.println("Add button found");
	 	   }
	 	   
	 	   catch(Exception e)
	 		 {
	 		   throw e;
	 		  }
	 		
	 		 return element;
	     }

	  
	  
			  
		public WebElement btn_edit(WebDriver d)throws Exception
	    {
	 	   try
	 	   {
	 		   element= d.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div/div[1]/div/div/div/div/div[2]/div/div/div[1]/table/tbody/tr/td[7]/a[1]"));
	 		   System.out.println("Edit button found");
	 	   }
	 	   
	 	   catch(Exception e)
	 		 {
	 		   throw e;
	 		  }
	 		
	 		 return element;
	     }
		  
		  
		public WebElement edit_fn(WebDriver d)throws Exception
	    {
	 	   try
	 	   {
	 		   element= d.findElement(By.id("first_name"));
	 		   System.out.println("First name found");
	 		   element.clear();
	 		   
	 	   }
	 	   
	 	   catch(Exception e)
	 		 {
	 		   throw e;
	 		  }
	 		
	 		 return element;
	     }
		
		public WebElement edit_ln(WebDriver d)throws Exception
	    {
	 	   try
	 	   {
	 		   		   
	 		  element= d.findElement(By.id("last_name"));
	 		 element.clear();
	 	   }
	 	   
	 	   catch(Exception e)
	 		 {
	 		   throw e;
	 		  }
	 		
	 		 return element;
	     }

		public WebElement btn_save(WebDriver d)throws Exception
	    {
	 	   try
	 	   {
	 		   		   
	 		  element= d.findElement(By.name("commit"));
	 		 
	 	   }
	 	   
	 	   catch(Exception e)
	 		 {
	 		   throw e;
	 		  }
	 		
	 		 return element;
	     }
		
		public WebElement delete_icon(WebDriver d)throws Exception
	    {
	 	   try
	 	   {
	 		   		   
	 		  element= d.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div/div[1]/div/div/div/div/div[2]/div/div/div[1]/table/tbody/tr/td[7]/a[2]"));
	 		 
	 	   }
	 	   
	 	   catch(Exception e)
	 		 {
	 		   throw e;
	 		  }
	 		
	 		 return element;
	     }
		
		public WebElement btn_delete(WebDriver d)throws Exception
	    {
	 	   try
	 	   {
	 		   		   
	 		  element= d.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div/div[3]/div/a"));
	 		 
	 	   }
	 	   
	 	   catch(Exception e)
	 		 {
	 		   throw e;
	 		  }
	 		
	 		 return element;
	     }
		
			
}	








	
	