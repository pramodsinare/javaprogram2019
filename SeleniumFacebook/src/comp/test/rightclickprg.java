package comp.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclickprg {

	public static void main(String[] args) {
		//Set system properties for chrome driver
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		// Create a new instance of the chrome driver
		WebDriver driver=new ChromeDriver();
		//launch the url
		driver.get("https://demoqa.com/tooltip-and-double-click/");
		  System.out.println("demoqa webpage displayed");
		  //Maximise browser window
		  driver.manage().window().maximize();
		//Instantiate Action Class
		  Actions actions=new Actions(driver);
		//Retrieve WebElement to perform right click
		  WebElement btnelement=driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[1]/a"));
		//Right Click the button to display Context Menu&nbsp;
		  actions.contextClick(btnelement).build().perform();
		  System.out.println("Right click Context Menu displayed");
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  WebElement element=driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[2]/a"));
		  actions.click(element).build().perform();
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  WebElement element2=driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[3]/a"));
		  actions.click(element2).build().perform();
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  WebElement element3=driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[2]/h3"));
		  actions.contextClick(element3).build().perform();
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  WebElement element4=driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[2]/ul/li[1]/a"));
		  actions.contextClick(element4).perform();
		  WebElement copy=driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[2]/ul/li[1]/a"));

			String copytest=copy.getText();
			System.out.println(copytest);
			copy.click();
			driver.close();

		  
		
		    

	}

}
