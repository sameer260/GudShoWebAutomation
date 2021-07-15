Feature: Smoke Test cases

  Scenario Outline: Search any sho and buy this sho and Play
    Given Search any <ShoName> and verfiy its redirected to correct page
    When Buy the sho using <PaymentGateway> with <PaymentScenario>

    Examples: 
      | ShoName | PaymentGateway | PaymentScenario |
      | Talent  | Razorpay       | Success         |

  Scenario Outline: Search any sho and add in to watch list
    Given Search any <ShoName> and verfiy its redirected to correct page
    When Add <ShoName> in to watchlist and check the toaster message
    Then On home page check the added watchlist <ShoName>

    Examples: 
      | ShoName |
      | Talent  |

  Scenario Outline: Search any Sho and Share the Sho
    Given Search any <ShoName> and verfiy its redirected to correct page
    When Click on Share button
    Then Share the sho using all social icons

    Examples: 
      | ShoName |
      | Talent  |

  Scenario Outline: Search any Studio and follow  the Studio
    Given Search any <StudioName> and verify its redirected studio page
    When Click on Follow button
    Then check  toaster message and verify following text

    Examples: 
      | StudioName   |
      | Trail Studio |

  Scenario Outline: Search any Studio and click playtrailer from banner section in Studio
    Given Search any <StudioName> and verify its redirected studio page
    When play trailer from banner section
    Then close the player

    Examples: 
      | StudioName   |
      | Trail Studio |

  
  Scenario Outline: Search any Studio and play promo  and close promo player and check its redirection
    Given Search any <StudioName> and verify its redirected studio page
    When verfiy promo player
    Then close player

    Examples: 
      | StudioName   |
      | Trail Studio|

  
  Scenario Outline: Search any Studio and click sho card
    Given Search any <StudioName> and verify its redirected studio page
    When click sho card and verify its redirected sho detail page

    Examples: 
      | StudioName   |
      | Trail Studio|

 
  Scenario Outline: Search any Studio and select any genre and verify sho card
    Given Search any <StudioName> and verify its redirected studio page
    When click genre and verify sho card redirection

    Examples: 
      | StudioName   |
      | Trail Studio|
      
    @ramya 
    Scenario: notification scenario
    Given verify notification tab
    Then verify notification page redirected to correct page
  
    
   @ramya
   Scenario: user profile icon
    Given verify user profile icon
    Then verify profile icon page 
    
    
   
      
      
      
      ##Then Verify after payment <ShoName> is playing and close the player 
