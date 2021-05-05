Feature: To check SignUp and Login Feature

Background: Navigate to URL and Click on SignIn Button
Given Navigate to the url and click on Signin button

Scenario Outline: Click on SignUp link and Signup as new Account
Given Click on Signuplink and enter <Mobile Number>

Examples:
|Mobile Number|
|1234567890   |