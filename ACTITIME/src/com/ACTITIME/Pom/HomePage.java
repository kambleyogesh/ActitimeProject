package com.ACTITIME.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(id="logoutLink")
	private WebElement lgoutInk;
	
	@FindBy(xpath="//div[.='Tasks']")
	private WebElement TaskInk;
	
	@FindBy(xpath="//div[=.'Reports']")
	private WebElement reportInk;
	
	@FindBy(xpath="//div[.='Users']")
	private WebElement userInk;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	

	public WebElement getLgoutInk() {
		return lgoutInk;
	}

	public WebElement getTaskInk() {
		return TaskInk;
	}

	public WebElement getReportInk() {
		return reportInk;
	}

	public WebElement getUserInk() {
		return userInk;
	}
	
	public void logout() {
		lgoutInk.click();
	}
	
	public void report() {
		reportInk.click();
	}
	
	public void tasktab() {
		TaskInk.click();
	}

	
}
