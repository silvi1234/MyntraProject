
Feature: This feature will test Myntra Women clothing section

  Background: 
    Given: User is Already logged in to Myntra Homepage


  @Sprint1 @Sanity @Auto
  
  Scenario: Verify if customer can order womens cloth from Myntra
  
    Given Myntra Home page is launched
    When User mouseover to the Women tab
    And User selects Shrug from the dropdown items
    And User mouseover to brand section 
    And clicks on FOREVER 21 brand 
    And User clicks on an item from the displayed item
    Then user lands on a new page
    And User selects the size M 
    And clicks on ADD TO BAG
    Then User  mouseover to Bag and clicks on Bag
    And User lands to a new page
