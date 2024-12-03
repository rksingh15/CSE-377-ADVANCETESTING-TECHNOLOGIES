package dekhlo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkboxclick {
	
	
		WebDriver driver;
		
		 void apple() {
			 driver =new FirefoxDriver();
			 
		 }
		 void Opentutorial() {
			 driver.get("https://omayo.blogspot.com/");
		 }
		 void Radio() {
		       WebElement radio = driver.findElement(By.id("checkbox2"));
		       //cssSelector
				//By.name
				//By.xpath
		       
		        radio.click();
		        System.out.println("Selected male");
		        
			 
		 }
		 public static void main(String[]args) {
			 checkboxclick obj=new checkboxclick();
			 obj.apple();
			 obj.Opentutorial();
			 obj.Radio();
			 
		 }
	}


