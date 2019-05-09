package com.testAssessment.stepDefinitions;

import com.testAssessment.pageObjects.HomePage;
import com.testAssessment.testBase.testBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class searchStepDefinitions extends testBase  {
	
	HomePage homepage = new HomePage(driver);
	
	@Given("^I am on the Home Page URL \"([^\"]*)\"$")
	public void i_am_on_the_Home_Page_URL(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 driver.get(arg1);
	 
	 
	}

	@Then("^I should see Hotel Search page$")
	public void i_should_see_Hotel_Search_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		homepage.clickSearch();
		
	}
	
@When("^Enter Location as \"([^\"]*)\"$")
public void enter_Location_as(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   //homepage.enterSearchData(arg1);
}

@When("^Enter From Date \"([^\"]*)\"$")
public void enter_From_Date(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    homepage.enterCheckinDate(arg1);
}

@When("^Enter To Date \"([^\"]*)\"$")
public void enter_To_Date(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    homepage.enterCheckoutDate(arg1);
}

@When("^Set No\\.of Adults$")
public void set_No_of_Adults() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
}

@When("^Set No\\.of Children$")
public void set_No_of_Children() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   homepage.setChildCnt();
}



@When("^Click on Search$")
public void click_on_Search() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   
	homepage.clickSearch();
 
}

@Then("^I should see search results$")
public void i_should_see_search_results() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
 homepage.starGradeDisplay();
}

@Then("^Click on First Search Result$")
public void click_on_First_Search_Result() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   homepage.clickonFirstResult();
}

}