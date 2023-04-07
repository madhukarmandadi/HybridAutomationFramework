package base;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.driver.Driver;
import com.extentreports.ExtentReport;

public class BaseTest {

	@BeforeSuite
	public void initReports() {
		ExtentReport.initReports();
	}
	@AfterSuite
	public void flush() throws IOException {
		ExtentReport.flushReports();
		Desktop.getDesktop().browse(new File("indexreport.html").toURI());
	}
	@BeforeMethod
	public WebDriver openBrowser() throws Exception {
		return Driver.initDriver();
	}
	@AfterMethod
	public void closeBrowser() throws IOException {
		Driver.closeDriver();
	}
}
