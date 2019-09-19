package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {

	
	
@FindBy(xpath="//td[contains(text(),'Contacts')]")
WebElement contactsLabel;

//intializing the page object
public ContactsPage() {
	PageFactory.initElements(driver,this);
}

public boolean verifytContactsLabel() {
	return contactsLabel.isDisplayed();
}
public void selectContactsByName(String name) {
driver.findElement(By.xpath(xpathExpression));

}
}














}
