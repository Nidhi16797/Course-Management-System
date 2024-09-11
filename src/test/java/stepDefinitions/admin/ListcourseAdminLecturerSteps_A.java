package stepDefinitions.admin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ListcourseAdminLecturerSteps_A {
    @Given("the course administrator is logged in the")
    public void theCourseAdministratorIsLoggedInThe() {
    }

    @And("the administrator is on the list courses page")
    public void theAdministratorIsOnTheListCoursesPage() {
    }

    @When("the administrator requests to list all courses")
    public void theAdministratorRequestsToListAllCourses() {
    }

    @Then("the list should display all courses with registered students")
    public void theListShouldDisplayAllCoursesWithRegisteredStudents() {
        System.out.println("The list should display all courses with registered students..");
    }

    @And("the view should show available places based on bookings and maximum allowed")
    public void theViewShouldShowAvailablePlacesBasedOnBookingsAndMaximumAllowed() {
    }

    @And("the view should be sorted by Course ID and then Student ID")
    public void theViewShouldBeSortedByCourseIDAndThenStudentID() {
    }

    @Given("the lecturer is logged in")
    public void theLecturerIsLoggedIn() {
    }

    @And("the lecturer is on the list courses page")
    public void theLecturerIsOnTheListCoursesPage() {
    }

    @When("the lecturer requests to list courses they teach")
    public void theLecturerRequestsToListCoursesTheyTeach() {
    }

    @Then("the list should display all students registered for those courses")
    public void theListShouldDisplayAllStudentsRegisteredForThoseCourses() {
        System.out.println("The list should display all students registered for those courses...");
    }
}
