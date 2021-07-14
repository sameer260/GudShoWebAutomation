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

  Scenario Outline: Add to watchlist mini popup validation
    Given Search any sho <shoname>
    And From sho detail page click on add to watchlist
    When Validate the minipopup add to watchlist

    Examples: 
      | shoname |
      | avatar  |

  Scenario Outline: Create Gud mini popup validation
    Given Search any sho <shoname>
    And From sho detail page click on any promo
    When while playing click on greate gud button
    Then Validate the minipopup Create gud

    Examples: 
      | shoname |
      | avatar  |

  Scenario Outline: Buy button redirection validation
    Given Search any sho <shoname>
    And From sho detail page click on Buy button
    Then Validate Home page redirection

    Examples: 
      | shoname  |
      | hostages |

  Scenario Outline: Follow Button mini popup validation
    Given Search any sho <shoname>
    And From studio detail page click on follow button
    When Validate the minipopup follow button

    Examples: 
      | shoname         |
      | santii's studio |
