package com.driver;

import org.openqa.selenium.WebDriver;

public class DriverFactory {

	private DriverFactory() {

	}

	private static ThreadLocal<WebDriver> dr = new ThreadLocal<>();

	public static WebDriver getDriver() {
		return dr.get();
	}

	public static void setDriver(WebDriver driverref) {
		dr.set(driverref);
	}

	public static void unlaod() {
		dr.remove();
	}
}
