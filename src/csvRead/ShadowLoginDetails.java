package csvRead;
import java.io.FileReader;

import org.openqa.selenium.WebDriver;

import com.opencsv.CSVReader;

import Pageobject.ShadowPage;
import stepDefinition.ShadowStep;


public class ShadowLoginDetails
{
	ShadowPage Shadow = new ShadowPage();
	
	//Provide CSV file path. It Is In D: Drive.
	 String CSV_PATH = "C:/Users/Tejas Chaudhari/Documents/EclipseWorkspace/PF-Shadow/Utilities/login1.csv";
	 

	 
	 public void csvDataRead(WebDriver driver) throws Exception
	 {
		 try
		 {
			 CSVReader reader = new CSVReader(new FileReader(CSV_PATH), ',');

			  String [] csvCell;
			  String[] num = reader.readNext();

			  
				  if ((csvCell = num) != null ) 
				  {   
					   String username = csvCell[0];
					   String password = csvCell[1];
					   String username1 = csvCell[2];
					   String password1 = csvCell[3];
					   System.out.println(username);
					   System.out.println(password);
					   Shadow.txt_username(driver).sendKeys(username);
					   Shadow.txt_password(driver).sendKeys(password);
					   Shadow.txt_username(driver).sendKeys(username1);
					   Shadow.txt_password(driver).sendKeys(password1);
					   					 
				  }
			  
		 }
		 catch(Exception e)
		 {
			 System.out.println("csvDataRead failed");
			 throw e;
		 }
	}
}
