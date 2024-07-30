package activities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		// Initialize Edge driver
		WebDriver driver =new FirefoxDriver();
		Actions builder = new Actions(driver);
		driver.manage().window().maximize();
		
		//Open browser
		driver.get("https://v1.training-support.net/selenium/input-events");
		//Title of page
		System.out.println("page title :" +driver.getTitle());
		
		 // Perform left click
         builder.click().pause(1000).build().perform();
        // Print the front side text
        String frontText = driver.findElement(By.className("active")).getText();
        System.out.println(frontText);

        // Perform left click
        builder.doubleClick().pause(3000).build().perform();
        // Print the front side text
        frontText = driver.findElement(By.className("active")).getText();
        System.out.println(frontText);

        // Perform left click
        builder.contextClick().pause(3000).build().perform();
        // Print the front side text
        frontText = driver.findElement(By.className("active")).getText();
        System.out.println(frontText);
		driver.quit();
	}

}
