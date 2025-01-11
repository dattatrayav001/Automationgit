Feature: Login
@regression
Scenario: succesful login with valid id
Given User launch Chrome Browser
When User open Url "https://automationexercise.com/"
And User clik on signup
And user enter Email as "dattatraya@gmail.com" and password as "datta123"
And click on Login
Then page title should be "Automation Exercise"
When user click on log out link
Then page title should be "Automation Exercise - Signup / Login"
And close browser

@smoke
Scenario Outline: succesful login with valid id dtt
Given User launch Chrome Browser
When User open Url "https://automationexercise.com/"
And User clik on signup
And user enter Email as "<email>" and password as "<password>"
And click on Login
Then page title should be "Automation Exercise"
When user click on log out link
Then page title should be "Automation Exercise - Signup / Login"
And close browser

Examples:
|email|password|
|dattatraya@gmail.com|datta123|
|dattatraya@gmail.com|datta123|