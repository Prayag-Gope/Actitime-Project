package com.actitime.testscript;

import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

public class NewTasksModule extends BaseClass {
	@Test
	public void NewTasks() {
		
		HomePage h=new HomePage(driver);
		h.setTask();
		TaskListPage t=new TaskListPage(driver);
		t.getAddnewBtn().click();
		t.getNewtasks().click();
		t.getNewTaskDD().click();
		t.getSplndrBtn();
		t.getNewTaskprjct();
		
	}

}
