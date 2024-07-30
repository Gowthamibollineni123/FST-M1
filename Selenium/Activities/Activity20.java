package activities;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity20 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		// Initialize Edge driver
		WebDriver driver =new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		//Open browser
		driver.get("https://v1.training-support.net/selenium/javascript-alerts");
		//Title of page
		System.out.println("page title :" +driver.getTitle());
		
		//Find the button to open a Prompt alert and click it.
		driver.findElement(By.xpath("//*[@id=\'prompt\']")).click();
		
		//Switch the focus  to the Alert 
		Alert promptalert= driver.switchTo().alert();
		
		//Print text alert
		String alerttext = promptalert.getText();
		System.out.println("Alert Text :"+alerttext );
		
		//Type into alert
		wait.until(ExpectedConditions.alertIsPresent());
		promptalert.sendKeys("Awesome!");
		Thread.sleep(5000);
		promptalert.accept();
		
		driver.quit();
				
		
	}

}
