package com.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {

public static WebDriver driver;
	           
	            
	            
		
		   @Test
		   public static void loginTest() {
			   driver = new ChromeDriver();
	            driver.manage().window().maximize();
	            driver.get("http://tutorialsninja.com/demo");
	            driver.findElement(By.linkText("My Account")).click();
	            
	            
	          
				driver.findElement(By.partialLinkText("Login")).click();
				driver.findElement(By.cssSelector("input#input-email")).sendKeys("Akter1122344@gmail.com");
				driver.findElement(By.cssSelector("input#input-password")).sendKeys("shima112233@");
				driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
				driver.findElement(By.cssSelector("div.list-group>a:nth-of-type(13)")).click();
				driver.findElement(By.cssSelector("a.btn.btn-primary")).click();
			   
	}

}
