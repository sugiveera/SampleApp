package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sample3 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sugiv\\Downloads\\Mydriver\\chromedriver-win64\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		
		Thread.sleep(2000);
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/modal-dialogs");
		Thread.sleep(2000);
		
		driver.findElement(By.id("showSmallModal")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("closeSmallModal")).click();
		Thread.sleep(500);
		
		driver.findElement(By.id("showLargeModal")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("closeLargeModal")).click();
		Thread.sleep(500);
		
		driver.close();
		
	}

}
