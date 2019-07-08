Feature: Verify the functionality of Kaanhai PDF site

@Fourth
Scenario: Verify the user has landed correctly on the Kaanhai Prince Landing page
Given I see the KaanhaiPrince logo
When I verify Dictioniary PDF link from KaanhaiPrince
And I click on the link 
Then I confirm Kaanhaitext from PDF

