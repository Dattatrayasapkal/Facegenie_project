import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://facegenie-ams-school.web.app/dashboard/home");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("testbams@gmail.com");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("facegenie");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(25000);

//		driver.findElement(By.xpath("//div/span[contains(text(),'Attendance Logs')]")).click();
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div/nav/div[2]/div[2]/span")).click();
//		WebElement In =driver.findElement(By.xpath("//div[@role=\"button\"][2]"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;  
//		js.executeScript("arguments[0].click();", In);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div/nav/div[4]/div[2]/span")).click();

		
	}
	
}
