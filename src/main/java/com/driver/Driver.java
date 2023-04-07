package com.driver;

import java.io.IOException;
import java.time.Duration;
import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadPropertyFile;

//String browser = System.getProperty("browser","chrome");
public class Driver {

	public static WebDriver driver = null;

	public static WebDriver initDriver() throws Exception {

		String browser = ReadPropertyFile.get("browser");
		if (Objects.isNull(DriverFactory.getDriver())) {
			switch (browser) {
			case "chrome":
				WebDriverManager.chromedriver().create();
				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.addArguments("--disable-notifications");
				chromeOptions.addArguments("--remote-allow-origins=*");
				driver = new ChromeDriver(chromeOptions);
				break;
			case "edge":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;
			default:
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			}
			DriverFactory.setDriver(driver);
			DriverFactory.getDriver().manage().window().maximize();
			DriverFactory.getDriver().get(ReadPropertyFile.get("url"));
			DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}
		return driver;

	}

	public static void closeDriver() throws IOException {

		if (Objects.nonNull(DriverFactory.getDriver())) {
			DriverFactory.getDriver().quit();
			DriverFactory.unlaod();
		}
		// kill driver program in the system
		Runtime.getRuntime().exec("taskkill /f /im chromedriver.exe");

	}

}
