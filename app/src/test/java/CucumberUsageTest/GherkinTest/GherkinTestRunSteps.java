package CucumberUsageTest.GherkinTest;

import io.cucumber.java.en.*;
import org.junit.*;


public class GherkinTestRunSteps {
	@Given("Test is running")
	public void testIsRunning() throws Throwable {
		Assert.assertTrue(true);
	}

	@Then("Gherkin is working")
	public void gherkinIsWorking() throws Throwable {
		Assert.assertTrue(true);
	}
}
