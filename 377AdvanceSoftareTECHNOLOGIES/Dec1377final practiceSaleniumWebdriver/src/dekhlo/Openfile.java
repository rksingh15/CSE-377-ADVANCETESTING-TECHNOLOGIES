package dekhlo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Openfile {

	
	WebDriver driver;
	
	void OpenBrowser() {
		
		driver = new FirefoxDriver();
	}
	
	void Open() {
		
		driver.get("https://www.facebook.com");
	}
	
	void username() {
		WebElement aa= driver.findElement(By.id("email"));
		
		aa.sendKeys("ritiksinghkushwaha06@gmail.com");
		
		
		
	}
	void Idusername() {
		WebElement aa= driver.findElement(By.id("pass"));
		
		aa.sendKeys("facebook123Rk@");
		
		
		
	}
	
	void SelectLogin()
	{
		
		WebElement aa= driver.findElement(By.name("login"));
		aa.click();
	}
	
	
	
	public static void main(String [] args)
	{
		Openfile cc= new Openfile();
		
		cc.OpenBrowser();
		cc.Open();
		
		cc.username();
		
		cc.Idusername();
		
		cc.SelectLogin();
		
		
	}
}
