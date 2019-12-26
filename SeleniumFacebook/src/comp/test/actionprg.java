package comp.test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import com.google.common.collect.ImmutableSet.Builder;

public class actionprg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		WebElement acts = driver.findElement(By.linkText("Home"));
		actions.moveToElement(acts);
		WebElement actss=driver.findElement(By.xpath("/html/body/div"+"/table/tbody/tr/td"+"/table/tbody/tr/td"+"/table/tbody/tr/td"+"/table/tbody/tr/td"));
		actions.moveToElement(actss);
		actions.click().build().perform();
        String bgColor = actss.getCssValue("background-color");
        System.out.println("Before hover: " + bgColor);                
        bgColor = actss.getCssValue("background-color");
        System.out.println("After hover: " + bgColor);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.close();

	}

}
