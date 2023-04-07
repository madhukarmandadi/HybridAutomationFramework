package com.extentreports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {
	private ExtentReport() {
	}
	public static ExtentReports reports;
	//not required because we are initializing this in ExtentManager class
	// to create thread safe test
	//public static ExtentTest test;

	public static void initReports() {
		if (Objects.isNull(reports)) {
			reports = new ExtentReports();
			ExtentSparkReporter spark = new ExtentSparkReporter("indexreport.html");
			spark.config().setTheme(Theme.DARK);
			spark.config().setDocumentTitle("UI Automation Report");
			spark.config().setReportName("Extent Report Demo");
			reports.attachReporter(spark);
		}
	}

	public static void flushReports() throws IOException {
		if (Objects.nonNull(reports)) {
			reports.flush();
		}
		Desktop.getDesktop().browse(new File("indexreport.html").toURI());
	}

	public static void createTest(String testcasename) {
		ExtentTest test = reports.createTest(testcasename);
		ExtentManager.setExtentTest(test);
	}
}
