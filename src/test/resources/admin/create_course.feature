Feature: Create a Course

  Scenario: Create a new course
    Given the course administrator is logged in for
    And the administrator is on the create course page
    When the administrator fills in the course creation form with valid details
      | Course Name         | Advanced Java Programming   |
      | Max Class Size      | 30                          |
      | Available Lecturers | Prof. Kundan Sharma         |
      | Start Date          | 01/01/2025                  |
      | End Date            | 01/06/2025                  |
    And the administrator submits the course creation form
    Then the administrator should see a course creation confirmation message
    And the course details should be stored in the database with a valid Course ID
