    package FaceGenie;
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Login_Page {

	WebDriver driver;
	Login_Page(WebDriver d){
		driver= d;
		PageFactory.initElements(driver, this);
		

	}
	@FindBy(id="email")
	WebElement username	;
	@FindBy(id="password")
	WebElement password;

	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement Loginbtn;
	
	
//	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div/div/div/div/nav/div[1]/div[2]/span")
//	WebElement Dashb;
	@FindBy(xpath="//*[@id=\\\"root\\\"]/div/div[1]/div/div/div/div/nav/div[2]/div[2]/span")
	WebElement AttndLogs;
	
	
	
	
	public void EnterUsername(String Email ) {
		username.sendKeys(Email);
		
	}
	
	public void GOTO() {
		driver.get("https://facegenie-ams-school.web.app/");
	}
	public void EnterPassword(String pwd ) {
		password.sendKeys(pwd);
		
	}public void ClickOnLoginBtn() throws InterruptedException {
		Loginbtn.click();
		
		
	}
//	public void Dashboard() {
//		Dashb.click();
//	}
	
	public void AttendanceLogs() {
		AttndLogs.click();
	}
	}


	
	
	
	

