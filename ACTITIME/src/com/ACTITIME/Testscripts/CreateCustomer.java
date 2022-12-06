package com.ACTITIME.Testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ACTITIME.Generic.BaseClass;
import com.ACTITIME.Pom.HomePage;
import com.ACTITIME.Pom.TaskPage;


@Listeners(com.ACTITIME.Generic.Listnerimplementation.class)
public class CreateCustomer extends BaseClass {
	
	
@Test
public void createCustomer() throws InterruptedException, EncryptedDocumentException, IOException  {
	  HomePage hp = new HomePage(driver);
	  hp.tasktab();
	  Thread.sleep(5000);
	  
	TaskPage tp = new TaskPage(driver);
	tp.addnew();
	
}
}

