package comp.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddropprg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		//Actions class method to drag and drop 
		Actions action=new Actions(driver);
		WebElement from=driver.findElement(By.id("draggable"));
		WebElement to=driver.findElement(By.id("droppable"));
		//Perform drag and drop
		action.dragAndDrop(from, to).perform();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//verify text changed in to 'Drop here' box 
		 String textTo = to.getText();
		 if(textTo.equals("Dropped!")) {
		 System.out.println("PASS: Source is dropped to target as expected");
		 }else {
		 System.out.println("FAIL: Source couldn't be dropped to target as expected");
		 }
		 
		 driver.close();
		 
		
	}

}
                    /*Find below the steps of the scenario to be automated:*/
//1 Launch the web browser and launch our practice page https://demoqa.com/droppable/
//2 Find the required source element i.e. ‘Drag me to my target’ object in our sample
//3 Find the required target element i.e. ‘Drop Here’ object in our sample
//4 Now Drag and Drop ‘Drag me to my target’ object to ‘Drop Here’ object
//5 Verify message displayed on ‘Drop Here’ to verify that source element is dropped at the target element
//6 Close the browser to end the program
