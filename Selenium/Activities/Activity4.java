package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity4 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Edge has Edge driver
		WebDriverManager.edgedriver().setup();
		// Initialize Edge driver
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://v1.training-support.net/selenium/target-practice");
		//Get title & print in console
		System.out.println("Title of the page :"+driver.getTitle());
		
		// Find 3rd header and print its text
		System.out.println(driver.findElement(By.xpath("//h3[@id='third-header']")).getText());
		
		// Find 5th header & its color print its color
		System.out.println(driver.findElement(By.xpath("//h5[text()='Fifth header']")).getCssValue("color"));
        
		// Find the violet button and print its classes
        String violetButtonClass = driver.findElement(By.xpath("//button[text()='Violet']")).getAttribute("class");
        System.out.println(violetButtonClass);
        
        // Find the grey button and print its text
        String greyButtonText = driver.findElement(By.xpath("//button[text()='Grey']")).getText();
        System.out.println(greyButtonText);
		driver.quit();

}
}