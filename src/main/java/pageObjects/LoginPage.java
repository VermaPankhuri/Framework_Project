package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	static WebDriver driver;
	By signUpAndInBtn = By.xpath("//*[text()='Sign In / Sign Up']");
	By signInBtn = By.xpath("//*[text()='Login']");
	By email = By.id("input-Email");
	By password = By.id("input-Password");
	By submitBtn = By.xpath("//*[@type= 'submit']");
	By loginText = By.xpath("//div[@class='relative'])[3]");
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getSignUpAndInBtn() {
		return driver.findElement(signUpAndInBtn);
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public static void setDriver(WebDriver driver) {
		LoginPage.driver = driver;
	}
	public void setEmail(By email) {
		this.email = email;
	}
	public void setPassword(By password) {
		this.password = password;
	}
	public WebElement getSignInBtn() {
		return driver.findElement(this.signInBtn);
	}
	
	public WebElement getEmail() {
		return driver.findElement(this.email);
	}
	public WebElement getPassword() {
		// TODO Auto-generated method stub
		return driver.findElement(password);
	}
	public WebElement getSubmitBtn() {
		// TODO Auto-generated method stub
		return driver.findElement(submitBtn);
	}
	public WebElement getLoginText() {
		// TODO Auto-generated method stub
		return driver.findElement(loginText);
	}
	
}
