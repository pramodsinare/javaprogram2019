package comp.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class dubleclickprg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		WebDriver driverr=new ChromeDriver();
		driverr.get("https://demoqa.com/tooltip-and-double-click/");
		driverr.manage().window().maximize();
		Actions action=new Actions(driverr);
		WebElement element1=driverr.findElement(By.xpath("//*[@id=\"menu-top\"]/li[2]/a"));
		action.doubleClick(element1).build().perform();
		driverr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement copy=driverr.findElement(By.xpath("//*[@id=\"menu-top\"]/li[2]/a"));
		String copystring=copy.getText();
	System.out.println(copystring);
	copy.click();
		//WebElement element2=driver.findElement(By.linkText(linkText))
		driverr.close();

	}

}
