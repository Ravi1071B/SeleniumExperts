package com.virphy.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


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
    By AllLinks					      = By.tagName("a");
    String RadioBtnMilk			      = "//input[@value='Milk']";
	//String RadioBtnButter		      ="//input[@value='Butter']";
	//String RadioBtnCheese		      ="//input[@value='Cheese']";
    By SelectMilk				      = By.xpath("//input[@value='Milk']");
    By SelectDropDownlist             = By.xpath("//*[@id='cap-view']/span[1]/span/span[2]/span");
    By ClickonOrange                  = By.xpath("//*[@id='color_listbox']/li[2]");
    By Closer                         = By.xpath("*[@id='wrapper']/div[2]/div[5]/div/div/div[1]/a/i");
    By DragNdrop                      = By.xpath("//*[@id='secondary']/div[1]/div[1]/div/div/div[1]");
    
    
     public SelHomePage(WebDriver driver) {
    	this.driver=driver;
    }
     public void searchselenium (String entrtTex) {
    	 driver.findElement(searchselenium).sendKeys(entrtTex);
    	 driver.findElement(GO).click();
    }
     public void clickProjectTap  () {
    	 driver.findElement(ProjectTap).click();
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
      public void getCurrentPageURL() {
  		String PageURL= driver.getCurrentUrl();
  		System.out.println("CurrentPage URL:"+PageURL);
  	}
      public void getAllLinks() {
    	  
    	  List<WebElement> allLinks =  driver.findElements(AllLinks);
    	  int count= allLinks.size();
  		System.out.println("No of Links in the page:"+count);
  		for(int i=0;i<count;i++) {	
  			System.out.println(allLinks.get(i).getAttribute("href"));
  		}
      }
      public void clickRadioBtn(String xpath) {
  		driver.findElement(By.xpath(xpath)).click();
      
  }


               //public void clickRadioBtn() {
	            // driver.findElement(By.xpath(RadioBtnMilk)).click();
                     //}

                  public void selectchkBox() {
	                     driver.findElement(SelectMilk).click();
              }
                  
                  public void SelectDropDownlist () throws InterruptedException {
                	  driver.findElement(SelectDropDownlist ).click();
                	  Thread.sleep(3000);
                	 // driver.findElement(ClickonOrange ).click();
                	  //Thread.sleep(3000);
                  }
                  
                 public  void ClickonOrange() {
                	  driver.findElement(ClickonOrange).click();
                 }
           
                   public void DragNdrop() throws InterruptedException {
                	   //driver.findElement(DragNdrop);
                	   Thread.sleep(3000);
                	   driver.findElement(Closer).click();
                	Actions actions = new Actions(driver);
                	actions.dragAndDropBy((WebElement) DragNdrop, 34, -76).build().perform();
                	   
                   }
                  
          }

 
    
    

