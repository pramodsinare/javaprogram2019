package comp.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class movetospecificelement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		 WebDriver driver=new ChromeDriver(); 
        driver.get("http://demoqa.com/slider/");
        System.out.println("demoqa webpage Displayed");   
     //Maximise browser window
 driver.manage().window().maximize();    
 //Adding wait 
 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
                
        //Instantiate Action Class        
        Actions actions = new Actions(driver);
        //Retrieve WebElemnt 'slider' to perform mouse hover 
     WebElement slider = driver.findElement(By.id("slider"));
     //Move mouse to x offset 50 i.e. in horizontal direction
     actions.moveToElement(slider,50,0).click(slider).perform();
    // slider.click();
     System.out.println("Moved slider in horizontal directions");
     
        // Close the main window 
        //driver.close();

	}

}
