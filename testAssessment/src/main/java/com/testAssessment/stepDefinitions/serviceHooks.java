package com.testAssessment.stepDefinitions;


import com.testAssessment.enums.Browsers;
import com.testAssessment.testBase.testBase;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class serviceHooks {

testBase TestBase;
	
	@Before
	public void initializeTest() {
		TestBase = new testBase();
		TestBase.SelectBrowser(Browsers.CHROME.name());
		
	}

	@After
	public void endTest() {
		testBase.driver.quit();
	}
}
