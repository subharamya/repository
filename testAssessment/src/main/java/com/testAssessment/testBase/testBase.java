package com.testAssessment.testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.testAssessment.enums.Browsers;
import com.testAssessment.enums.OS;


public class testBase {

	
	public static WebDriver driver;

	public WebDriver SelectBrowser(String browser) {
		if (System.getProperty("os.name").toLowerCase().contains(OS.WINDOW.name().toLowerCase())) {
			if (browser.equalsIgnoreCase(Browsers.CHROME.name())) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "/src/test/resources/driver/chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			}

			if (browser.equalsIgnoreCase(Browsers.FIREFOX.name())) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "/src/test/resources/drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}

		}

		if (System.getProperty("os.name").toLowerCase().contains(OS.MAC.name().toLowerCase())) {
			if (browser.equalsIgnoreCase(Browsers.CHROME.name())) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}

			if (browser.equalsIgnoreCase(Browsers.FIREFOX.name())) {
				System.setProperty("webdriver.marionette.driver",
						System.getProperty("user.dir") + "/src/test/resources/drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}

		}
		
		return driver;

	}
}
