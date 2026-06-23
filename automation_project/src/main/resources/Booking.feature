@booking
Feature: Agoda Flight Booking Functionality

Background:
    Given User launches the Agoda website
    And User navigates to the Flights section

Scenario: Search for a one-way flight

    Given User is on the Flights booking page
    When User enters source city as "Delhi"
    And User enters destination city as "Mumbai"
    And User selects departure date as "24-Jun-2026"
    And User chooses "One Way" trip type
    And User clicks on the Search Flights button
    Then Flight search results should be displayed