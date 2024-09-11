Feature: List Courses

  Scenario: List all courses and registered students (Admin)
    Given the course administrator is logged in the
    And the administrator is on the list courses page
    When the administrator requests to list all courses
    Then the list should display all courses with registered students
    And the view should show available places based on bookings and maximum allowed
    And the view should be sorted by Course ID and then Student ID

  Scenario: List courses taught by the lecturer
    Given the lecturer is logged in
    And the lecturer is on the list courses page
    When the lecturer requests to list courses they teach
    Then the list should display all students registered for those courses
    And the view should show available places based on bookings and maximum allowed
    And the view should be sorted by Course ID and then Student ID