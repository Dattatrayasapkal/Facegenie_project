package FaceGenie;
import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		

		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		Login_Page pg = new Login_Page(driver);
		
		//driver.get("https://facegenie-ams-school.web.app/");
		
		pg.GOTO();

		pg.EnterUsername("testbams@gmail.com");
		
		pg.EnterPassword("facegenie");
		
		pg.ClickOnLoginBtn();      
		Thread.sleep(25000);

		//pg.Dashboard();
		
		
		pg.AttendanceLogs();

//		
//		System.out.println("Login Successfully is validates");
//		String ExpectedTTL= "Rai-Kpsr-Bams";
//		String  ActualTTL =driver.getTitle();
//
//		System.out.println(ActualTTL);
		
//		Dashboard Dash = new Dashboard(driver);
//		Dash.DashboardValidation();
		//Dash.ManageStudent();
		
		//driver.close();
		
		
	}

}
