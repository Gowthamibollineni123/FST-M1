package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Firefox has Gecodriver
		//it will get driver and setup driver if we don't have
		WebDriverManager.edgedriver().setup();
				// Initialize Chrome driver
		WebDriver driver =new EdgeDriver();
				
		driver.get("https://v1.training-support.net");
				
		System.out.println("Home Page Tittle "+driver.getTitle());
		//We can use by ID,  class name & text
		//driver.findElement(By.id("about-link")).click();
		driver.findElement(By.linkText("About Us")).click();
		System.out.println("About page title: "+driver.getTitle());
		Thread.sleep(5000);
		driver.quit();

	}

}
