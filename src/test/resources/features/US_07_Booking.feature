@US07_Booking
Feature: Going to the booking page
  Scenario:Verify the going to booking page successfully


    Given User navigates to "url"
    Then User clicks on Destination home page
    When User enters a destination
    And User clicks on search button
    And User verifies url takes user to selected hotel web site
    And User verifies the booking page in another tab
    And User enter booking information
    Then User verifies booking confirmation page

