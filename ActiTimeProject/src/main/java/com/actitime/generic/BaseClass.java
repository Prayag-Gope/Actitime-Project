package com.actitime.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	static {
		WebDriverManager.chromedriver().setup();
	}
	public static WebDriver driver;
	@BeforeTest
	public void OpenBrowser() {
		Reporter.log("OpenBrowser",true);
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@AfterTest
	public void closeBrowser() {
		Reporter.log("closeBrowser",true);
		//driver.quit();
	}
	public FileLib fl = new FileLib();
	@BeforeMethod
	public void LoginToApp() throws IOException {
		Reporter.log("LoginToApp",true);
		
		//FileLib fl = new FileLib();
		
		String url = fl.getPropertyData("url");
		String un = fl.getPropertyData("username");
		String pwd = fl.getPropertyData("password");
		driver.get(url);
		LoginPage lp= new LoginPage(driver);
		lp.setLogin(un, pwd);
		
		
	}
	@AfterMethod
	public void Logout() {
		Reporter.log("Logout",true);
		HomePage h= new HomePage(driver);
		//h.setLogoutBtn();
		
	}

}
