package stepDefinition;

import org.openqa.selenium.WebDriver;

import Pageobject.Messages;
import Pageobject.ShadowPage;
import csvRead.ShadowLoginDetails;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driverinit.Appdriver;


public class ShadowStep 
{

	String url="http://wid.int.travelpass.com/";
	ShadowLoginDetails login = new ShadowLoginDetails();
	ShadowPage page= new ShadowPage();
	Appdriver intdriver = new Appdriver();
    WebDriver d = intdriver.driverInit();
    Messages msg= new Messages();
 
    
    
    @Given("^User should navigate to login page and clicks on login$")
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
    
    @When("^User enters valid login credentials$")
    public void enter_Usernamepwd() throws Exception 
    {
    	page.txt_username(d).click();
    	System.out.println("Clicked on email");
    	
    	login.csvDataRead(d);
    	
    }
    
    @When("^Click on Login button$")
    public void login_btn() throws Exception 
    {
    	page.btn_login(d).click();
    	System.out.println("Clicked on login");
//    	Thread.sleep(10000);
    	
    }
    
    @Then("^User should see Successful message$")
    public void success_message()throws Exception
    {
    	
		if(msg.txt_breadcrumb(d).getText().contains("Signed in successfully."))
		{
			System.out.println("Welcome to shadow");
			d.close();
		}
		else
		{
			System.out.println("Unable to login");
		}
			
    }
    
}  