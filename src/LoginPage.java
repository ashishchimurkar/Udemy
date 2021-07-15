import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\ATT Tool\\Selenium Testing\\Udemy\\driver\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
	//driver.findElement(By.id("username")).sendKeys("Ebix");
		
		//customise css selector
	driver.findElement(By.cssSelector("input#username")).sendKeys("Hi");
	//driver.findElement(By.id("password")).sendKeys("123");
	
	//regular expression to get xpath contains 
	driver.findElement(By.xpath("//input[contains(@id,'passwor')]")).sendKeys("Hello");
	driver.findElement(By.xpath("//*[@id='Login']")).click();
		//driver.close();
	}
}
