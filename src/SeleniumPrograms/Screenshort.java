package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.virphy.util.Utility;

public class Screenshort {
  @Test
  public void Screenshorttaken() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Libs\\chromedriver.exe");
	  
	  WebDriver driver=   new ChromeDriver();
	  
	   driver.get("http://www.facebook.com");
	   Thread.sleep(3000);
	   driver.manage().window().maximize();
	 // Utility.Screenshorttaken(driver, "Browserstarted");
	 
	driver.findElement(By.xpath("//*[@id='email']")).sendKeys("C.ravi1071@gmail.com");
	Thread.sleep(3000);
	//Utility.Screenshorttaken(driver, "AfterUN");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ravi123");
	Thread.sleep(3000);
	//Utility.Screenshorttaken(driver, "After PWD");
	Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  Thread.sleep(3000);
	  Utility.Screenshorttaken(driver, "LastScreenshort");
	  Thread.sleep(2000);
	 	  driver.quit();
	  
  }
}
