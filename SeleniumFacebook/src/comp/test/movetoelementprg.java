package comp.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class movetoelementprg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demoqa.com/menu/");
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		WebElement menuoption=driver.findElement(By.xpath("//*[@id=\"ui-id-9\"]"));
		action.moveToElement(menuoption).perform();
		System.out.println("Done Mouse hover on 'Music' from Menu");
		WebElement submenuoption=driver.findElement(By.xpath("//*[@id=\"ui-id-9\"]/span"));
		action.moveToElement(submenuoption).perform();
		 System.out.println("Done Mouse hover on 'Rock' from Menu");
		WebElement nextmenu=driver.findElement(By.xpath("//*[@id=\"ui-id-10\"]"));
		action.moveToElement(nextmenu).perform();
		driver.close();

	}

}
