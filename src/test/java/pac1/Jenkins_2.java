package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Jenkins_2
{

	@Test
	public void magicBricks() 
	{
		System.setProperty("webdriver.chrome.driver", "../Batch2/DriverExe/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.magicbricks.com/");
		
		System.out.println("title of the page is="+driver.getTitle());


	}
	
}
