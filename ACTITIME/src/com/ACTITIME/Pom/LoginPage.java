package com.ACTITIME.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ACTITIME.Generic.BaseClass;

public class LoginPage extends BaseClass {
@FindBy(id="username")
private WebElement untbx;

@FindBy(name="pwd")
private WebElement pwtbx;

@FindBy(xpath="//div[.='Login ']")
private WebElement lgbtn;

public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}

public WebElement getUntbx() {
	return untbx;
}

public WebElement getPwtbx() {
	return pwtbx;
}

public WebElement getLgbtn() {
	return lgbtn;
}

//Generic Method
public void loginToActitime(String un,String pw) {
	untbx.sendKeys(un);
	pwtbx.sendKeys(pw);
	lgbtn.click();
}
}
