Feature: Myntras Subscribe feature verification
  This feature will test Myntras Subscription feature
  Background: 
    Given Myntra Homepage is launched.

  @Sprint1 @Sanity
  Scenario: Verify if customer can Subscribe on Myntra page
    When Customer clicks on Blog
    And  Customer inputs Email address 
    And  Customer clicks on Subscribe button
    Then Customer can see confirmation message
    
