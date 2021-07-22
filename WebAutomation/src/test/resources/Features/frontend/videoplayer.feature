Feature: Video Player Scenarios

Scenario Outline: Check all the player like Play,Pause,Forwad and Backward Actions for promo Player
Given Search any <ShoName> and verfiy its redirected to correct page
When Play promo
Then Pause Video at <runningtime> and play agian
And Forward video after <forwardduration> and Backward video after <backwordduration>


Examples:
|ShoName|runningtime|forwardduration|backwordduration|
|Talent |00:10      |   00:15       | 00:27          | 
