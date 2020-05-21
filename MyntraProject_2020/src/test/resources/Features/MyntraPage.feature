

Feature: Myntra Homepage Search Text Box Verification
         This feature will test the search text box of Myntra homepage.
         
 Background: 
   Given Myntra Homepage is launched.

  @Sprint1 @Sanity
  
  Scenario: Verify search text box of Myntra homepage is working successfully.
   
    

    When  Customer types Shirts on search text button
    And   Customer press enter button
    Then  Customer should be able to see searched items successfully.

 