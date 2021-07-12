@Signup
Feature: Paywall Functionality



<<<<<<< HEAD
                                
=======
 Scenario: Open the WebSite and Check SignIn button is available
 Given SignIn button is avialable
 And Coins section is avilable
 And Page Title is showing "GudSho - Watch Unlimited Movies & Web Series Online"
 And Banners is showing on home page
 And Footer Section is visible
 And Header Logo is visible
 
 
 Scenario Outline: Click on HomePage Slider and verify its redirected to correct sho page
 Given Click on <bannernum> and verify its redicted to sho detail page
 
 
 Examples:
 |bannernum|
 |0        |
 
                               
>>>>>>> refs/remotes/origin/develop
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


Scenario Outline: Search any sho and click on Request Release
Given Search <shoseries> and click on Request Release button
Then Page should redirect to the login page and will ask to login again
And Do same from headder and it should have same beahviour as above

Examples:
|shoseries|
|Gudsho Series |


Scenario Outline: Search any sho and select season and episode click on episode card
Given Search <shoseries> and click on first episode
Then Page should redirect to the login page
And Click back and now select <season name> from season dropdown
Then Click on any episode it should redirect to login page

Examples:
|shoseries|season name|
|Talent   |Season 3   |
|Gudsho Series|Season 2|
|Minister  |Season 2|


Scenario Outline: Search any sho and Click on Episode from Full episode page
Given Search <shoseries> and Click on episode link
Then Page should redirect to the login page
And select any <season name> from the season dropdown and on episode
Then Page should redirect to the login page

Examples:
|shoseries|season name|
|Talent   |Season 3   |
|Gudsho Series|Season 2|
|Minister  |Season 2|

Scenario Outline: Play a promo from Sho detail page and like
Given Search <shoseries> and click on any promo
Then verify the promo is playing and give gud on promo
And verify signin popup opened and verify the text
Then click on signin button and it should redirect to the login page
And try same above scenario from player full screen


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

Scenario Outline: Search any shoseries and click on feelers text
Given Search any <shoseries> and click on feelers text 
When verify the signin popup and text in signIn up
Then click on signin button and it should redirect to the login page


Examples:
|shoseries |
|Talent    | 



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

Scenario Outline: Search any studio and from studio banner click on any banner
Given Search any <studio> from click on banner having <shoname>
Then it should redirect to the sho detail page and verify <shoname>

Examples:
|studio|shoname|
|Sameer|Test  |

Scenario Outline: Play Trailer from studio banner
Given search any <studio> and play trailer from banner for <shoname>
Then trailer will play and close the player

Examples:
|studio|shoname|
|Sameer|Test   |


Scenario Outline: Play Trailer from studio banner if there is no trailer
Given search any <studio> and play trailer from banner for <shoname>
Then it will redirect to the <shoname>detail page and will show toaster message

Examples:
|studio|shoname               |
|Sameer|New Notification Check|




