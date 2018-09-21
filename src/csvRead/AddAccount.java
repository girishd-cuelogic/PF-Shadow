package csvRead;

import java.io.FileReader;

import org.openqa.selenium.WebDriver;

import com.opencsv.CSVReader;

import Pageobject.Users;


public class AddAccount {

	Users use =new Users();
		
	 String CSV_PATH = "C:/Users/Tejas Chaudhari/Documents/EclipseWorkspace/PF-Shadow/Utilities/Addaccount.csv";
	 
	 public void csvlogin(WebDriver driver) throws Exception
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