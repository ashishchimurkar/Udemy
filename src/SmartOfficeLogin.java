import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class SmartOfficeLogin{
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ATT Tool\\Selenium Testing\\Udemy\\driver\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://wwwdr.ez-data.com/login.shtml?FRONTEND=1&login=display");
		System.out.println();driver.getTitle();
		driver.findElement(By.xpath("//input[contains(@name,'Office')]")).sendKeys("MCA");
		driver.findElement(By.xpath("//input[@name='User']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='Pwd']")).sendKeys("Apple8");
		driver.findElement(By.xpath("//*[@id='btnsubmit']")).click();
		System.out.println(driver.getTitle());
		 driver.switchTo().parentFrame();
		 driver.close();
	
		
	}

}
