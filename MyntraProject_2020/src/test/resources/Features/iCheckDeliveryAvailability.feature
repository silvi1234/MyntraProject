Feature: Myntra Check deivery avaialabilty option
         This feature will test the check delivery option of Myntra homepage.

  Background: 
    Given Myntra Homepage is launched.

  @Sprint1 @Sanity
  Scenario: Verify customer can check the delivery availability properly
  
    When Customer click on the expand sign of the homepage
    And  Customer inputs the pincode in the textbox
    And  Customer clicks on CHECK button
    And  Customer gets a warning message
    Then Customer clicks on CONTINUE BROWSING
