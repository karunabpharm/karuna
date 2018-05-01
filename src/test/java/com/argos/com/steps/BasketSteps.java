package com.argos.com.steps;

import com.argos.com.page_objects.Locators;
import com.argos.com.drivers.BroserLaunch;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class BasketSteps {
    Locators locators = new Locators();

    @When("^I select any product$")
    public void iSelectAnyProduct() {
        locators.selectAProduct();
    }

    @And("^I go to trolley$")
    public void iGoToTrolley() {
        locators.GotoTrolley();
    }

    @And("^I add product to trolley$")
    public void iAddProductToTrolley() {
        locators.addProductToTrolle();
    }

    @Then("^It should be added to the basket$")
    public void itShouldBeAddedToTheBasket() {
        String expected = Locators.productName;
        String actual = locators.getProductInBasket();
        Assert.assertEquals(expected, actual);
    }
}
