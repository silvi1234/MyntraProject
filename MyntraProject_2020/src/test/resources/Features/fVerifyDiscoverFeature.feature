@Fourth
Feature: Verify discover feature of Myntra page

  Background: 
    Given Myntra Homepage is launched.

  @Sprint1 @Sanity
  Scenario: Verify discover feature of Myntra Page
    When mouse over on home&living menu
    And Click on curtains
    And Click on whishlist from image section
    And Click on discover menu link
    Then It will display disorder page
