package project.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project.pages.HomePage;
import project.utilities.ConfigReader;
import project.utilities.Driver;

public class us06_House_Details_stepDefs {
    HomePage homePage=new HomePage();
    @Given("user go to home page")
    public void user_go_to_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @Then("user clicks on search button")
    public void user_clicks_on_search_button() {


    }
    @Then("user clicks property type dropdown menu")
    public void user_clicks_property_type_dropdown_menu() {

    }
    @When("user selects the house\\/ apartment checkbox")
    public void user_selects_the_house_apartment_checkbox() {

    }
    @Then("user clicks the apply button")
    public void user_clicks_the_apply_button() {

    }
    @Then("user verify the house price is visible")
    public void user_verify_the_house_price_is_visible() {

    }
    @When("user clicks the house name")
    public void user_clicks_the_house_name() {

    }
    @Then("user clicks the info button")
    public void user_clicks_the_info_button() {

    }
    @Then("verify top amenities is visible")
    public void verify_top_amenities_is_visible() {

    }


}