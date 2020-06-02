
Feature: Gift Card feature of Myntra Homepage
         This feature will test the Gift Card feature of Myntra homepage.
         
  Background: 
    Given Myntra Homepage is launched.

  @Sprint1 @Regression
  Scenario: Verify that customer can check the balance of the gift card
    When Customer mouse hover to profile icon
    And Customer clicks on Gift cards
    And Customer scroll down and enters Card no and Pin number
    And Customer clicks on check balance
    Then Customer should be able to see a new window
