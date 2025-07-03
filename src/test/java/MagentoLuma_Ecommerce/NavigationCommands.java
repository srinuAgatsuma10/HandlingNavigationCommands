package MagentoLuma_Ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		// 1) Navigate to Command
		driver.navigate().to("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();

		// 2) Back Command
		driver.findElement(By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]")).click();
		driver.navigate().back();

		// 3) Forward Command
		driver.navigate().forward();

		// 4) Refresh Command
		driver.navigate().refresh();

		driver.quit();
	}

}
