package Face_Genie2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Login_Page {

WebDriver driver;

Login_Page(WebDriver d) {
	driver = d;
	
}
By username = By.id("email");
By password = By.id("password");
By loginBtn=By.xpath("//button[@type=\"submit\"]");

By Dash=By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div/nav/div[1]/div[2]/span");

By Attndc=By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div/nav/div[2]");
By Analtk =By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div/nav/div[3]/div[2]/span");

By ManSt=By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div/nav/div[4]/div[2]/span");
By Manlic=By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div/nav/div[5]");
By ManSyc=By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div/nav/div[6]/div[2]/span");
By Settng =By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div/nav/div[7]/div[2]/span");
By Logout=By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div/nav/div[8]/div[2]/span");
By Pop= By.xpath("/html/body/div[2]/div[3]/div/div/div/button[2]");

public void TitleValidation() {
	
	String ACTTL =driver.getTitle();
	System.out.println(ACTTL);
	System.out.println("Title Validation Is Done ");
	
	
}

public void EnterUsername(String uname) {
	driver.findElement(username).sendKeys(uname);
	
}
public void Enterpassword(String pwd) {
	driver.findElement(password).sendKeys(pwd);
	
}
public void ClickOnLoginBtn() {
	driver.findElement(loginBtn).click();
	
}
public void Dashboard() {
	driver.findElement(Dash).click();
	System.out.println(" Dashboard is Clickable");
}
public void AttendanceLogs() {
	driver.findElement(Attndc).click();
	System.out.println(" Attendance Logs is Clickable");
}
public void AnalyticReport(){
	driver.findElement(Analtk).click();
	System.out.println("Analytics and Report is Clickable");
}
public void ManageStudent() {
	driver.findElement(ManSt).click();
	System.out.println("Manage Student is Clickable");
}
public void ManaageLicenses() {
	driver.findElement(Manlic).click();
	System.out.println("Manage Licenses is Clickable");
}
public void ManaageSync() {
	driver.findElement(ManSyc).click();
	System.out.println("Manage Syc  is Clickable");
}

public void Settings() {
	driver.findElement(Settng).click();
	System.out.println("Setting is Clickable");
}
public void Logout() {
	driver.findElement(Logout).click();
	System.out.println("Logout is Clickable");
	
}
public void PoppupHandle() {
	driver.findElement(Pop).click();
	System.out.println("Logout is Successfully");
}
}

