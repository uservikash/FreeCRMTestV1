package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.util.TestUtil;

public class TestBase {
public static WebDriver driver;
public static Properties prop; 
public TestBase() {
	

try{
	prop =new Properties();
	FileInputStream ip =new FileInputStream("C:\\Users\\vikas\\eclipse-workspace\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
	prop.load(ip);
	
}
catch(FileNotFoundException e)
{e.printStackTrace();

} 
catch(IOException e)
{
	e.printStackTrace();
	}





}
public static void initialization() {
	String browserName=prop.getProperty("browser");
	if(browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\");
		driver=new ChromeDriver();
	}	
		else if(browserName.equals("ff")) {
			System.setProperty("webdriver.gecko.driver","C:\\");
			driver=new FirefoxDriver();
			
		}
	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUTS,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		
		driver.get(prop.getProperty("url"));
}
}