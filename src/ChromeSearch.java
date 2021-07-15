import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeSearch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\ATT Tool\\Selenium Testing\\Udemy\\driver\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//ntp-realbox[@id='realbox']//div/input")).sendKeys("You Tube");

	}

}
