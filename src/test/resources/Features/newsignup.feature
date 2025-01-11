Feature: sign up new customer
@sanity
Scenario: signup new account creation
 Given User launch Chrome Browser
When User open Url "https://automationexercise.com/"
And User clik on signup
Then page title should be "Automation Exercise - Signup / Login"
When user enter "Name123433" and "Email123433@gmail.com"
And click on signup
Then page title should be "Automation Exercise - Signup"
When User entered account info
And click on create account	
Then 	page title should be "Automation Exercise - Account Created"
And close browser