package Basic_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebAutomation {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.puneripattern.com/");
		
		String getTitle = driver.getTitle();
		
		System.out.println(getTitle);
		
		
		if(getTitle.equals("Software Testing | Full Stack Development Training Hadapsar")) {
		System.out.println("Test Case Passsed");	
		}else 
		{
			System.out.println("Test Case Failed");
		}
		
		
	}
}
