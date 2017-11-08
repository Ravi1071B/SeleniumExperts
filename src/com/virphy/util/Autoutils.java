package com.virphy.util;

import java.util.List;
import java.io.IOException;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Autoutils {
	
public WebDriver driver;
	
By AllLinks= By.tagName("a");

	public Autoutils(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public boolean getResponseCode(String URL) throws ClientProtocolException, IOException {
		
		int respCode = Request.Get(URL).execute().returnResponse().getStatusLine().getStatusCode();
				
		System.out.println(URL+"-->"+respCode);
		
		if(respCode==200){
			return true;
		}else{
			return false;
		}
		
	}
	
	public  byte[] pwdEncrypt(String Password){
		byte[] pwd = Password.getBytes();
		byte[] encodedBytes = Base64.encodeBase64(pwd);
		System.out.println("encodedBytes " + new String(encodedBytes));
		return encodedBytes;
		
	}
	
	public  byte[] pwdDecrypt(String Password){
		byte[] pwd = Password.getBytes();
		byte[] DecodedBytes = Base64.decodeBase64(pwd);
		System.out.println("DecodedBytes " + new String(DecodedBytes));
		return DecodedBytes;
		
	}
	
	
	
    public void getAllLinks() throws ClientProtocolException, IOException {
		
    	//Collect all link URL from Page
		List<WebElement> allLinks= driver.findElements(AllLinks);
		int count= allLinks.size();
		System.out.println("No of Links in the page:"+count);
		
		for(int i=0;i<count;i++) {
			System.out.println(allLinks.get(i).getAttribute("href"));;
			
			//Get the response code of all links collected..
			getResponseCode(allLinks.get(i).getAttribute("href"));
			
		}

    }

}
