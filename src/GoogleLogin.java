import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLogin extends ChildMethod{

	public static void main(String[] args) throws InterruptedException {
		
		GoogleLogin gl= new GoogleLogin();
		gl.GetURL();

		Thread.sleep(3000);
		
	
		/*
		 * driver.findElement(By.id("email")).sendKeys(
		 * "ashishchimurkar@gmail.com");
		 * driver.findElement(By.id("pass")).sendKeys("Micromax@12");
		 * Thread.sleep(5000);
		 * driver.findElement(By.cssSelector("button[type='submit']")).click();
		 * Thread.sleep(5000); driver.findElement(By.linkText(""))
		 */

	}

}
