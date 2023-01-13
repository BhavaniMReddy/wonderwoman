package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
@FindBy(xpath="//div[text()='Add New']")
private WebElement addNewBtn;
@FindBy(xpath="//div[text()='+ New Customer']")
private WebElement newCustOption;
@FindBy(xpath="//input[@placeholder='Enter Customer Name'])[2]")
private WebElement enterCustNameTbx;
@FindBy(xpath="//input[@placeholder='Enter Customer Description']")
private WebElement enterCustdescTbx;
@FindBy(xpath="//div[text()='+ Select Customer'])[1]")
private WebElement selectCusttbx;
@FindBy(xpath="//div[text()='Our Company'])[2]")
private WebElement ourCompanyTx;
@FindBy(xpath="//div[text()='Create Customer'])")
private WebElement createCustTbx;
@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
private WebElement actualCustomer;

public TaskListPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public WebElement getAddNewBtn() {
	return addNewBtn;
}
public WebElement getNewCustOption() {
	return getNewCustOption();
}

public WebElement getEnterCustNameTbx() {
	return enterCustNameTbx;
}
public WebElement getEnterCustDescTbx() {
	return enterCustdescTbx;
}
public WebElement getSelectCustDD() {
	return selectCusttbx;
}
public WebElement getOurCompany() {
	return ourCompanyTx;
}
public WebElement getCreateCustBtn() {
	return createCustTbx;
}
public WebElement getActualCustomer() {
	return actualCustomer;
}

}

