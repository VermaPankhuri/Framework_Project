package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
//java -jar src/main/resources/selenium-server-4.44.0.jar standalone
import org.openqa.selenium.chrome.*;
import java.io.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.time.Duration;

import base.Base;
import io.cucumber.java.*;
import io.qameta.allure.Allure;

public class ScenarioHook extends Base {
//	WebDriver driver;
	RemoteWebDriver remoteDriver;
	@Before
	public void setup() {
		try {
			String browser = this.getBrowser();
			if(browser.equals("chrome")) {
//				driver = new ChromeDriver();
				ChromeOptions options = new ChromeOptions();
				options.setCapability("platformName","Windows");
				
				remoteDriver = new RemoteWebDriver( new URL("http://localhost:4444"),options);
			}
			else if(browser.equals("edge")) {
//				driver = new EdgeDriver();
				EdgeOptions options = new EdgeOptions();
				options.setCapability("platformName","Windows");
				
				remoteDriver = new RemoteWebDriver( new URL("http://localhost:4444"),options);
			}
			setDriver(remoteDriver);
			getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	@After
	public void tearDown(Scenario scenario)  {
		System.out.println("Driver = "+getDriver());
		if(!scenario.isFailed() && getDriver()!=null) {
			byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
			
			Allure.addAttachment("Screenshot","image/png",new ByteArrayInputStream(screenshot),".png"
					);
		}
		
		
		if(getDriver()!=null) {
			getDriver().quit();
		}
	}

}
