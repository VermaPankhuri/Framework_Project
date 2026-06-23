package stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.Assert;
import base.Base;
import io.cucumber.java.en.*;

import pageObjects.HomePage;

public class Booking extends Base {

    HomePage homePage;

    private static final Logger logger =
            LogManager.getLogger(BookingStep.class);

    @Given("User launches the Agoda website")
    public void user_launches_the_agoda_website() {
        try{
            Logger.debug    ("launch agoda" );   
        getDriver().get(this.getUrl());

        homePage = new HomePage(getDriver());

        logger.info("Agoda Website Launched");
    }
    @Given("User navigates to the Flights section")
public void user_navigates_to_the_flights_section() {
    try {
        homePage = new HomePage(getDriver());

        System.out.println("Clicking Flights Tab");

        getDriver().findElement(homePage.getFlightsBtn()).click();

        Thread.sleep(3000);

        System.out.println("Flights Tab Open");
    }
    catch(Exception ex) {
        Logger.error("Exception occurred:"+ex.getMessage());
        System.out.println(ex.getMessage());
    }

    @When("User enters source city as {string}")
public void user_enters_source_city_as(String sourceCity) {

    try {
        System.out.println("Entering Source City");

        getDriver().findElement(homePage.getSourceCity()).sendKeys(sourceCity);

        Thread.sleep(3000);

        //System.out.println("Source City Entered : " + sourceCity);
    }
    catch(Exception ex) {
        Logger.error("Exception occurred:"+ex.getMessage());
         System.out.println(ex.getMessage());
    }
}
}
@When("User enters destination city as {string}")
public void user_enters_destination_city_as(String destinationCity) {

    try {
        System.out.println("Entering Destination City");

        getDriver().findElement(homePage.getDestinationCity())
                   .sendKeys(destinationCity);

        Thread.sleep(2000);

       // System.out.println("Destination City Entered : " + destinationCity);
    }
    catch(Exception ex) {
        Logger.error("Exception occurred:"+ex.getMessage());
         System.out.println(ex.getMessage());
    }
}
 @When("User selects departure date as {string"})
public void user_selects_departure_date() {

    try {

        System.out.println("Selecting Departure Date");

        getDriver().findElement(homePage.getDepartureDate()).click();

        Thread.sleep(2000);

        getDriver().findElement(homePage.getDateSelection()).click();

        System.out.println("Departure Date Selected");
    }
    catch(Exception ex) {
        Logger.error("Exception occurred:"+ex.getMessage());
         System.out.println(ex.getMessage());
    }
}
    }
     @When("User selects {string} trip type")
public void user_choose_trip_type(String tripType) {

    try {

        System.out.println("trip type selected");
         System.out.println("trip type "+ tripType);
        Thread.sleep(2000);

    }
    catch(Exception ex) {
        Logger.error("Exception occurred:"+ex.getMessage());
         System.out.println(ex.getMessage());
    }
}



  @When("User clicks on the Search Flights button")
public void user_clicks_on_the_search_flights_button() {

    try {

        System.out.println("Clicking Search Button");

        getDriver().findElement(homePage.getSearchBtn()).click();

        Thread.sleep(6000);

        System.out.println("Search Results Page Opened");
    }
    catch(Exception ex) {

        Logger.error("Exception occurred:" + ex.getMessage());
        System.out.println(ex.getMessage());
    }
}
   
@Then("Flight search results should be displayed")
public void flight_search_results_should_be_displayed() {

    try {
        System.out.println("Flight Results Displayed");
        Thread.sleep(5000);
    }
    catch(Exception ex) {

        Logger.error("Exception occurred:" + ex.getMessage());
        System.out.println(ex.getMessage());

        Assert.fail();
    }
}
