Feature: Login
Background: Title steps common for all scenarios 
Given User launch Chrome Browser
When User open Url "https://automationexercise.com/"
And User clik on signup
And user enter Email as "dattatraya@gmail.com" and password as "datta123"
And click on Login
Then page title should be "Automation Exercise"

@smoke
Scenario: succesful login with valid id
When user click on log out link
Then page title should be "Automation Exercise - Signup / Login"
And close browser

@regression
Scenario: search product
When click on product
And click on Men catlag
And click on shirt
Then validate tshirt section is open
When click on first tshirt view product
Then Check Availability
And close browser