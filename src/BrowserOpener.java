import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOpener {
	
	public void ChromeB() {

		System.setProperty("webdriver.chrome.driver",
				"D:\\ATT Tool\\Selenium Testing\\Udemy\\driver\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());

}

}