package com.steps;

import com.buildSettings.ContextInjection;
import com.buildSettings.TestCommons;
import com.buildSettings.TestEnvironment;
import com.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Step;
import org.testng.Assert;

public class LoginStep extends TestEnvironment {

    private LoginPage loginPage = new LoginPage().get();
    private TestCommons testCommons = new TestCommons();

    @Step("As a buyer already on gokomodo page")
    @Given("As a buyer already on gokomodo page")
    public void asABuyerAlreadyOnGokomodoPage() {

        Assert.assertTrue(testCommons.isElementVisible(loginPage.labelCorporate),
                String.format(ContextInjection.VIEW_ERROR, "Masuk"));


    }
    @Step("As a buyer input *{0}*")
    @When("As a buyer input {string}")
    public void asABuyerInputEmail(String Email) throws Throwable {
        testCommons.customSendKeys(loginPage.EmailTextBox, Email);
        logger.info(String.format("User email: \"%S\"", Email));
//        Assert.assertEquals(loginPage.EmailTextBox.getAttribute("value"));

    }
    @Step("buyer input *{0}*")
    @And("buyer input {string}")
    public void buyerInputPassword(String Password) throws Throwable {
        testCommons.customSendKeys(loginPage.Password, Password);
        logger.info(String.format("User password: \"%S\"", Password));

    }
    @Step("buyer click login button")
    @And("buyer click login button")
    public void buyerClickLoginButton() {
        testCommons.customClick(loginPage.BtnMasuk);
    }
    @Step("As a user should be redirect to main gokomodo page")
    @Then("As a user should be redirect to main gokomodo page")
    public void asAUserShouldBeRedirectToMainGokomodoPage() {
        Assert.assertTrue(testCommons.isElementVisible(loginPage.labelWelcome),
                String.format(ContextInjection.VIEW_ERROR, "PT La Nausee"));


    }
}
