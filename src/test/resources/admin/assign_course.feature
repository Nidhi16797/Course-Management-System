Feature: Assign Course

  Scenario: Assign a course to a student and lecturer
    Given the course administrator is logged in
    And the administrator is on the course assignment page
    When the administrator selects a student, course, and lecturer from the form
      | Student ID  | 1234                    |
      | Course ID   | 5678                    |
      | Lecturer ID | 9101                    |
      | Course Dates| 01/01/2025 - 01/06/2025 |
    And the administrator submits the course assignment form
    Then the administrator should see a course assignment confirmation message
    And a confirmation email should be sent to the student's email address
    And the number of registered students should be updated in the database
