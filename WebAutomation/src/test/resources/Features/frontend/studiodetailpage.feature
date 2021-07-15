Feature: Studio Detail page Scenarios

 Scenario Outline: Search any Studio and share studio
      Given Search any studio <studioname> and verify it should redirected to correct page
      Then Share studio with all share icons
      
      Examples:
      |studioname|
      |Sameer    | 
   @test   
 Scenario Outline: Search any Studio and Play trailer from Banner
      Given Search any studio <studioname> and verify it should redirected to correct page
      When Play <shotrailer> from banner and close the player
      Then check redirection of <shotrailer>
      
      Examples:
      |studioname|shotrailer|
      |Sameer    |   Locked |
      
      
