package testcases;

import org.testng.annotations.Test;

import com.driver.DriverFactory;
import com.driver.DriverFactory;
import com.extentreports.ExtentLogger;
import com.extentreports.ExtentReport;

import base.BaseTest;
import pages.SauseLabsHomePage;
import pages.SauseLabsLoginPage;

public class LoginSauseLabsTest extends BaseTest {

	SauseLabsLoginPage sauseLabsLoginPage;
	SauseLabsHomePage sauseLabsHomePage;

	@Test
	public void loginTest() {

		ExtentReport.createTest("Login 1 Test");
		ExtentLogger.info("Login test started");
		
		sauseLabsLoginPage = new SauseLabsLoginPage(DriverFactory.getDriver());
		sauseLabsLoginPage.enterUserName().enterPassword().clickLoginButton();
		
		sauseLabsHomePage = new SauseLabsHomePage(DriverFactory.getDriver());
		sauseLabsHomePage.clickBurgerMenu().verifyLogin().clickLogout();
		
		ExtentLogger.pass("Login 1 test passeed");
		
	}

	
	
}
