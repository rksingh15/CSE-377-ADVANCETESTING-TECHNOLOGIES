package okk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class Drop {
	WebDriver driver;
	
	 void apple() {
		 driver =new FirefoxDriver();
		 
	 }
	 void facebook() {
		 driver.get("https://demo.guru99.com/test/newtours/register.php"); // for open any Url 
	 }
	 void DDrop() {
		Select list  = new Select(driver.findElement(By.name("country")));
		list.selectByVisibleText("AMERICAN SAMOA");
		
		 
	 }
	 public static void main(String[]args) {
		 Drop obj=new Drop();
		 obj.apple();
		 obj.facebook();
		 obj.DDrop();
		 
	 }
}