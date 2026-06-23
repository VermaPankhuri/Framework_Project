
package hooks;

import java.op.ByteArrayInputStream;

public class ScenarioHook extends Base {

    RemoteWebDriver remoteDriver;

    @BeforeMethod
    public void setup() {

        try {

            String browser = this.getBrowser();

            if(browser.equalsIgnoreCase("chrome")) {

                ChromeOptions options = new ChromeOptions();
                options.setCapability("platformName", "Windows");

                remoteDriver = new RemoteWebDriver(
                        new URL("http://localhost:4444"),
                        options);
            }

            else if(browser.equalsIgnoreCase("edge")) {

                EdgeOptions options = new EdgeOptions();
                options.setCapability("platformName", "Windows");

                remoteDriver = new RemoteWebDriver(
                        new URL("http://localhost:4444"),
                        options);
            }

            setDriver(remoteDriver);

            getDriver().manage().window().maximize();
            getDriver().manage().timeouts()
                    .implicitlyWait(Duration.ofSeconds(10));

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

   @After
public void tearDown(Scenario scenario)
{
        if(!scenario.isFailed()) {

            byte[] screenshot =
                    ((TakesScreenshot)getDriver())
                    .getScreenshotAs(OutputType.BYTES);

            Allure.addAttachment(
                    "Failure Screenshot",
                    new ByteArrayInputStream(screenshot));
        };

    } 
            getDriver().quit();
        }
    

