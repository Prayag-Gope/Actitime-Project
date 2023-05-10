package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	
	//Create customer
	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement addnewBtn;
	
	@FindBy(xpath = "//div[text()='+ New Customer']")
	private WebElement newcostBtn;
	
	@FindBy(xpath = "//input[@placeholder='Enter Customer Name' and @class='inputFieldWithPlaceholder newNameField inputNameField']")
	private WebElement entcostname;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement entcostdesc;
	
	@FindBy(xpath = "//div[text()='- Select Customer -' and @class= 'emptySelection' ]")
	private WebElement selCostDD;
	
	@FindBy(xpath = "//div[text()='Our company' and @class= 'itemRow cpItemRow ' ]")
	private WebElement selOurComp;
	
	@FindBy(xpath = "//div[text()='Create Customer']")
	private WebElement crtBtn;

	
	//New Project Module
	
	@FindBy(xpath = "//div[text()='+ New Project']")
	private WebElement newproject;
	
	@FindBy(xpath = "//input[@placeholder='Enter Project Name' and @class='projectNameField inputFieldWithPlaceholder inputNameField']")
	private WebElement entprojname;
	
	@FindBy(xpath = "//div[text()='-- Please Select Customer to Add Project for  --']")
	private WebElement newDD;
	
	@FindBy(xpath = "//div[text()='Splender' and @class='itemRow cpItemRow ']")
	private WebElement SplnderBtn;

	@FindBy(xpath = "//textarea[@placeholder='Add Project Description']")
	private WebElement addprojdesc;
	
	@FindBy(xpath = "(//input[@placeholder='Enter task name' and@class='inputFieldWithPlaceholder'])[1]")
	private WebElement entTaskname1;
	
	@FindBy(xpath = "(//input[@placeholder='Enter task name' and@class='inputFieldWithPlaceholder'])[2]")
	private WebElement entTaskname2;
	
	@FindBy(xpath = "(//input[@placeholder='Enter task name' and@class='inputFieldWithPlaceholder'])[3]")
	private WebElement entTaskname3;
	
	@FindBy(xpath = "//div[text()='Create Project']")
	private WebElement crtprojBtn;
	
	//New Tasks Module
	
	@FindBy(xpath = "//div[text()='+ New Tasks']")
	private WebElement newtasks;
	
	 @FindBy(xpath = "//div[text()='- Select Customer -']")
	 private WebElement newTaskDD;
	 
	 @FindBy(xpath = "(//div[text()='Splender' and @class='customerTitle'])[1]")
	 private WebElement SplndrBtn;
	 
	 @FindBy(xpath = "//div[text()='- Select Project -']")
	 private WebElement NewTaskprjct;
	 
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
		
	}
	
	// Create Customer Module getters

	public WebElement getAddnewBtn() {
		return addnewBtn;
	}

	public WebElement getNewcostBtn() {
		return newcostBtn;
	}

	public WebElement getEntcostname() {
		return entcostname;
	}

	public WebElement getEntcostdesc() {
		return entcostdesc;
	}

	public WebElement getSelCostDD() {
		return selCostDD;
	}

	public WebElement getSelOurComp() {
		return selOurComp;
	}

	public WebElement getCrtBtn() {
		return crtBtn;
	}

	
	// New Project Module getters
	
	public WebElement getNewproject() {
		return newproject;
	}

	public WebElement getEntprojname() {
		return entprojname;
	}

	public WebElement getAddprojdesc() {
		return addprojdesc;
	}

	public WebElement getNewDD() {
		return newDD;
	}
    
	public WebElement getSplnderBtn() {
		return SplnderBtn;
	}

	public WebElement getEntTaskname1() {
		return entTaskname1;
	}

	public WebElement getEntTaskname2() {
		return entTaskname2;
	}

	public WebElement getEntTaskname3() {
		return entTaskname3;
	}

	public WebElement getCrtprojBtn() {
		return crtprojBtn;
	}

	
	//New Tasks Module getters
	
	public WebElement getNewtasks() {
		return newtasks;
	}
	
	public WebElement getNewTaskDD() {
		return newTaskDD;
	}

	public WebElement getSplndrBtn() {
		return SplndrBtn;
	}

	public WebElement getNewTaskprjct() {
		return NewTaskprjct;
	}
	
	
	
	
	
}
