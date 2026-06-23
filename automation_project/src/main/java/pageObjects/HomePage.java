package pageObjects;

public class HomePage {
    WebDriver driver ;
    By flightsBtn =
        By.xpath("//button[contains(text(),'Flights')]");
         By flyingFromInput =
 By sourceCity =
        By.xpath("//input[@placeholder='Flying from']");
 By destinationCity =
        By.xpath("//input[@placeholder='Flying to']");
 By departureDate =
        By.xpath("//div[contains(@data-selenium,'flight-departure')]");
By dateSelection =
        By.xpath("(//span[contains(@class,'DayPicker-Day')])[20]");

By searchFlightsBtn =
        By.xpath("//button[contains(.,'SEARCH FLIGHTS')]");

}
public By getFlightsBtn() {
    return flightsBtn;
}

public By getSourceCity() {
    return sourceCity;
}

public By getDestinationCity() {
    return destinationCity;
}

public By getDepartureDate() {
    return departureDate;
}

public By getDateSelection() {
    return dateSelection;
}

public By getSearchFlightsBtn() {
    return searchFlightsBtn;
}
