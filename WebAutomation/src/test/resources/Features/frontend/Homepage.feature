 Feature: GudSho Home Page
  
      
    Scenario: Notification Page Redirection
    Given verify notification tab
    Then verify notification page redirected to correct page  
  
   Scenario: User Profile
    Given verify user profile icon
    Then verify profile icon page
    
    @home
    Scenario: Sho Card Redirection
     Given Click on sho card from any row and verify its redirected to correct sho detail page
     
    Scenario: Studio Card Redirection
     Given Click on studio card from studio row and verify its redirected to correct studio detail page
         
     Scenario: Home Banner Redirection
    Given Select first card from home banner
    Then verify redirection of first card home banner
    
    
   

