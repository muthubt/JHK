import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleIntroduction {

	public static void main(String[] args) {
		//Invoking Browser
		//Chrome-ChromeDriver-Methods (open, close etc)
		//firefox-firefoxDriver->methods (open, close etc)
		//Safari-firefoxDriver->methods (open, close etc)

		//WebDriver gives method name -interface will have empty bodies
		//chromedriver.exe -> for chrome browser
		//step to invoke chrome driver
		//selenium manager
		System.setProperty("webdriver.chorme.driver", "C:\\Users\\Kanim\\OneDrive\\Documents");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();

	}

}
