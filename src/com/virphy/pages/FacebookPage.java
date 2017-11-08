package com.virphy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookPage {
	
	public WebDriver driver;
	
	
	By Email     = By.xpath("//input[@type='email']");
	By Passed    = By.xpath("//input[@name='pass']");
	By Login     = By.xpath("//input[@type='submit']");
	//By Lastname  = By.cssSelector("input.lastname");       cssSelector Path  
	//By Firstname = By.cssSelector("input#u_0_g");          cssSelector path
    //By Firstname = By.cssSelector("input[name*='pass']");   cssSlector path
	
	
	
	public FacebookPage(WebDriver driver) {
		this.driver=driver;
		
	}
	 public void Email(String entertxt) {
		 driver.findElement(Email).sendKeys(entertxt);
		 
	 }
	 
	 public void Passed (String entertxt) {
		 driver.findElement(Passed).sendKeys(entertxt);
		 //driver.findElement(GO).click();
		}
	 public void clickLogin() {
		 driver.findElement(Login).click();
		 
	 }
	 
}
