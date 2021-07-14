Feature: Smoke Test cases
   
   @test
  Scenario Outline: Search any sho and buy this sho and Play
    Given Search any <ShoName> and verfiy its redirected to correct page
    When Buy the sho using <PaymentMode> with <PaymentScenario>
    Then Verify after payment <ShoName> is playing and close the player 

    Examples: 
      | ShoName  | PaymentMode    | PaymentScenario |
      | Carmen Sandiago   | Card           | Success         |
    
  
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
     Then Share the <shoorpromo> using all social icons
     
     Examples:
     |ShoName|shoorpromo|
     |Talent | shoshare |   
     
     
   Scenario Outline: Search any Sho and Play Promo and Like
     Given Search any <ShoName> and verfiy its redirected to correct page
     When Play <PromoName> and like promo
     Then On home page check liked <PromoName> is showing in my gud promos
     
     Examples:
     |ShoName|PromoName                     | 
     |Talent |Vakeel Sab Theatrical Trailer |
     
     
     Scenario Outline: Search any Sho and Share promo
     Given Search any <ShoName> and verfiy its redirected to correct page
     Then Hover on <PromoName> card and share promo <ShareType> using all shares 
     
     
     Examples:
     |ShoName|PromoName                     |ShareType |
     |Talent |Vakeel Sab Theatrical Trailer |promoshare|
     
     
   Scenario Outline: Search any Sho and redirection of studio page
     Given Search any <ShoName> and verfiy its redirected to correct page
     Then Click on Studio link and check redirected to studio detail page
     
     
     Examples:
     |ShoName|
     |Talent |
     
     
   Scenario Outline: Search any sho and buy this sho and Play
    Given Search any <ShoName> and verfiy its redirected to correct page
    When Play watch free content and close the player
    Then On Home Page check continue wathing is showing <ShoName>
    
    Examples: 
      | ShoName |
      | Paytm   | 
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
      ##Then Verify after payment <ShoName> is playing and close the player 
