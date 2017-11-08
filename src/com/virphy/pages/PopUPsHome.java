package com.virphy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PopUPsHome {
	
	public WebDriver driver;
	
	//yatra.com
	By Departure = By.xpath("//input[@id='BE_flight_depart_date']");
    By Datepick  = By.xpath("//a[@id='a_2017_10_19']");
    
    //https://www.irctc.co.in/eticketing/loginHome.jsf
    
    By Signin =  By.xpath("//input[@id='loginbutton']");
    By Username = By.xpath("//input[@id='usernameId']");
    
   
    
    
    public PopUPsHome(WebDriver driver) {
    	this.driver=driver;
    }
    	
    	public void Departure() {
    		driver.findElement(Departure).click();
    		
    	}
    	
    	public void Datepick() {
    		driver.findElement(Datepick).click();
    	}
    public void Signin() {
    	driver.findElement(Signin).click();
    	
    }
    
    public void Username(String entertxt) {
    	driver.findElement(Username).sendKeys(entertxt );
    }
}
