package csvRead;

import java.io.FileReader;

import org.openqa.selenium.WebDriver;

import com.opencsv.CSVReader;

import Pageobject.Users;


public class AddUser {

	Users use =new Users();
		
	 String CSV_PATH = "C:/Users/Tejas Chaudhari/Documents/EclipseWorkspace/PF-Shadow/Utilities/Adduser.csv";
	 
	 public void csvfirstname(WebDriver driver) throws Exception
	 {
		 try
		 {
			 CSVReader reader = new CSVReader(new FileReader(CSV_PATH), ',');

			  String [] csvCell;
			  String[] num = reader.readNext();

				  if ((csvCell = num) != null ) 
				  {   
					   String fname = csvCell[0];
					   
					   use.txt_firstname(driver).sendKeys(fname);
					   
				  }
		 }
		                      
		 catch(Exception e)
		 {
			 System.out.println("csvDataRead failed");
			 throw e;
		 }
		
	 }
	
	 public void csvlastname(WebDriver driver) throws Exception
	 {
		 try
		 {
			 CSVReader reader = new CSVReader(new FileReader(CSV_PATH), ',');

			  String [] csvCell;
			  String[] num = reader.readNext();

				  if ((csvCell = num) != null ) 
				  {   
					   String lname = csvCell[1];
					   
					   use.txt_lastname(driver).sendKeys(lname);
				  }
		 }
		 
		 catch(Exception e)
		 {
			 System.out.println("csvDataRead failed");
			 throw e;
		 }
		
	 }
	 
	 
	 public void csvphone(WebDriver driver) throws Exception
	 {
		 try
		 {
			 CSVReader reader = new CSVReader(new FileReader(CSV_PATH), ',');

			  String [] csvCell;
			  String[] num = reader.readNext();

				  if ((csvCell = num) != null ) 
				  {   
					   String lname = csvCell[2];
					   
					   use.txt_phonenumber(driver).sendKeys(lname);
				  }
		 }
		 
		 catch(Exception e)
		 {
			 System.out.println("csvDataRead failed");
			 throw e;
		 }
		
	 }
	 
	 public void csvemailaddress(WebDriver driver) throws Exception
	 {
		 try
		 {
			 CSVReader reader = new CSVReader(new FileReader(CSV_PATH), ',');

			  String [] csvCell;
			  String[] num = reader.readNext();

				  if ((csvCell = num) != null ) 
				  {   
					   String email = csvCell[3];
					   
					   use.txt_email(driver).sendKeys(email);
				  }
		 }
		 
		 catch(Exception e)
		 {
			 System.out.println("csvDataRead failed");
			 throw e;
		 }
		
	 }
	 
	 
	 	 public void csvconfirmemail(WebDriver driver) throws Exception
	 {
		 try
		 {
			 CSVReader reader = new CSVReader(new FileReader(CSV_PATH), ',');

			  String [] csvCell;
			  String[] num = reader.readNext();

				  if ((csvCell = num) != null ) 
				  {   
					   String pwd = csvCell[4];
					   
					   use.txt_confirmemail(driver).sendKeys(pwd);
				  }
		 }
		 
		 catch(Exception e)
		 {
			 System.out.println("csvDataRead failed");
			 throw e;
		 }
		
	 }

	 	 public void csvEditfn(WebDriver driver) throws Exception
	 {
		 try
		 {
			 CSVReader reader = new CSVReader(new FileReader(CSV_PATH), ',');

			  String [] csvCell;
			  String[] num = reader.readNext();

				  if ((csvCell = num) != null ) 
				  {   
					   String editfn = csvCell[5];
					   
					   use.edit_fn(driver).sendKeys(editfn);
				  }
		 }
		 
		 catch(Exception e)
		 {
			 System.out.println("csvDataRead failed");
			 throw e;
		 }
		
	 }
	 	 
	 	 public void csvEditln(WebDriver driver) throws Exception
		 {
			 try
			 {
				 CSVReader reader = new CSVReader(new FileReader(CSV_PATH), ',');

				  String [] csvCell;
				  String[] num = reader.readNext();

					  if ((csvCell = num) != null ) 
					  {   
						   String editln = csvCell[6];
						   
						   use.edit_ln(driver).sendKeys(editln);
					  }
			 }
			 
			 catch(Exception e)
			 {
				 System.out.println("csvDataRead failed");
				 throw e;
			 }
			
		 }
	 	 
	 	 
}