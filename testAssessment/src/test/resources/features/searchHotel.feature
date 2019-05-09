@SearchHotel
Feature: Search for a Hotel
  I want to Navigate to Application
  Search for a Hotel in Melbourne between dates'
  for a me and my wife and 2 children
  
  Background: User navigates Application URL
  Given I am on the Home Page URL "https://www.phptravels.net"
  Then I should see Hotel Search page
  

  @HotelSearch
  Scenario: Search for a Hotel in Melbourne
    When Enter Location as "Melbourne"
    And Enter From Date "01/06/2019"
    And Enter To Date "07/06/2019"
    And Set No.of Adults
    And Set No.of Children
    And Click on Search
    Then I should see search results
    And Click on First Search Result

