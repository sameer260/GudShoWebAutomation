Feature: Studio Detail page Scenarios

 Scenario Outline: Search any Studio and share studio
      Given Search any studio <StudioName> and verify it should redirected to correct page
      Then Share studio with all share icons
      
      Examples:
      |StudioName|
      |Sameer    | 
     
 Scenario Outline: Search any Studio and Play trailer from Banner
      Given Search any studio <StudioName> and verify it should redirected to correct page
      When Play <shotrailer> from banner and close the player
      Then check redirection of <shotrailer>
      
      Examples:
      |StudioName|shotrailer|
      |Sameer    |   Locked |
     
     
  Scenario Outline: Search any Studio and follow  the Studio
    Given Search any studio <StudioName> and verify it should redirected to correct page
    When Click on Follow button
    Then check  toaster message and verify following text

    Examples: 
      | StudioName   |
      | Trail Studio |   
      
      
   Scenario Outline: Search any Studio and play promo  and close promo player and check its redirection
    Given Search any studio <StudioName> and verify it should redirected to correct page
    When verfiy promo player
    Then close player

    Examples: 
      | StudioName   |
      | Trail Studio |

  
  Scenario Outline: Search any Studio and click sho card
    Given Search any studio <StudioName> and verify it should redirected to correct page
    When click sho card and verify its redirected sho detail page

    Examples: 
      | StudioName  |
      | Trail Studio|

 @ramya
  Scenario Outline: Search any Studio and select any genre and verify sho card
    Given Search any studio <StudioName> and verify it should redirected to correct page
    When click <genere> and verify sho card redirection

    Examples: 
      | StudioName   |genere|
      | Trail Studio |Drama |    
      
      
