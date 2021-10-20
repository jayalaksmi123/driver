package drive;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("https:\\www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		String URL=driver.getCurrentUrl();
		System.out.println(URL);

	}

}
