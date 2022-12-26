package CucumberUsageTest.SeleniumTest;

import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.*;
import org.junit.*;


public class SeleniumTestRunSteps {
	public static WebDriver driver = SeleniumTestTest.driver;

	WebElement element = null;

	private WebElement findElementByXpath(String xpath) {
		try {
			return driver.findElement(By.xpath(xpath));
		} catch (NoSuchElementException e) {
			return null;
		}
	}

	private WebElement findLinkByContents(String contents) {
		try {
			return driver.findElement(By.linkText(contents));
		} catch (NoSuchElementException e) {
			return null;
		}
	}

	@Given("Selenium driver is ready")
	public void seleniumIsReady() {
		Assert.assertTrue(driver != null);
	}

	@Given("URL is {word}")
	public void setUrl(String url) throws Throwable {
		if (driver.getCurrentUrl() != url) {
			driver.get(url);
		}
	}

	@Then("URL should be {word}")
	public void testUrl(String url) throws Throwable {
		Assert.assertEquals(url, driver.getCurrentUrl());
	}

	@Then("Title should be {string}")
	public void testTitle(String title) throws Throwable {
		Assert.assertEquals(title, driver.getTitle());
	}

	@Then("Find element with xpath {string}")
	public void findXPath(String xpath) throws Throwable {
		element = findElementByXpath(xpath);
		Assert.assertNotNull(element);
	}

	@Then("Find link with text {string}")
	public void findLink(String contents) {
		element = driver.findElement(By.partialLinkText(contents));
		Assert.assertNotNull(element);
	}

	@Then("Hover over element")
	public void hoverElement() {
		Actions action = new Actions(driver);
		action.moveToElement(element, 0, 0).perform();
	}

	@Then("Wait {int} ms")
	public void wait(int ms) throws Throwable {
		Actions action = new Actions(driver);
		action.pause(ms).perform();
	}

	@Then("Element contents should be {string}")
	public void testElementContents(String contents) throws Throwable {
		Assert.assertNotNull(element);
		Assert.assertEquals(contents, element.getText());
	}

	@Then("Element should be a link")
	public void testElementIsLink() throws Throwable {
		Assert.assertNotNull(element);
		Assert.assertEquals("a", element.getTagName());
		Assert.assertNotNull(element.getAttribute("href"));
	}

	@Then("Follow link element")
	public void followLinkElement() throws Throwable {
		Assert.assertNotNull(element);
		String href = element.getAttribute("href");
		Assert.assertNotNull(href);
		driver.get(href);
	}
}
