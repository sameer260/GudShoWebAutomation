Feature: Smoke Test cases

 
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
