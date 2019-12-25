package comp.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookPage {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		//driver.get("https://google.com");
	    driver.get("https://facebook.com");
		driver.manage().window().maximize();
		/*login*/
		//driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("pramod.sinare100@gmail.com");
		//driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("Pramod@86");
	//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Thread.sleep(1500);
		//driver.findElement(By.xpath("//*[@id=\'u_0_b\']")).click();	
	//	driver.findElement(By.id("email")).sendKeys("pramod.sinare100@gmail.com");	
		driver.findElement(By.className("inputtext")).sendKeys("pramod.sinare100@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Pramod@86");
	//	Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'u_0_b\']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.quit();
		driver.findElement(By.name("firstname")).sendKeys("pramod");
		driver.findElement(By.xpath("//*[@id=\'u_0_o\']")).sendKeys("sinare");
		driver.findElement(By.xpath("//*[@id=\'u_0_r\']")).sendKeys("9503784116");
		driver.findElement(By.xpath("//*[@id=\'u_0_w\']")).sendKeys("7709385522");
		Select dd=new Select(driver.findElement(By.xpath("//*[@id=\'day\']")));
		dd.selectByIndex(26);
		Select mm=new Select(driver.findElement(By.xpath("//*[@id=\'month\']")));
		mm.selectByValue("7");
		Select yy=new Select(driver.findElement(By.xpath("//*[@id=\'year\']")));
		yy.selectByVisibleText("1986");
		driver.findElement(By.xpath("//*[@id=\'u_0_z\']/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\'u_0_13\']")).click();
		driver.quit();
	}

}
