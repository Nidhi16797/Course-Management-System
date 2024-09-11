package stepDefinitions.admin;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class AssignCourseSteps_A {
    @Given("the course administrator is logged in")
    public void theCourseAdministratorIsLoggedIn(){
    }

    @And("the administrator is on the course assignment page")
    public void theAdministratorIsOnTheCourseAssignmentPage() {
    }

    @When("the administrator selects a student, course, and lecturer from the form")
    public void theAdministratorSelectsAStudentCourseAndLecturerFromTheForm(DataTable userDetailsTable ) {
        Map<String, String> userDetails = userDetailsTable.asMap(String.class, String.class);

        String student_id = userDetails.get("Student ID");
        String course_id = userDetails.get("Course ID");
        String lecturer_id = userDetails.get("Lecturer ID");
        String course_dates = userDetails.get("Course Dates");

        System.out.println("Student ID: " + student_id);
        System.out.println("Course ID: " + course_id);
        System.out.println("Lecturer ID: " + lecturer_id);
        System.out.println("Course Dates: " + course_dates);
    }

    @And("the administrator submits the course assignment form")
    public void theAdministratorSubmitsTheCourseAssignmentForm() {
    }

    @Then("the administrator should see a course assignment confirmation message")
    public void theAdministratorShouldSeeACourseAssignmentConfirmationMessage() {
        System.out.println("Course is assigned successfully...");
    }

    @And("a confirmation email should be sent to the student's email address")
    public void aConfirmationEmailShouldBeSentToTheStudentSEmailAddress() {
        System.out.println("Student got a confirmation mail...");
    }

    @And("the number of registered students should be updated in the database")
    public void theNumberOfRegisteredStudentsShouldBeUpdatedInTheDatabase() {
    }
}
