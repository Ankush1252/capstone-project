package runner;

//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/login.feature",
		glue = "stepdefinitions",
		plugin = {"pretty","html:reports/HTMLReports.html",
							"json:reports/json-report.json",
							"junit:reports/junit_report.xml",
//							"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
		}
		,monochrome = true
)


public class TestRunner extends AbstractTestNGCucumberTests{

}