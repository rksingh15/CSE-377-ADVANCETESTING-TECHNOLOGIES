package Abc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver; 
public class One {
    WebDriver driver;

    public void openBrowser() {
        driver = new FirefoxDriver(); 
    }

    public static void main(String[] args) {
        One aa = new One();
        aa.openBrowser();
    }
}
