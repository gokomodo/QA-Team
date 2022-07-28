package com.steps;

import com.buildSettings.ContextInjection;
import com.buildSettings.TestCommons;
import com.buildSettings.TestEnvironment;
import com.pages.ForgetPasswordPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class ForgotPasswordSteps extends TestEnvironment {
    private ForgetPasswordPage forgetPasswordPage = new ForgetPasswordPage().get();
    private TestCommons testCommons = new TestCommons();


    @Given("As a buyer already on login gokomodo page")
    public void asABuyerAlreadyOnLoginGokomodoPage() {
        Assert.assertTrue(testCommons.isElementVisible(forgetPasswordPage.labelCorporate),
                String.format(ContextInjection.VIEW_ERROR, "Masuk"));
    }

    @When("As a buyer click forget password lint text")
    public void asABuyerClickForgetPasswordLintText() throws InterruptedException {
        testCommons.customClick(forgetPasswordPage.LinktextForgetPassword);
        testCommons.sleep(5);

    }

    @And("As a buyer input {string} on text field")
    public void asABuyerInputEmailOnTextField(String email2) {
        testCommons.customSendKeys(forgetPasswordPage.EmailForgetPossword, email2);
        logger.info(String.format("User email: \"%S\"", email2));
    }



    //public void asABuyerInputEmailOnTextField() throws InterruptedException {
    //     forgetPasswordPage.EmailForgetPossword.sendKeys("nausee1@mail.com");
    //     testCommons.sleep(5);

    @And("As a buyer click Atur ulang kata sandi button")
    public void asABuyerClickAturUlangKataSandiButton() throws InterruptedException {
        testCommons.customClick(forgetPasswordPage.BtnAturUlangKataSandi);
        testCommons.sleep(5);
    }

    @Then("As a buyer should be redirect to cek email anda page")
    public void asABuyerShouldBeRedirectToCekEmailAndaPage() {
        Assert.assertTrue(testCommons.isElementVisible(forgetPasswordPage.BtnCekEmailAnda),
                String.format(ContextInjection.VIEW_ERROR, "Cek Email Anda!"));

    }


}
