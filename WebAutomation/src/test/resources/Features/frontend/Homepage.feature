 Feature: Home Page scenarios
  
   Scenario: notification scenario
    Given verify notification tab
    Then verify notification page redirected to correct page
  
   Scenario: user profile icon
    Given verify user profile icon
    Then verify profile icon page 
    
    Scenario: Checking the redirection of Sho card from the row
     Given Click on sho card from any row and verify its redirected to correct sho detail page
     
    Scenario: Checking the redirection of studio card from the row
     Given Click on studio card from studio row and verify its redirected to correct studio detail page
     When add