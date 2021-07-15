
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RahulShetti {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\ATT Tool\\Selenium Testing\\Udemy\\driver\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// TestCase#1: To Select Country code from Autosuggestive drop down

		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		for (WebElement option : options) {

			if (option.getText().equalsIgnoreCase("india"))

			{
				option.click();

				break;
			}
		}

		// TestCase#2: To select drop down button

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();

		// TestCase#3 : To select drop down option {From to To city option}

		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@text='Ahmedabad (AMD)']")).click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("(//a[@text='Goa (GOI)'])[2]")).click();
		driver.findElement(
				By.xpath("//*[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@text='Goa (GOI)']"))
				.click();

		// Test Case#4 : Current Date selection from calendar

		// driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		if (driver.findElement(By.id("Div1")).getAttribute("Style").contains("0.5")) {
			System.out.println("Its Disabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertFalse(false);
		}

		// TestCase#5 : To select No of person and currency
		WebElement staticChoices = driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
		/*
		 * WebElement staticCurrency =
		 * driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		 * 
		 * Select dropdown = new Select(staticCurrency);
		 * 
		 * dropdown.selectByIndex(2); System.out.println(
		 * dropdown.getFirstSelectedOption().getText());
		 */

		Select drop1 = new Select(staticChoices);

		drop1.selectByValue("USD");
		Thread.sleep(2000);
		String str1 = drop1.getFirstSelectedOption().getText();

		System.out.println(str1);

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);

		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		// To check assertion or validation
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='btnclosepaxoption']")).click();

		// System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		// TestCase#6 :To select checkbox
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		// System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());

		// System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(), 6);

		Thread.sleep(2000);

		// TestCase#7: To select search button

		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();

	}

}
