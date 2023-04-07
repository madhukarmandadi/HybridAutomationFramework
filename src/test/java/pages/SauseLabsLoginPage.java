package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauseLabsLoginPage extends BasePage {

	WebDriver driver;

	public SauseLabsLoginPage(WebDriver driver) {
		super();
		this.driver=driver;
	}

	private final By textbox_username = By.id("user-name");
	private final By textbox_password = By.id("password");
	private final By buttonLogin = By.id("login-button");

	public String getPageTitle(WebDriver driver) {

		return getTitle(driver);
	}

	public SauseLabsLoginPage enterUserName() {
		type(driver,textbox_username, "standard_user","username");
		return this;
	}

	public SauseLabsLoginPage enterPassword() {

		type(driver,textbox_password, "secret_sauce","Password");
		return this;
	}

	public SauseLabsHomePage clickLoginButton() {

		click(driver,buttonLogin,"login button");
		return new SauseLabsHomePage(driver);
	}

}
