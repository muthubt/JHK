import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chorme.driver", "C:\\Users\\Kanim\\OneDrive\\Documents");
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get("http://spicejet.com");
		driver.findElement(By.xpath(
				"//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[5]/div[1]/div[1]/div[1]/div[2]/div[2]/*[1]"))
				.click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[5]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/*[1]"))
		.getText());
		int i = 0;
		while (i < 10) {
			driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[5]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/*[1]"))
					.click();
			i++;
		}
		
		System.out.println(driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[5]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/*[1]"))
				.getText());

	}

}
