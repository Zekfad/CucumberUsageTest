package CucumberUsageTest.GherkinTest;

import io.cucumber.junit.CucumberOptions.*;
import io.cucumber.junit.*;
import org.junit.runner.*;
import org.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = { "classpath:features/GherkinTest.feature" },
	glue = { "CucumberUsageTest.GherkinTest" },
	snippets = SnippetType.CAMELCASE,
	plugin = { "pretty", }
)
public class GherkinTestTest {
	@BeforeClass
	public static void beforeClass() throws Exception {
		// MainPageRunSteps.driver = SeleniumConfig.getInstance();
	}

	@AfterClass
	public static void afterClass() throws Exception {
		// SeleniumConfig.close();
	}
}
