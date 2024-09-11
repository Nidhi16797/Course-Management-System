Feature: Request a Place on a Course

  Scenario: Request a course place as a registered student
    Given the student is logged in
    And the student is on the course request page
    When the student selects a course to request a place
    And the student submits the course request form
    Then the user should see a confirmation message
    And the request details should be stored in the database with a valid student ID
