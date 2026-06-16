@filterPrice
Feature: Vlaidating price by filter functionality

Scenario Outline: Validating price by filter
 Given User is on home screen
 When clicks login
 And user enters "priyankauser@gmail.com" as email and "Priyanka@1" as password
 Then user is successfully logged in
 Given user is on search screen and in stock is checked
 When Range <range> is selected
 Then price is validated

Examples:
|range|
|"Below ₹60"|
|"₹60 - ₹70"|
|"Above ₹70"|