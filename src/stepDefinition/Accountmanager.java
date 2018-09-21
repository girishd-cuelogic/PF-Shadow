package stepDefinition;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

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

public class Accountmanager
{
	String url="http://wid.int.travelpass.com/";
	MenuSubmenu menusub = new MenuSubmenu();
	ShadowLoginDetails login = new ShadowLoginDetails();
	Appdriver intdriver = new Appdriver();
    WebDriver d = intdriver.driverInit();
    ShadowPage page= new ShadowPage();
    Users use = new Users();
    AddUser Add= new AddUser();
    Messages msg = new Messages();
    
    @Given("^Users should navigate to login page and clicks on login$")
    public void get_shadow_url() throws Exception
    {
      try
      {
    	  d.get(url);
    	  if(d.getCurrentUrl().contains("wid.int.travelpass.com"))
    	  {
    		  
    		  System.out.println("Shadow url found");
    		  page.txt_Login(d).click();
    		  Thread.sleep(8000);
    		  login.csvDataRead(d);
    		  page.txt_username(d).click();
    		  page.txt_password(d).click();
    		  page.btn_login(d).click();
    		 
    	  }
    	  else
    	  {
    		  System.out.println("Shadow url not found");
    	  }
    	  
    	     	  
    	  
      }
      catch(Exception e)
      {
  		  throw e;
      }
    }    
    

    @When("^User Clicks on account manager menu$")
    public void account_click() throws Exception 
	   {
		    try
		    {
		    	
		    	menusub.menu_Accountmgr(d).click();
		   		Thread.sleep(6000);
		   		System.out.println("Clicked on account manager");
		    }
		    catch(Exception e)
		    {
		    	throw e;
		    }
		
	   }
    
    @When("^User clicks on users submenu$")
    public void user_click() throws Exception 
	   {
		    try
		    {
		    	
		    	menusub.submenu_users(d).click();
		   		Thread.sleep(6000);
		   		System.out.println("Clicked on users menu");
		    }
		    catch(Exception e)
		    {
		    	throw e;
		    }
		
	   }  
    
    @When("^User clicks on Add User button$")
    public void adduser_click() throws Exception 
	   {
		    try
		    {
		    	
		    	use.btn_adduser(d).click();
		   		Thread.sleep(6000);
		   		System.out.println("Clicked on Add users button");
		    }
		    catch(Exception e)
		    {
		    	throw e;
		    }
		
	   }  
    
    
    @When("^User enters information on add user pop up$")
    public void User_info() throws Exception 
	   {
		    try
		    {
		    	
		    	use.txt_firstname(d).click();
		    	Add.csvfirstname(d);
		    	use.txt_lastname(d).click();
		    	Add.csvlastname(d);
		    	use.txt_phonenumber(d).click();
		    	Add.csvphone(d);
		    	use.txt_email(d).click();
		    	Add.csvemailaddress(d);
		    	use.txt_confirmemail(d).click();
		    	Add.csvconfirmemail(d);
		   		
		    }
		    catch(Exception e)
		    {
		    	throw e;
		    }
		
	   }  
    
    @When("^User clicks on add user button$")
    public void click_adduser() throws Exception 
	   {
		    try
		    {
		    	
		      	use.btn_add(d).click();
		      	((JavascriptExecutor) d).executeScript("window.scrollBy(0,800)");
		   		Thread.sleep(8000);
		   		System.out.println("Clicked on Add users button");
		   		
		    }
		    catch(Exception e)
		    {
		    	throw e;
		    }
		
	   }
    
    @Then("^User should see add user successful message$")
    public void adduser_msg() throws Exception 
	   {
		    try
		    {
		    	if(msg.txt_adduser(d).getText().contains("User was successfully created."))
		    	{
		    		System.out.println("User created successfully");
		    		d.close();
		    	}
		      	
		    	else
		    	{
		    		System.out.println("User is not created");
		    	}
		    	
		    	
		    }
		    catch(Exception e)
		    {
		    	throw e;
		    }
		
	   }
    
    @When("^I click edit icon from the user list$")
    public void click_edituser() throws Exception 
	   {
		    try
		    {
		    	
		      	use.btn_edit(d).click();
		      	((JavascriptExecutor) d).executeScript("window.scrollBy(0,800)");
		   		Thread.sleep(8000);
		   		System.out.println("Clicked on Edit users button");
		   		
		    }
		    catch(Exception e)
		    {
		    	throw e;
		    }
		
	   }
    
    @When("^I update user details$")
    public void edit_user() throws Exception 
	   {
		    try
		    {
		    	
		      	use.edit_fn(d).click();
		      	System.out.println("Clicked first name");
		      	
		      	Add.csvEditfn(d);
		      	use.edit_ln(d).click();
		      	System.out.println("Clicked last name");
		      	Add.csvEditln(d);
		    }
		    catch(Exception e)
		    {
		    	throw e;
		    }
		
	   }
    
    @When("^I click on update button$")
    public void save_click() throws Exception 
	   {
		    try
		    {
		    	
		      	use.btn_save(d).click();
		      	Thread.sleep(6000);
		      	System.out.println("Clicked on save button");
		    }
		    catch(Exception e)
		    {
		    	throw e;
		    }
		
	   }
    
    
    
    @Then("^I should see page with message User was successfully updated$")
    public void edit_success() throws Exception 
	   {
		    try
		    {
		    	
		      if(msg.edit_msgs(d).getText().contains("User was successfully updated."))
		      {
		    	  System.out.println("User updated succesfully"); 
		    	  d.close();
		      }
		      
		      else
		      {
		    	  System.out.println("User is not updated");
		      }
		      
		    }
		    catch(Exception e)
		    {
		    	throw e;
		    }
		
	   }
    
    @When("^I click delete icon from the user list$")
    public void delete_icon() throws Exception 
	   {
		    try
		    {
		    	
		      	use.delete_icon(d).click();
		      	Thread.sleep(6000);
		      	System.out.println("Clicked on delete icon");
		    }
		    catch(Exception e)
		    {
		    	throw e;
		    }
		
	   }
    
    @When("^I click on delete button$")
    public void delete_btn() throws Exception 
	   {
		    try
		    {
		    	
		      	use.btn_delete(d).click();
		      	System.out.println("Clicked on delete icon");
		    }
		    catch(Exception e)
		    {
		    	throw e;
		    }
		
	   }
    
    @Then("^I should see page with message User was successfully deleted$")
    public void delete_success() throws Exception 
	   {
		    try
		    {
		    	
		      if(msg.delete_msgs(d).getText().contains("User was successfully destroyed."))
		      {
		    	  System.out.println("User deleted succesfully"); 
		    	  d.close();
		      }
		      
		      else
		      {
		    	  System.out.println("User is not deleted");
		      }
		      
		    }
		    catch(Exception e)
		    {
		    	throw e;
		    }
		
	   }
    
     
    
    
}