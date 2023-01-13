package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass {
@Test
public void testCreateCustomer () throws EncryptedDocumentException, IOException
{
	String customerName = f.getExcelData("Create customer",1,2);
	String customerDescription = f.getExcelData("Create customer", 1, 3);
	Reporter.log("Create customer",true);
	HomePage e=new HomePage(driver);
	e.setTaskTab();
	TaskListPage t=new TaskListPage(driver);
	t.getAddNewBtn().click();
	t.getNewCustOption().click();
	t.getEnterCustNameTbx().sendKeys(customerName);
	t.getEnterCustDescTbx().sendKeys(customerDescription);
	t.getSelectCustDD().click();
	t.getOurCompany().click();
	t.getCreateCustBtn().click();
	WebDriverWait wait=new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.textToBePresentInElement(t.getActualCustomer(), customerName));
	String actualCustText = t.getActualCustomer().getText();
	Assert.assertEquals(actualCustText, customerName);
	
}
}
