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


  ##Then Verify after payment <ShoName> is playing and close the player
  ## Paywall santhosh
  @Signup @test1
  Scenario Outline: Add to watchlist mini popup validation
    And Search any sho <shoname>
    When From sho detail page click on add to watchlist
    Then Validate the minipopup

    Examples: 
      | shoname |
      | avatar  |
