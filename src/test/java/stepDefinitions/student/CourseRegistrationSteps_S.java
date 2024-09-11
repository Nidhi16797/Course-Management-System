package stepDefinitions.student;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class CourseRegistrationSteps_S {
    @Given("the user is on the student registration page")
    public void theUserIsOnTheStudentRegistrationPage() {
    }

    @When("the user fills in the registration form with valid details")
    public void theUserFillsInTheRegistrationFormWithValidDetails( DataTable userDetailsTable) {
        // Convert the DataTable into a Map or List for easier access
        Map<String, String> userDetails = userDetailsTable.asMap(String.class, String.class);

        // Now you can access the details
        String name = userDetails.get("Name");
        String dob = userDetails.get("DOB");
        String email = userDetails.get("Email");
        String password = userDetails.get("Password");

        // Process the details (e.g., call your registration method)
        System.out.println("Name: " + name);
        System.out.println("DOB: " + dob);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
    }

    @And("the user submits the registration form")
    public void theUserSubmitsTheRegistrationForm() {
    }

    @Then("the user should see a registration confirmation message")
    public void theUserShouldSeeARegistrationConfirmationMessage() {
        System.out.println("Your registartion is successful..");
    }

    @And("the user details should be stored in the database with a valid student ID")
    public void theUserDetailsShouldBeStoredInTheDatabaseWithAValidStudentID() {
        System.out.println("");
    }

    @When("the user fills in the registration form with an invalid password")
    public void theUserFillsInTheRegistrationFormWithAnInvalidPassword(DataTable userDetailsTable) {
        // Convert the DataTable into a Map or List for easier access
        Map<String, String> userDetails = userDetailsTable.asMap(String.class, String.class);

        // Now you can access the details
        String name = userDetails.get("Name");
        String dob = userDetails.get("DOB");
        String email = userDetails.get("Email");
        String password = userDetails.get("Password");

        // Process the details (e.g., call your registration method)
        System.out.println("Name: " + name);
        System.out.println("DOB: " + dob);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
    }

    @Then("the user should see an error message about the password policy")
    public void theUserShouldSeeAnErrorMessageAboutThePasswordPolicy() {
        System.out.println("Your password is invalid..");
        System.out.println("");
    }

    @When("the user fills in the registration form with an invalid email")
    public void theUserFillsInTheRegistrationFormWithAnInvalidEmail(DataTable userDetailsTable) {
        // Convert the DataTable into a Map or List for easier access
        Map<String, String> userDetails = userDetailsTable.asMap(String.class, String.class);

        // Now you can access the details
        String name = userDetails.get("Name");
        String dob = userDetails.get("DOB");
        String email = userDetails.get("Email");
        String password = userDetails.get("Password");

        // Process the details (e.g., call your registration method)
        System.out.println("Name: " + name);
        System.out.println("DOB: " + dob);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
    }

    @Then("the user should see an error message about the email address")
    public void theUserShouldSeeAnErrorMessageAboutTheEmailAddress() {
        System.out.println("Your email-id is invalid..");
        System.out.println("");
    }

    @When("the user fills in the registration form with an invalid DOB")
    public void theUserFillsInTheRegistrationFormWithAnInvalidDOB(DataTable userDetailsTable) {
        // Convert the DataTable into a Map or List for easier access
        Map<String, String> userDetails = userDetailsTable.asMap(String.class, String.class);

        // Now you can access the details
        String name = userDetails.get("Name");
        String dob = userDetails.get("DOB");
        String email = userDetails.get("Email");
        String password = userDetails.get("Password");

        // Process the details (e.g., call your registration method)
        System.out.println("Name: " + name);
        System.out.println("DOB: " + dob);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
    }

    @Then("the user should see an error message about the DOB format")
    public void theUserShouldSeeAnErrorMessageAboutTheDOBFormat() {
        System.out.println("Your DOB format is invalid..");
    }




   /* @And("the user confirms that the details are correct")
    public void theUserConfirmsThatTheDetailsAreCorrect() {
    }

    @Then("the user should be redirected to the confirmation page")
    public void theUserShouldBeRedirectedToTheConfirmationPage() {
        System.out.println("The Student should be redirected to the confirmation page");
    }

    @When("the user fills in the registration form with invalid details")
    public void theUserFillsInTheRegistrationFormWithInvalidDetails(DataTable userDetailsTable) {

    }

    @Then("the user should see appropriate error messages for each incorrect field")
    public void theUserShouldSeeAppropriateErrorMessagesForEachIncorrectField() {
        System.out.println("The student should see appropriate error messages for each incorrect field");
    }

    @Then("the student details should be stored in the database with a valid student ID")
    public void theStudentDetailsShouldBeStoredInTheDatabaseWithAValidStudentID() {
    }*/
}
