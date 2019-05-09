package com.testAssessment.pageObjects;


import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import com.testAssessment.helper.WaitHelper;
import com.testAssessment.helper.loggerHelper;

public class HomePage {

	WebDriver driver;
	
	private WaitHelper waitHelper;
	
	private static Logger log = loggerHelper.getLogger(HomePage.class);
	
	
	@FindBy(xpath="//*[@id=\"select2-drop\"]/div/input")
	WebElement SearchHotel;
	

	@FindBy(xpath="//*[@id=\"dpd1\"]/div/input")
	WebElement CheckIn;
	
	@FindBy(xpath="/html/body/div[10]/div[1]/table/thead/tr[1]/th[3]")
	WebElement btnNext;
	
	@FindBy(xpath="/html/body/div[10]/div[1]/table/tbody/tr[1]/td[7]")
	WebElement SelectFromDate;
	
	
	@FindBy(xpath="//*[@id=\"dpd2\"]/div/input")
	WebElement CheckOut;
	
	
	//@FindBy(xpath="/html/body/div[11]/div[1]/table/tbody/tr[2]/td[6]")
	//WebElement SelectToDate;
	
	
	
	@FindBy(xpath="//*[@id=\"travellersInput\"]")
	WebElement NofPersons;
	
	@FindBy(xpath="//*[@id=\"adultInput\"]")
	WebElement Adults;
	
	@FindBy(id="childPlusBtn")
	WebElement Children;
	
	@FindBy(xpath="//*[@id=\"hotels\"]/form/div[5]/button")
	WebElement btnSearch;
	
	@FindBy(xpath="//*[@id=\"body-section\"]/div[5]/div/div[2]/form/button[1]")
	WebElement starGrade;
	
	@FindBy(xpath="//*[@id=\"body-section\"]/div[5]/div/div[3]/div[1]/div/table/tbody/tr[1]/td/div[1]/div")
	WebElement firstSearchResult;
	
	
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}
	
	public void btnSearchDisplay() {
		waitHelper.WaitForElement(btnSearch, 60);
		log.info("Web Element is displayed" + starGrade);
		btnSearch.isDisplayed();
	}
	
	
	
	  public void enterSearchData(String searchData) throws InterruptedException {
	  waitHelper.WaitForElement(SearchHotel, 60);
	  log.info("Entering the Location details" + searchData);
	  SearchHotel.sendKeys(searchData); Thread.sleep(3000); List<WebElement>
	  autoSuggestions = driver.findElement(By.className("select2-results")).findElements(By.tagName("li"));
	  for (WebElement suggestions : autoSuggestions) { if
	  (suggestions.getText().contains("Melbourne, Australia")) {
	  suggestions.click(); Thread.sleep(3000); } } }
	 
//	
	
	  public void enterCheckinDate(String CheckinDate) {
		log.info("Click on Checkin Date" + CheckinDate);
		this.CheckIn.sendKeys(CheckinDate);
	}
	
	public void clickNext() {
		this.btnNext.click();
	}
	
	public void selectCheckinDate() throws InterruptedException {
		log.info("Select the Checkin Date");
		this.SelectFromDate.click();
		Thread.sleep(3000);
	} 
	
	public void enterCheckoutDate(String CheckoutDate) {
		log.info("Click on Checkout Date" + CheckoutDate);
		this.CheckOut.sendKeys(CheckoutDate);
	}
	
	/* public void setToDate() {
		
		log.info("Select the Checkout Date");
		this.SelectToDate.click();
	} */
	
	public void clickTotalCust()  {
		waitHelper.WaitForElement(Children, 20);
		log.info("Click on the No.of Persons");
		this.NofPersons.click();
		
	}
	
	/*
	 * public void setAdultCnt(String adultCnt) throws InterruptedException {
	 * log.info("Set the value of Adults" + adultCnt);
	 * this.Adults.sendKeys(adultCnt); Thread.sleep(3000); }
	 */ 
	
public void setChildCnt() throws InterruptedException {
	waitHelper.WaitForElement(Children, 40);
	log.info("Set the value of Children");
		this.Children.click();
		Thread.sleep(3000);
		this.Children.click();
		
	}

public void clickSearch() {
	log.info("Click on the Search Button");
	this.btnSearch.click();
	
}

public void starGradeDisplay()  {
	waitHelper.WaitForElement(starGrade, 60);
	log.info("Web Element is displayed" + starGrade);
	starGrade.isDisplayed();

}

public void clickonFirstResult() {
	
	log.info("Click on the first search result");
	firstSearchResult.click();
}
	
}