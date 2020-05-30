Feature: Searching feature
  This feature is for verifying searching box for diffrent products
Background: 
Given Myntra homapage launched
 


 

  @Sprint1 @Sanity
  Scenario Outline: Verify the searching box for diffrent products
    When Customer click in searching box
    And Customer enter "<ProductName>" in searching box
    Then Customer click the search icon and land in the product page
    

    Examples: 
      | ProductName        | 
      | Tshirts            |     
      | Bags for women     |    
      | Jackets men        |
      | Pants              |
