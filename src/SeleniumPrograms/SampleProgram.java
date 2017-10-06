package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SampleProgram {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Libs\\chromedriver.exe");
		{
     driver=new ChromeDriver();
    driver.get("http://www.seleniumhq.org");
   Thread.sleep(2000);
   driver.manage().window().maximize();
    driver.findElement(By.xpath(".//*[@id='menu_download']/a")).click();
    Thread.sleep(2000);
    driver.quit();
	  }

   }
}
