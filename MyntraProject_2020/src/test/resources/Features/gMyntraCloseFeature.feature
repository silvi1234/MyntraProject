Feature: Myntra close category Verification
         This feature will test the close button of Myntra homepage.

  Background: 
    Given Myntra Homepage is launched.

  @Sprint1 @Sanity
  Scenario: Verify catagory close button of kids item working successfully.
    When Customer mouse over on kids menu
    And Click on GAP kids from brand section
    And Click on more link from category section
    And Check sweat shirt
    And Click on close icon
    Then Customer can show all swimshirts
