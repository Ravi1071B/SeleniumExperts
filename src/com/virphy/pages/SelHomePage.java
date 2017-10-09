package com.virphy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelHomePage {
	
	public WebDriver driver;
	
	
	// Globar variable defined to all page level webelement address through Xpath locators.
	
		String PageTitle="Selenium - Web Browser Automation";
		
	By searchselenium                 = By.xpath("//*[@id='q']");
	By GO                             = By.xpath("//input[@value='Go']");
	By ProjectTap                     = By.xpath("//a[@id='menu_projects']/a");
    By Download                       = By.xpath("//a[@id='menu_download']/a");
    By Documentataion                 = By.xpath("//a[@id='menu_download']/a");
    By Support                        = By.xpath("//a[@id='menu_support']/a");
    By AboutTab			              = By.xpath("//li[@id='menu_about']/a");
	
    
    
    public SelHomePage(WebDriver driver) {
    	this.driver=driver;
    }
     public void searchselenium (String entrtTex) {
    	 driver.findElement(searchselenium).sendKeys(entrtTex);
    	 driver.findElement(GO).click();
    }
     public void clickProjectTap  () {
    	 driver.findElement(ProjectTap ).click();
   }
     public void clickdownload() {
    	 driver.findElement(Download).click();
     }
     public void clickdocument() {
    	 driver.findElement(Documentataion).click();
     }
     public void cliksupport() {
    	  driver.findElement(Support).click();
      }
     public void clickAboutTab() {
    	 driver.findElement(AboutTab).click();
     }
      public void getPageTitle() {
    	  String actualTitle = driver.getTitle();
    	  if(PageTitle.equals(actualTitle)) {
    		System.out.println("Title matches.."+actualTitle);
    		  
    	  }
    		  
    		  
    	  }
      }
    
    
    
    

