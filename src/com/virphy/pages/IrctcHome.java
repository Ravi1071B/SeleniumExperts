package com.virphy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IrctcHome {
	public WebDriver driver;
	 String pageTitle="IRCTC-Login";
	
	By Username = By.xpath("//input[@name='useName']");
	By PassWd   = By.xpath("//input[@name='password']");
	By GO       = By.xpath("//input[@value='GO']");
	
	
	 public IrctcHome(WebDriver driver) {
		 this.driver=driver;
	 }
	 
	 public void Username(String entertxt) {
		 driver.findElement(Username).sendKeys(entertxt);
	 }
	 
	 public void PassedWd(String entertxt1) {
		 driver.findElement(PassWd).sendKeys(entertxt1);
		 driver.findElement(GO).click();
		 
		 
	 }
}
