Feature: Studio Detail page Scenarios

 Scenario Outline: Search any Studio and share studio
      Given Search any studio <studioname> and verify it should redirected to correct page
      Then Share studio with all share icons
      
      Examples:
      |studioname|
      |Sameer    | 
