package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

public class CustomerModule extends BaseClass{
	@Test
	public void CreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		
		FileLib fl = new FileLib();
		String Projname = fl.getExcelData("CreateCustomer", 2, 2);
		String projDesc = fl.getExcelData("CreateCustomer", 2, 3);
		
		
		Reporter.log("create Customer",true);
		
		HomePage hp = new HomePage(driver);
		hp.setTask();
		
		//Customer Module
		
		TaskListPage t= new TaskListPage(driver);
		t.getAddnewBtn().click();
		t.getNewcostBtn().click();
		t.getEntcostname().sendKeys(Projname);
		t.getEntcostdesc().sendKeys(projDesc);
		t.getSelCostDD().click();
		t.getSelOurComp().click();
		t.getCrtBtn().click();
		Thread.sleep(1000);
		
	}

}
