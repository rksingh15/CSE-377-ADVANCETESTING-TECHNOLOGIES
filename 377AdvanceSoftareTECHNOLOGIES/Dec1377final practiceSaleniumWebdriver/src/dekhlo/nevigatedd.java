package dekhlo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class nevigatedd {

	WebDriver driver;

	void apple() {
		driver = new FirefoxDriver();

	}

	void Opentutorial() {
		driver.get("https://omayo.blogspot.com/");
	}

	void Radio() {
		WebElement radio = driver.findElement(By.id("checkbox2"));
		// cssSelector
		// By.name
		// By.xpath

		radio.click();
		System.out.println("Selected male");

	}
	void nevi() {
		driver.navigate().to("https://www.geeksforgeeks.org/courses/dsa-to-development-coding-guide");
	}
	void Open() {
		driver.get("https://www.geeksforgeeks.org/courses/dsa-to-development-coding-guide");
	}

	public static void main(String[] args) {
		nevigatedd obj = new nevigatedd();
		obj.apple();
		obj.Opentutorial();
		obj.Radio();
//		
		obj.Open();

	}

}
