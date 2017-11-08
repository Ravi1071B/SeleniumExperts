package com.virphy.util;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {	
	
	public static void Screenshorttaken(WebDriver driver, String screenshortName){
		
	try 
		 {
			TakesScreenshot ts= (TakesScreenshot)driver;
			  File source = ts.getScreenshotAs(OutputType.FILE);
			  FileUtils.copyFile(source, new File(".//Screenshort/"+screenshortName+".png"));
			  System.out.println("Screenshort taken");
		} 
		 catch (Exception e) {
			 
			 System.out.println("Expection while taking screenshort"+e.getMessage());
			
			
		}	
	}
}
