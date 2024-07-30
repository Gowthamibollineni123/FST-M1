package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity14 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		// Initialize Edge driver
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://v1.training-support.net/selenium/tables");
		//get title of the page & print
		System.out.println("Tittle of page :"+driver.getTitle());
		
		//print the number of columns in 2nd table
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr[1]/td"));
        System.out.println("Number of columns: " + cols.size());	
		
		//print the number of Rows in 2nd table
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
		System.out.println("Number of rows: " + rows.size());

		
		// Print the cell value of the second row and second column
        WebElement cellValue = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println("Second row, second column value: " + cellValue.getText());
       
        //sort the table
        driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th")).click();
        System.out.println("Sorted table");
        
        // Print the cell value of the second row and second column again
        cellValue = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println("Second row, second column value: " + cellValue.getText());
        Thread.sleep(5000);
        // Print the cell values of the footer
        List<WebElement> footer = driver.findElements(By.xpath("//table[@id='sortableTable']/tfoot/tr/th"));
        System.out.println("Cell values of the footer: ");
        for(WebElement cell : footer) {
            System.out.println(cell.getText());
        }

        // Close the browser
        driver.quit();
		
	}

}
