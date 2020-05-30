Feature: Backward Feature of Myntra Homepage
  
  This feature will test the backward option of Myntra Homepage

  Background: 
    Given Myntra Home page is launched


  @Sprint1 @Sanity
  Scenario: Customer checks the discount offer from the side banner and comes back to the homepage
    When Customer Clicks on Flat discount banner triangle icon
    And Customer clicks on sign up button
    And Customer lands to sign up page
    And Customer nevigates to homepage
    Then Customer susseccfully comes back to the homepage
