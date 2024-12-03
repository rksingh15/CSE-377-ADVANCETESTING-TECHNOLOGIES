package okk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//....07/10/2024
public class Radio_button {
	WebDriver driver;
	
	 void apple() {
		 driver =new FirefoxDriver();
		 
	 }
	 void Opentutorial() {
		 driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");; // for open any Url 
	 }
	 void Radio() {
	       WebElement radio = driver.findElement(By.cssSelector("#gender"));
	       //cssSelector
			//By.name
			//By.xpath
	       
	        radio.click();
	        System.out.println("Selected male");
	        
		 
	 }
	 public static void main(String[]args) {
		 Radio_button obj=new Radio_button();
		 obj.apple();
		 obj.Opentutorial();
		 obj.Radio();
		 
	 }
}
