package assignment2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sample1 {
	
	public static void main(String args[]) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sugiv\\Downloads\\Mydriver\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		       
		//access the website
		driver.get("https://demoqa.com/checkbox");
		
		driver.findElement(By.id("item-1")).click();
		
		// close the driver
		driver.close();
		
	}

}
