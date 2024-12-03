package dekhlo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectoption {
	
	WebDriver driver;

	void opensite() {
		
		driver =new FirefoxDriver();
	}
	
	void openLink()
	{
		driver.get("https://omayo.blogspot.com/");
	}
	
	void selectItem()
	{
		
		Select oo =new Select(driver.findElement(By.id("drop1")));
		
		oo.selectByVisibleText("doc 4");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Selectoption aa= new Selectoption();
		aa.opensite();
		aa.openLink();
		aa.selectItem();

	}

}
