import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UITemp {

	public static String getUItemp(String city) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		String baseUrl = "https://www.accuweather.com";
		driver.get(baseUrl);
		driver.manage().window().maximize();

		Navigation.search(driver, city);

		String temp = driver
				.findElement(By.xpath("//*[contains(text(),'Current Weather')]//parent::div//div[@class='temp']"))
				.getText();
		temp = temp.replace("C", "");
		temp = temp.replace("°", "");

		System.out.println("UI temp " + temp);

		driver.close();

		return temp;
	}
}
