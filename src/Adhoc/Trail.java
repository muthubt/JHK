package Adhoc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver browser = new ChromeDriver();
		browser.get("https://rahulshettyacademy.com/locatorspractice/" );
		browser.manage().window().fullscreen();
		Thread.sleep(2000);
		String m = browser.getTitle();
		System.out.println(m +"is the title of the current url launched");
		String t = new String();
		String[] t1 = {"Today","Ram","Kumar","Vijay","Sam"};
		
		for(int i=0; i<t1.length; i++)
			
		{
		System.out.println(t1[i]+" is the element of the Array");
		
		}
		
		browser.close();
	
	}

}
