Feature: List Courses For Student
  Scenario: List courses for the logged-in student
    Given the student is logged in for
    And the student is on the list courses page
    When the student requests to list courses they are registered for
    Then the list should display all courses where the student has requested a place
    And the view should show the number of attendees based on bookings without details of other students
    And the view should be sorted by Course ID and then the student's Student ID