package activities;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		// Initialize Edge driver
		WebDriver driver =new EdgeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		//Open browser
		driver.get("https://v1.training-support.net/selenium/javascript-alerts");
		//Title of page
		System.out.println("page title :" +driver.getTitle());
		
		//Find the button to open a CONFIRM alert and click it.
		driver.findElement(By.xpath("//*[@id=\'confirm\']")).click();
		
		//Switch the focus  to the Alert 
		Alert alert= driver.switchTo().alert();
		
		//Print text alert
		String alerttext = alert.getText();
		System.out.println("Alert Text :"+alerttext );
		
		//Close alert
		alert.accept();
		driver.quit();
		
	}

}
