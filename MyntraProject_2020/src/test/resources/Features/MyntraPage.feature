

Feature: Myntra Homepage Search Button Verification
         This feature will test the search button of Myntra homepage.
         
 Background: 
   Given Myntra Homepage is launched.

  @Sprint1 @Sanity
  
  Scenario: Verify search button of Myntra homepage is working successfully.
   
    When Customer click on search button
    Then Customer types Tshirts on search text button
    And  Customer click on enter button
    And  Customer should be able to see searched items successfully.

 