package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		// Initialize Edge driver
		WebDriver driver =new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		//Open browser
		driver.get("https://v1.training-support.net/selenium/tab-opener");
		//Title of page
		System.out.println("page title :" +driver.getTitle());
		// Print the handle of the parent window
        System.out.println("Current tab: " + driver.getWindowHandle());
       
        // Find button to open new tab
        driver.findElement(By.id("launcher")).click();
        
        //Wait for 2nd tab
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        //print all windows
        System.out.println("Currently opened windows :"+driver.getWindowHandles());
        
        //Focus to current window
        for(String handle :driver.getWindowHandles()) {
        	driver.switchTo().window(handle);
        }
        
        //Wait for new page to load
        wait.until(ExpectedConditions.elementToBeClickable(By.id("actionButton")));
        //print handle of current tab
        System.out.println("current tab :"+driver.getWindowHandle());
        //print the title & heading of new page
        System.out.println("page title :"+driver.getTitle());
        String pageheading = driver.findElement(By.className("content")).getText();
        
        System.out.println("Page Heading: " + pageheading);
        // Find and click the button on page to open another tab
        driver.findElement(By.id("actionButton")).click();

        // Wait for new tab to open
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
        // Switch focus
        for(String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        // Wait for the new page to load
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("content")));
        // Print the handle of the current tab
        System.out.println("Current tab: " + driver.getWindowHandle());
        // Print the title and heading of the new page
        System.out.println("Page title: " + driver.getTitle());
        pageheading = driver.findElement(By.className("content")).getText();
        System.out.println("Page Heading: " + pageheading);

        // Close the browser
        driver.quit();
	}

}
