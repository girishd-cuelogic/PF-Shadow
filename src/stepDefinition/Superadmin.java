package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Pageobject.MenuSubmenu;
import Pageobject.Messages;
import csvRead.ShadowLoginDetails;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driverinit.Appdriver;

public class Superadmin
{
	WebElement element = null;
	String message = null;
	Appdriver intdriver = new Appdriver();
    WebDriver d = intdriver.driverInit();
	Messages msg= new Messages();
	MenuSubmenu menu = new MenuSubmenu(); 
	
	
	@When("^click on admin menu$")
    public void admin_menu() throws Exception 
    {
    	menu.menu_admin(d).click();
    	System.out.println("Clicked on admin menu");
    	
    }
	
	
	@When("^click on create account submenu$")
    public void create_account_submenu() throws Exception 
    {
    	menu.submenu_create_acct(d).click();
    	System.out.println("Clicked on create account submenu");
    	
    }
	
	
}