package com.crm.qa.testcases;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

import junit.framework.Assert;

public class HomePageTest extends HomePage  {
LoginPage loginPage;
HomePage homePage;
TestUtil testUtil;
ContactsPage contactsPage; 
	 public HomePageTest() {
		// TODO Auto-generated constructor stub
	super();
	 }
	 
	 @BeforeMethod
	 public void setUp() {
		 initialization();
		 testUtil =new TestUtil();
		 loginPage =new LoginPage();
		 homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
				 
	@Test(priority=1)
	public void verifyHomePageTitleTest() {
		String homePageTitle= homePage.verifyHomePageTitle();
	Assert.assertEquals(homePageTitle,"Crmpro","home page title not matched" );
	
	}   
	 
@Test(priority=2)
public void verifyUserNameTest() {
testUtil.switchToFrame();
	Assert.assertTrue(homePage.verifyUserName()); 
}	
@Test
public void verifyContactLinkTest() {
testUtil.switchToFrame();
contactsPage =homePage.clickOnContactsLink();
}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
		
		
 			
 	}
		 
		 
	 }
	 
	 
 	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
