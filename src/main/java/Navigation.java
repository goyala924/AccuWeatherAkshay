import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Navigation {

	public static void search(WebDriver driver, String city) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		By searchBox = By.xpath("//input[@placeholder='Search']");
		wait.until(ExpectedConditions.visibilityOfElementLocated(searchBox)).clear();
		wait.until(ExpectedConditions.visibilityOfElementLocated(searchBox)).sendKeys(city);
		System.out.println("Entered " + city + " in Search Box.");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'" + city + "')]")));
		driver.switchTo().activeElement();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'" + city + "')]"))).click();
	}
}