package Face_Genie2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass  {
    public static void main(String[] args) throws InterruptedException  {

    WebDriverManager.chromedriver().setup();
    
	WebDriver driver = new ChromeDriver();
	
	Login_Page Loginpg =new Login_Page(driver);
	
	driver.get("https://facegenie-ams-school.web.app/dashboard/home");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	Loginpg.TitleValidation();
	Loginpg.EnterUsername("testbams@gmail.com");
	Loginpg.Enterpassword("facegenie");
	Loginpg.ClickOnLoginBtn();
	Thread.sleep(50000);
	Loginpg.Dashboard();
	Thread.sleep(10000);
	Loginpg.AttendanceLogs();
	Thread.sleep(10000);
	Loginpg.ManageStudent();
	Thread.sleep(10000);
	Loginpg.ManaageLicenses();
	Thread.sleep(10000);
	Loginpg.ManaageSync();
	Thread.sleep(10000);
	Loginpg.AnalyticReport();
	Thread.sleep(10000);
	Loginpg.Settings();
	Thread.sleep(10000);
	Loginpg.Logout();
	Loginpg.PoppupHandle();
    driver.close();
	
	}

}
