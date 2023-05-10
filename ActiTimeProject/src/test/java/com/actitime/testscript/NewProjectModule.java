package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

public class NewProjectModule extends BaseClass{
	
	@Test
	public void createProject() throws EncryptedDocumentException, IOException, InterruptedException {
		String Projname = fl.getExcelData("CreateCustomer", 2, 4);
		String Projdesp = fl.getExcelData("CreateCustomer", 2, 5);
		String Task1 = fl.getExcelData("CreateCustomer", 2, 6);
		String Task2 = fl.getExcelData("CreateCustomer", 3, 6);
		String Task3 = fl.getExcelData("CreateCustomer", 4, 6);
		
		Reporter.log("new Project",true);
		
		HomePage hp= new HomePage(driver);
		hp.setTask();
		TaskListPage  t = new TaskListPage(driver);
		t.getAddnewBtn().click();
		t.getNewproject().click();
		t.getEntprojname().sendKeys(Projname);
		t.getAddprojdesc().sendKeys(Projdesp);
		t.getNewDD().click();
		t.getSplnderBtn().click();
		t.getEntTaskname1().sendKeys(Task1);
		t.getEntTaskname2().sendKeys(Task2);
		t.getEntTaskname3().sendKeys(Task3);
		t.getCrtprojBtn().click();
		Thread.sleep(1000);
	}

}
