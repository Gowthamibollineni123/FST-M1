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

public class Activity18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		// Initialize Edge driver
		WebDriver driver =new EdgeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		//Open browser
		driver.get(" 	");
		//Title of page
		System.out.println("page title :" +driver.getTitle());
		// Find the dropdown
        WebElement selectElement = driver.findElement(By.id("multi-select"));
        // Pass the WebElement to the Select object
        Select multiSelect = new Select(selectElement);
        
        //select javascript by using visible text
        multiSelect.selectByVisibleText("Javascript");
        
        //Select the 4th, 5th and 6th options using the index.
        multiSelect.selectByIndex(4);
        multiSelect.selectByIndex(5);
        multiSelect.selectByIndex(6);
        
        //Select the "NodeJS" option using the value.
        multiSelect.selectByValue("node");
        //print selected options
        List<WebElement> selectedOptions = multiSelect.getAllSelectedOptions();
        System.out.println("Selected options are: ");
        for(WebElement option : selectedOptions) {
            System.out.println(option.getText());
        }
        
        //Deselect the 5th option using index.
        multiSelect.deselectByIndex(5);
        //print selected options
        selectedOptions = multiSelect.getAllSelectedOptions();
        System.out.println("Selected options are: ");
        for(WebElement option : selectedOptions) {
            System.out.println(option.getText());
        }
		
		driver.quit();

	}

}
