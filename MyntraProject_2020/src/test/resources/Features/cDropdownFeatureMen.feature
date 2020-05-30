
Feature: T-Shirt order feature
  This feature will verify all the steps to order Tshirt

  Background: 
    Given Myntra homepage launched

  @Sprint1 @Sanity
  Scenario: Verify that T-shirt order will place successfully
    When Customer mouse over the men link
    And Customer click the T-shirt
    And Customer Click the roadster brand
    And Customer Click the brushprint tshirt
    And Customer click the large size
    And Customer click the add to bag
    And Customer click the Go to bag
    And Customer Click the Place order
    And Customer will be ask for the mobile number
