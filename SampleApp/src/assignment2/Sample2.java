package assignment2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Sample2 {

	public static void main(String args[]) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sugiv\\Downloads\\Mydriver\\chromedriver-win64\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		try {

			Thread.sleep(2000);
			driver.manage().window().maximize();

			Thread.sleep(2000);
			driver.get("https://demoqa.com/alerts");
			Thread.sleep(2000);
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,120)");
			Thread.sleep(500); 

			driver.findElement(By.id("alertButton")).click();
			Thread.sleep(2000);
			// Dismiss an alert.
			Alert alert = driver.switchTo().alert();
			alert.dismiss();

		
			js.executeScript("window.scrollBy(0,120)");
			Thread.sleep(500); 		
			
			driver.findElement(By.id("timerAlertButton")).click();
			Thread.sleep(20000);
			// Dismiss an alert.
		
			alert.dismiss();
			
			js.executeScript("window.scrollBy(0,120)");
			Thread.sleep(500); 

			driver.findElement(By.id("confirmButton")).click();
			Thread.sleep(2000);
			// Dismiss an alert.
	
			alert.dismiss();

			js.executeScript("window.scrollBy(0,120)");
			Thread.sleep(500); 
			
			driver.findElement(By.id("promptButton")).click();
			Thread.sleep(2000);
			// Dismiss an alert.
			
			alert.dismiss();

		} catch(Exception e){
			System.out.println("Error:"+e.getMessage());
			e.printStackTrace();
		}finally {
			
			driver.close();
		}

	}

}
