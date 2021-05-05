Feature: Paywall Functionality

Scenario Outline: Search Any sho and add to watchlist
Given Search <shoseries> click on watchlist button
Then Signin popup should open and verify the text
And click on signin button and it should redirect to the login page

Examples:
|shoseries|
|Talent|


Scenario Outline: Search Any sho and add to watchlist from header
Given Search <shoseries> click on watchlist button from header
Then Signin popup should open and verify the text
And click on signin button and it should redirect to the login page

Examples:
|shoseries|
|Talent|

