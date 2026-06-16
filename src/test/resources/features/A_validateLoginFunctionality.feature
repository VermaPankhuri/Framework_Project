@login
Feature: Login functionality of registered user

Scenario: Positive test case
Given User is on home screen
When clicks login
And user enters "priyankauser@gmail.com" as email and "Priyanka@1" as password
Then user is successfully logged in
