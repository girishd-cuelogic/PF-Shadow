package driverinit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Appdriver
{
	WebDriver driver = null;
	
	public WebDriver driverInit()
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setJavascriptEnabled(true);
		caps.setCapability("cssSelectorsEnabled", false);
		caps.setCapability("applicationCacheEnabled", true);
		caps.setCapability("acceptSslCerts",true);
		System.setProperty("webdriver.chrome.driver", "D://SeleniumDrivers//chromedriver_win32//chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "D://SeleniumDrivers//Firefox//geckodriver.exe");
		driver=new ChromeDriver(caps);	
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().getCookies();
		return driver;
	
	}
	
	/*Appdriver() {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setJavascriptEnabled(true);
		caps.setCapability("cssSelectorsEnabled", false);
		caps.setCapability("applicationCacheEnabled", true);
		caps.setCapability("acceptSslCerts",true);
		System.setProperty("webdriver.chrome.driver", "D://SeleniumDrivers//chromedriver_win32//chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "D://SeleniumDrivers//Firefox//geckodriver.exe");
		driver=new ChromeDriver(caps);	
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().getCookies();
//		return driver;
	}
	
	public static WebDriver getInstance() {
		if(driver == null){
			driver = (WebDriver) new Appdriver();
			System.out.println(driver + "++++++++++++++++++++++++++++");
			
		}
		System.out.println(driver+ "*******************************");
		return driver;
	}*/
}