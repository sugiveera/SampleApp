package assignment2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Table {
    public static void main (String[] args) {
    	//TODO Auto-generated method stub
    	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sugiv\\Downloads\\Mydriver\\chromedriver-win64\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://demoqa.com/webtables");
		driver.findElement(By.id("addNewRecordButton")).click();
		
		driver.findElement(By.id("firstName")).sendKeys("Nancy");
		driver.findElement(By.id("lastName")).sendKeys("william");
		driver.findElement(By.id("userEmail")).sendKeys("nancy@yahoo.com");
		driver.findElement(By.id("age")).sendKeys("25");
		driver.findElement(By.id("salary")).sendKeys("100000");
		driver.findElement(By.id("department")).sendKeys("Tester");
		driver.findElement(By.id("submit")).click();
		driver.manage().window().maximize();
    }
}
