Feature: Verify the functionality of AskGanesha GunMilan Page

@Seventh
Scenario: Entry of data for Boy
Given I see the Boy Details Sub Header
#When I enter the Boy Details using Excel
And  I enter the Boy Details using Json
Then the details are displayed successfully

Scenario: Entry of data for Girl
Given I see the Girl Details Sub Header
#When I enter the Girl Details using Excel
And  I enter the Girl Details using Json
Then the details are displayed successfully