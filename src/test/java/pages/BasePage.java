package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.extentreports.ExtentLogger;


public class BasePage {

	protected void type(WebDriver driver,By by, String textToType,String elementtextbox) {
		driver.findElement(by).sendKeys(textToType);
		//ExtentLogger.info(textToType +" is entered successfully in "+ elementtextbox);
	}

	protected void click(WebDriver driver,By by,String elementname) {
		driver.findElement(by).click();
		//ExtentLogger.info(elementname +" is clicked successfully");
	}

	protected String getTitle(WebDriver driver) {

		return driver.getTitle();
	}

	protected boolean isElementDisplayed(WebDriver driver,By by) {
		return driver.findElement(by).isDisplayed();
	}
}
