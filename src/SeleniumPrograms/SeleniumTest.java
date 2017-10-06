package SeleniumPrograms;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.virphy.TestNG.BrowserHooks;
import com.virphy.pages.SelHomePage;
import com.virphy.util.AutoConstant;
import com.virphy.util.PropFileHandler;

public class SeleniumTest extends BrowserHooks {
  @Test (dataProvider="hardCodedBrowsers")
  public void openSeleniumRAVI(String browser,String version,String os, Method method) throws IOException, MalformedURLException {
	  this.createDriver(browser, version, os, method.getName());
		 
	  WebDriver driver = this.getWebDriver(); 
	  //driver.get("http://www.seleniumhq.org");
	  
	
	//Page object for selenium homepage
	   SelHomePage objSel = new SelHomePage(driver);

	
	//Opening the selenium homepage URL
		
	  driver.get(PropFileHandler .fetchKey(AutoConstant.URL.URL) );
	  
	//Type hyderabad in the search selenium text box and click GO
	  objSel.searchselenium("Hyderabad");
	  
		
	  

  }
  
}
