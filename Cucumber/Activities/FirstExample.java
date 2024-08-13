package stepDefinitions;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;


import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstExample extends BaseClass {
	@BeforeAll
	public static void setUp() {
		// Setup Edge driver
		WebDriverManager.edgedriver().setup();
		// Initialize driver
		driver = new EdgeDriver();
	}

	@AfterAll
	public static void tearDown() {
		// close browser
		driver.quit();
	}

	@Given("the user is on TS homepage")
	public void openTSHomePage() {
		// open TS Home page
		driver.get("https://v1.training-support.net");
		// Assertion
		Assertions.assertEquals("Training Support", driver.getTitle());
	}

	@When("the user clicks on the About Us link")
//Find & click about us
	public void clickAboutUs() {
		driver.findElement(By.id("about-link")).click();
	}

	@Then("the user is redirected to the About Page")
	public void verifyAboutPage() {
		// Assertion
		Assertions.assertEquals("About Training Support", driver.getTitle());
	}
}