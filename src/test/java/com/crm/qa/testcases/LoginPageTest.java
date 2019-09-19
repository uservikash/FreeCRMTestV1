package com.crm.qa.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

import junit.framework.Assert;

public class LoginPageTest extends TestBase {
	LoginPage loginPage; 
	HomePage homePage;
	
public LoginPageTest() {
	super();               // no   nullPointerExeption by this step
}
	@BeforeMethod
	public void setUp() {
		initialiazation();
		loginPage= new LoginPage();
		
@Test(priority=1)
public void loginPageTitleTest() {
	String title =loginPage.validateLoginPageTitle();
Assert.assertEquals(title,"#1 free crm" );
}
@Test(priority=2)
public void crmLogoImageTest() {
	boolean flag = loginPage.validateCRMImage();
    Assert.assertTrue(flag);
}

@Test(priority=3)  
public void loginTest() {
	homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password")); 

}

@AfterMethod
		
public void tearDown() {
driver.quit();  
} 
		
}

}
