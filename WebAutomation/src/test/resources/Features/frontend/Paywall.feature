Feature: Paywall Functionality

                                #######  Sho Detail Page ###########

Scenario Outline: Search Any sho and add to watchlist
Given Search <shoseries> click on watchlist button
Then Signin popup should open and verify the text
And click on signin button and it should redirect to the login page
And  Again click back and add watchlist from header
Then Signin popup should open and verify the text
And click on signin button and it should redirect to the login page 

Examples:
|shoseries|
|Talent|

Scenario Outline: Search any Sho and Click watch free button
Given Search <shoseries> click on watch free button
Then Page should redirect to the login page
And Again click back and click on watch free button from header

Examples:
|shoseries|
|Check Transacode|

Scenario Outline: Search any sho and click on Buy button
Given Search <shoseries> and click on buy button
Then Page should redirect to the login page
And Again Click buy button from headder and check same

Examples:
|shoseries|
|Talent   |


Scenario Outline: Search any sho and select season and episode click on episode card
Given Search <shoseries> and click on first episode
Then Page should redirect to the login page
And Click back and now select <season name> from season dropdown
Then Click on any episode it should redirect to login page


Examples:
|shoseries|season name|
|Talent   |Season 3   |


Scenario Outline: Search any sho and Click on Episode from Full episode page
Given Search <shoseries> and Click on episode link
Then Page should redirect to the login page
And select any <season name> from the season dropdown and on episode
Then Page should redirect to the login page

Examples:
|shoseries|season name|
|Talent   |Season 3   |

Scenario Outline: Play a promo from Sho detail page and like
Given Search <shoseries> and click on any promo
Then verify the promo is playing and give gud on promo
And verify signin popup opened and verify the text
Then click on signin button and it should redirect to the login page
And try same above scenario from player full screen

@Execute
Examples:
|shoseries|
|Talent   |

Scenario Outline: Search any Sho and Play audio do fav
Given Search <shoseries> and play any song
When Add to fav the song and verify the signin popup
Then click on signin button and it should redirect to the login page

Examples:
|shoseries|
|Talent   |

                                   ##########  Studio Detail Page ###########
                                   
Scenario Outline: Search any studio and click on follow
Given Search any <studio> and follow the studio
When Signin popup should display and verify the text
Then click on signin button and it should redirect to the login page
And Come back do same follow from header
Then click on signin button and it should redirect to the login page 


Examples:
|studio |
|Sameer |                                   

Scenario Outline: Search any studio and click on watch list from sho card
Given Search any <studio> and add to watchlist from any sho card
When Signin popup should open and verify the text
Then click on signin button and it should redirect to the login page

Examples:
|studio |
|Sameer | 


Scenario Outline: Search any studio and Click on Fav icon from any audio card
Given Search any <studio> and add to audio fav
When Add to fav the song and verify the signin popup
Then click on signin button and it should redirect to the login page


Examples:
|studio |
|Sameer | 



