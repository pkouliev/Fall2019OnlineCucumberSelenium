@activities
Feature: Create calendar event

  As user, I want to be able to create calendar events.

  Scenario: Create calendar event as sales manager
    Given user is on the login page
    When user logs in as a sales manager
    And user navigates to "Activities" and "Calendar Events"
    Then user clicks on create calendar event button
    And user enters "Sprint Retrospective" as a title
    Then user clicks on save and close button
    And user verifies description "On this meeting we discuss what went well, what went wrong and what went well"
    And user verifies that title of new calendar event is "Sprint Retrospective"