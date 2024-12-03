package Ca2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {
	WebDriver driver;

	void open() {
		driver = new FirefoxDriver();
	}

	void openSite() {
		driver.get("https://www.amazon.com");
	}

	void searchBar() {
		WebElement aa = driver.findElement(By.name("field-keywords"));

		aa.sendKeys("Laptop");

		aa.submit();

	}

	String Title() {
		String aaa = driver.getTitle();
		return aaa;
	}


	void openSite2() {
		driver.get("https://www.amazon.com/customer-preferences/country?ie=UTF8&preferencesReturnUrl=%2Fref%3Dnav_logo&ref_=footer_icp_cp" + "	}");
		
	}
	void dropDown() {
		
		Select ll = new Select(driver.findElement(By.cssSelector("span.a-button-text:nth-child(1)")));
		ll.selectByVisibleText("United States");
	}

	public String checklin() {
		String aaa = driver.getTitle();
		return aaa;
	}

	public static void main(String[] args) {

		Amazon obj = new Amazon();
		obj.open();
		obj.openSite();
		obj.searchBar();
		String aa = obj.Title();
		System.out.println("The link is " + aa);
		String bb = obj.checklin();
		if (aa.equalsIgnoreCase(bb)) {
			System.out.println("Both Title is Equal");
		}

		obj.openSite2();
		obj.dropDown();

	}

}
