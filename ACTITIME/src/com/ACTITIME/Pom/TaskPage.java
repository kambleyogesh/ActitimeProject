package com.ACTITIME.Pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ACTITIME.Generic.ReadDataFromExcel;

public class TaskPage {
	
@FindBy(xpath="//div[.='Add New']")
private WebElement Addnewbtn;

@FindBy(xpath="//div[.='+ New Customer']")
private WebElement newcustomer;

@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
private WebElement custname;

@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
private WebElement description;

@FindBy(xpath="//div[@class='dropdownButton']")
private WebElement dropdown;

@FindBy(xpath="(//div[.='Big Bang Company'])[6]")
private WebElement compname;

public TaskPage(WebDriver driver) {
PageFactory.initElements(driver, this);
}

public WebElement getCustomer() {
	return custname;
}


public WebElement getAddnewbtn() {
return Addnewbtn;	
}

public WebElement getNewcustomer() {
	return newcustomer;
}

public void addnew() throws EncryptedDocumentException, IOException, InterruptedException {
	ReadDataFromExcel r = new ReadDataFromExcel();
	String customer = r.readDataFromExcelFile("Sheet1", 1, 1);
	
	
	Addnewbtn.click();
	newcustomer.click();
	Thread.sleep(5000);
	custname.sendKeys(customer);
	description.sendKeys("Banking");
	dropdown.click();
	compname.click();

}

public WebElement getDescription() {
	return description;
}

public WebElement getDropdown() {
	return dropdown;
}

public WebElement getCompname() {
	return compname;
}



}
