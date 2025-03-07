package Adhoc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
		driver.findElement(By.id("nav-search-submit-button")).click();
		//Actions class
		Actions move = new Actions(driver);
		
		
	
		

	}

}
