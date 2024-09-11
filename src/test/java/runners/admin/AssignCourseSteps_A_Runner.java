package runners.admin;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/admin/assign_course.feature"}, glue = {"stepDefinations"}, dryRun = true)
public class AssignCourseSteps_A_Runner {
}