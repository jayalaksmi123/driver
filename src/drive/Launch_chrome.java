package drive;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_chrome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https:\\www.Swiggy.com");
		Thread.sleep(3000);
	}

}
