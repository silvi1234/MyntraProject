Feature: Myntras email verification policy messag
  This feature will test Myntras email verification policy message.

  Background: 
    Given Myntra Homepage is launched.

  @Sprint1 @Sanity
  Scenario: Verify if customer can view myntras email verification policy message.
    When click on contact us
    Then click on frequently asked questions
    Then customer scrolled down and click to view Email verification policy
    Then customer should be able to view the policy message.
