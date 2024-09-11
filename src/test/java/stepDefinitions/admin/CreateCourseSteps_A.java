package stepDefinitions.admin;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class CreateCourseSteps_A {
    @Given("the course administrator is logged in for")
    public void theCourseAdministratorIsLoggedInFor() {
    }

    @And("the administrator is on the create course page")
    public void theAdministratorIsOnTheCreateCoursePage() {
    }

    @When("the administrator fills in the course creation form with valid details")
    public void theAdministratorFillsInTheCourseCreationFormWithValidDetails(DataTable userDetailsTable ) {
        Map<String, String> userDetails = userDetailsTable.asMap(String.class, String.class);

        String course_name = userDetails.get("Course Name");
        String max_class_size = userDetails.get("Max Class Size");
        String available_lecturers = userDetails.get("Available Lecturers");
        String start_date = userDetails.get("Start Date");
        String end_date = userDetails.get("End Date");

        System.out.println("Course Name: " + course_name);
        System.out.println("Max Class Size: " + max_class_size);
        System.out.println("Available Lecturers: " + available_lecturers);
        System.out.println("Start Date: " + start_date);
        System.out.println("End Date: " + end_date);
    }

    @And("the administrator submits the course creation form")
    public void theAdministratorSubmitsTheCourseCreationForm() {
    }

    @Then("the administrator should see a course creation confirmation message")
    public void theAdministratorShouldSeeACourseCreationConfirmationMessage() {
        System.out.println("Your course is successfully created..");
    }

    @And("the course details should be stored in the database with a valid Course ID")
    public void theCourseDetailsShouldBeStoredInTheDatabaseWithAValidCourseID() {
    }
}
