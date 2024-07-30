package activities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		// Initialize Edge driver
		WebDriver driver =new EdgeDriver();
		Actions builder = new Actions(driver);
		driver.manage().window().maximize();
		
		//Open browser
		driver.get("https://v1.training-support.net/selenium/drag-drop");
		//Title of page
		System.out.println("page title :" +driver.getTitle());
		
		//Find the ball
		WebElement football= driver.findElement(By.xpath("//*[@id=\'draggable\']"));
		//Find drop zone 1
		WebElement dropzone1=driver.findElement(By.xpath("//*[@id=\'droppable\']"));
		//Find drop zone 2
		WebElement dropzone2=driver.findElement(By.xpath("//*[@id=\'dropzone2\']"));
		
		//Drag & drop to zone 1
		builder.clickAndHold(football).moveToElement(dropzone1).pause(3000).release().build().perform();
		
		//Drag 7 drop to zone 2
		builder.clickAndHold(football).moveToElement(dropzone2).pause(3000).release().build().perform();
		
		driver.quit();
	}

}
