package TestClass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import BaseClass.BaseClass;

import POMClass.Home_Page;
import POMClass.Login_Page;

public class TestClass {
	WebDriver driver;
	Login_Page lp;
	Home_Page hp;

//	 ExtentHtmlReporter htmlReporter;
//		ExtentReports report;
//		ExtentTest test;

	@BeforeClass
	public void openBrowser() {
		driver = BaseClass.openBrowser();
//	   htmlReporter = BaseClass1.gethtmlReporter();
//	   report = BaseClass1.getExtentReports();
//	   test = BaseClass1.getTestForReproter("VerifyUsercanLogin");

	}

	@BeforeMethod
	public void loginToApp() {
		lp = new Login_Page(driver);
		hp = new Home_Page(driver);
	}

	@Test
	public void HomePage() {
		lp.inpHomePageClosedButton();

	}

	@Test
	public void HomePage1() {
		hp.SearchFeild();
		hp.SearchBtn();
		hp.SelectMobile();
		hp.Addtocart();
	}

	@AfterMethod
	public void logoutFromApp() {
	//	driver.quit();

	}

}
