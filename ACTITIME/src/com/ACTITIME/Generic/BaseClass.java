package com.ACTITIME.Generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ACTITIME.Pom.HomePage;
import com.ACTITIME.Pom.LoginPage;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static WebDriver driver;
@BeforeSuite
public void databaseconnection() {
	Reporter.log("database connected",true);
}
@AfterSuite
public void databasedisconnected() {
	Reporter.log("database disconnected",true);
}
@BeforeTest
public void launchBrowser() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
}


@AfterTest
public void closebrowser() {
	
	driver.close();
}

@BeforeMethod
public void login() throws IOException {
	ReadDataFromPropertyFile data = new ReadDataFromPropertyFile();
	String ur1 = data.ReadDataFromProperty("url");
	String un = data.ReadDataFromProperty("username");
	String pw = data.ReadDataFromProperty("password");
	
	driver.get(ur1);
    LoginPage lp = new LoginPage(driver);
    lp.loginToActitime(un, pw);
}

@AfterMethod
public void logout() throws InterruptedException {
	Thread.sleep(5000);
    HomePage hp = new HomePage(driver);
    hp.logout();
}
}
