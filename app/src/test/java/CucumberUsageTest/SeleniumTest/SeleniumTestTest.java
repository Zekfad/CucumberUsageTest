package CucumberUsageTest.SeleniumTest;

import io.cucumber.junit.CucumberOptions.*;
import io.cucumber.junit.*;
import org.junit.runner.*;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


@RunWith(Cucumber.class)
@CucumberOptions(
	features = { "classpath:features/selenium" },
	glue = { "CucumberUsageTest.SeleniumTest" },
	snippets = SnippetType.CAMELCASE,
	plugin = { "pretty", }
)
public class SeleniumTestTest {
	public static WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver = new EdgeDriver();
	}

	@AfterClass
	public static void afterClass() {
		driver.close();
	}
}
