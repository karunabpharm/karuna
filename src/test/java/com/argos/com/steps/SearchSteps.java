package com.argos.com.steps;

import com.argos.com.page_objects.Locators;
import com.argos.com.drivers.BroserLaunch;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SearchSteps {
    BroserLaunch broserLaunch = new BroserLaunch();
    Locators locators = new Locators();



    @When("^I enter the product \"([^\"]*)\"$")
    public void i_enter_the_product(String products) {
        locators.enterSearchbox(products);
        locators.clickSearchbox();

    }

    @Then("^I should see respective product$")
    public void i_should_see_respective_product() {
     String actual= locators.getTextOnSerchPage();
     Assert.assertEquals("Nike",actual);
    }

    public void Item_Added_Sucessfully() {
        String actual = locators.ItemAddedSucessfully();
        String expected = locators.ItemAddedSucessfully();
        Assert.assertEquals(expected, actual);
    }
}
