package com.crm.qa.testcases;

import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContactsPage contactsPage; 
		 public ContactsPageTest() {
			// TODO Auto-generated constructor stub
		super();
		 }
		@BeforeMethod
		 public void setUp() {
			 initialization();
			 testUtil =new TestUtil();
			 loginPage =new LoginPage();
			 homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
			 testUtil.switchToFrame();
		 	contactsPage=homePage.clickOnContactsLink(); 
		}
	@Test(priority=1 )
	public void verifyContactPageLabel() {
		Assert.assertTrue(contactsPage.verifytContactsLabel(),"contact page is missing on the page");
	}
	
@
	
	
	
	
	
	
	
	
}
