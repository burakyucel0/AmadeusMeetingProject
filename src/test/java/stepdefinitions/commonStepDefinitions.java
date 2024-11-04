package stepdefinitions;

import drivers.DriverFactory;
import io.cucumber.java.en.Given;


public class commonStepDefinitions {

    @Given("I go to homepage Url")
    public void iGoToHomepageUrl() {
        String homePageUrl = "https://demoqa.com/";
        DriverFactory.navigateToUrl(homePageUrl);
    }




}
