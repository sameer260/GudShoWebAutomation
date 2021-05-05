@Signup
Feature: To check SignUp and Login Feature

Background: Navigate to URL and Click on SignIn button
Given Navigate to the url and click on Signin button

Scenario Outline: Mobile Signup
Given Click on Signuplink and enter <Mobile Number>
And verify otp

Examples:
|Mobile Number|
|8555270114   |