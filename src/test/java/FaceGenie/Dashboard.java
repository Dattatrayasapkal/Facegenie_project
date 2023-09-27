package FaceGenie;
import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {

	WebDriver driver;
	public Dashboard(WebDriver d){
		driver= d;
		PageFactory.initElements(driver, this);	
	
	}
	@FindBy(xpath= "//*[@id=\\\"root\\\"]/div/div[1]/div/div/div/div/nav/div[2]/div[2]/span")
	WebElement Dashboard;
	//@FindBy(xpath="//span[@class=\"MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-znl8sb\"]")
	//WebElement AttndLogs;
	//@FindBy(xpath="//button[@type=\"button\"]")
	//WebElement SMbutton;
	
	
	public void DashboardValidation () {
	Dashboard.click();

		
	//public void ManageStudent() {
		
		//SMbutton.click();
	//}
	}}


	
	
	
	



