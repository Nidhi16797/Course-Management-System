Feature: Request a Place on a Course

  Scenario: New student registration
    Given the user is on the student registration page
    When the user fills in the registration form with valid details
      | Name     | Nidhi Patel             |
      | DOB      | 01/01/2000              |
      | Email    | nidhi.patel@example.com |
      | Password | P@ssw0rd123             |
    And the user submits the registration form
    Then the user should see a registration confirmation message
    And the user details should be stored in the database with a valid student ID

  Scenario: Password policy enforcement
    Given the user is on the student registration page
    When the user fills in the registration form with an invalid password
      | Name     | Jinu Patel              |
      | DOB      | 01/01/2001              |
      | Email    | jinu.patel@example.com  |
      | Password | short                   |
    And the user submits the registration form
    Then the user should see an error message about the password policy

  Scenario: Email address validation
    Given the user is on the student registration page
    When the user fills in the registration form with an invalid email
      | Name     | Rima Vyas          |
      | DOB      | 03/03/1998         |
      | Email    | rima.vyas@invalid  |
      | Password | ValidPass123!      |
    And the user submits the registration form
    Then the user should see an error message about the email address

  Scenario: DOB validation
    Given the user is on the student registration page
    When the user fills in the registration form with an invalid DOB
      | Name     | Tina Patel             |
      | DOB      | 1975/07/25             |
      | Email    | tina.patel@example.com |
      | Password | ValidPass123!          |
    And the user submits the registration form
    Then the user should see an error message about the DOB format






