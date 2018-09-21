package csvRead;

import java.io.FileReader;

import org.openqa.selenium.WebDriver;

import com.opencsv.CSVReader;

import Pageobject.APIKeys;

public class AddApi {

	APIKeys api =new APIKeys();
		
	 String CSV_PATH = "C:/Users/Tejas Chaudhari/Documents/EclipseWorkspace/PF-Shadow/Utilities/AddApi.csv";
	 
	 public void csvsessionname(WebDriver driver) throws Exception
	 {
		 try
		 {
			 CSVReader reader = new CSVReader(new FileReader(CSV_PATH), ',');

			  String [] csvCell;
			  String[] num = reader.readNext();

				  if ((csvCell = num) != null ) 
				  {   
					   String sname = csvCell[0];
					   
					   api.session_name(driver).sendKeys(sname);
					   
				  }
		 }
		                      
		 catch(Exception e)
		 {
			 System.out.println("csvDataRead failed");
			 throw e;
		 }
		
	 }
	 
	 public void csveditsession(WebDriver driver) throws Exception
	 {
		 try
		 {
			 CSVReader reader = new CSVReader(new FileReader(CSV_PATH), ',');

			  String [] csvCell;
			  String[] num = reader.readNext();

				  if ((csvCell = num) != null ) 
				  {   
					   String sname = csvCell[1];
					   
					   api.editsession_name(driver).sendKeys(sname);
					   
				  }
		 }
		                      
		 catch(Exception e)
		 {
			 System.out.println("csvDataRead failed");
			 throw e;
		 }
		
	 }
	 
	 }