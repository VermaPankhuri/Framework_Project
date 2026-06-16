package stepDefinations;

import org.testng.Assert;

import base.Base;
import io.cucumber.java.en.*;
import pageObjects.LoginPage;
import pageObjects.PriceFilterPage;

public class A_LoginStep extends Base{
	LoginPage loginPage;
	PriceFilterPage priceFilterPage;
	@Given("User is on home screen")
	public void user_is_on_home_screen() {
	    try {
	    	getDriver().get(this.getUrl());
	    	getDriver().manage().window().maximize();
	    }catch(Exception ex) {
	    	
	    }
	}
	
	@When("clicks login")
	public void clicks_login() {
	    try {
	    	loginPage = new LoginPage(getDriver());
	    	loginPage.getSignUpAndInBtn().click();
	    	loginPage.getSignInBtn().click();
	    }
	    catch(Exception ex) {
	    	
	    }
	}

	@When("user enters {string} as email and {string} as password")
	public void user_enters_email_and_password(String email, String password) {
	    try {
	    	loginPage.getEmail().sendKeys(email);
	    	loginPage.getPassword().sendKeys(password);
	    	Thread.sleep(3000);
	    } catch(Exception ex) {
	    	
	    }
	}

	@Then("user is successfully logged in")
	public void user_is_successfully_logged_in() {
	    try {
	    	loginPage.getSubmitBtn().click();
	    Assert.assertTrue(loginPage.getLoginText().getText().contains("Hi"),"Login Failure");
	    }catch(Exception ex) {
	    	
	    }
	}

}
