package activities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		// Initialize Edge driver
		WebDriver driver =new EdgeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		//Open browser
		driver.get(" https://v1.training-support.net/selenium/selects");
		//Title of page
		System.out.println("page title :" +driver.getTitle());
		
		WebElement dropDown=driver.findElement(By.id("single-select"));
		Select singleselect = new Select(dropDown);
		
		//Select the second option using the visible text.
		singleselect.selectByVisibleText("Option 2");
		System.out.println("Second option :"+singleselect.getFirstSelectedOption().getText());
		
		// Select the third option using index
        singleselect.selectByIndex(3);
        System.out.println("Third option: " + singleselect.getFirstSelectedOption().getText());
        
        // Select the fourth option using value attribute
        singleselect.selectByValue("4");
        System.out.println("Fourth option: " + singleselect.getFirstSelectedOption().getText());
        
        // Print all the options
        List<WebElement> allOptions = singleselect.getOptions();
        System.out.println("Options in the dropdown: ");
        for(WebElement option : allOptions) {
            System.out.println(option.getText());
        }
        driver.quit();
	}

}
