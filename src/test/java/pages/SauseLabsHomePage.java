package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauseLabsHomePage extends BasePage {

	WebDriver driver;

	public SauseLabsHomePage(WebDriver driver) {
		this.driver = driver;
	}

	private final By burgerMenuButton = By.id("react-burger-menu-btn");
	private final By logoutLink = By.id("logout_sidebar_link");

	public SauseLabsHomePage clickBurgerMenu() {
		click(driver,burgerMenuButton,"Ham burger menu button");
		return new SauseLabsHomePage(driver);
	}

	public SauseLabsLoginPage clickLogout() {
		click(driver,logoutLink,"login link");
		return new SauseLabsLoginPage(driver);
	}

	public SauseLabsHomePage verifyLogin() {
		isElementDisplayed(driver,logoutLink);
		return new SauseLabsHomePage(driver);
	}

}
