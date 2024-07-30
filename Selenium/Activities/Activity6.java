package activities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity6 {
	public static void main(String[] args) {
	//Edge has Edge driver
	WebDriverManager.edgedriver().setup();
	// Initialize Edge driver
	WebDriver driver =new EdgeDriver();
	Actions builder = new Actions(driver);
	driver.manage().window().maximize();
	
	//Open browser
	driver.get("https://v1.training-support.net/selenium/input-events");
	//Title of page
	System.out.println("page title :" +driver.getTitle());
	//Press the key
	builder.sendKeys("s").build().perform();
	 // Press CTRL+A and CTRL+C
    builder.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();

    // Close the browser
	
	driver.quit();
}
}