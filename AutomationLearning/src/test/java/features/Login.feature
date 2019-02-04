Feature: Appliation Login

Scenario: Main Sign In Page
Given User is on sign in page
When User enters valid email and password
Then User is taken to fundraising pages
And Sign in button is now My Account

