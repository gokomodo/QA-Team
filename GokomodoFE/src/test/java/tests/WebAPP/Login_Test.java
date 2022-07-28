package tests.WebAPP;


import com.buildListeners.TestNGListener;
import com.steps.LoginStep;
import com.steps.hooks.WEB_Hooks;
import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Epic("Web App Tests")
@Feature("LOGIN TESTS")
@Listeners({TestNGListener.class})
public class Login_Test extends WEB_Hooks{
    @Story("POSITIVE FLOW")
    @Owner("Iwan")
    @Description("[ As a buyer want to login gokomodo page")
    @Test(description = " As a buyer want to login gokomodo page")
    public void test_1() throws Throwable {
        //ARRANGE//
        final LoginStep loginStep = new LoginStep();
      //  final RegistrationPageSteps registrationPageSteps = new RegistrationPageSteps(new ContextInjection());


        //ACT//
        loginStep.asABuyerAlreadyOnGokomodoPage();
        loginStep.asABuyerInputEmail("nausee1@mail.com");
        loginStep.buyerInputPassword("Kodomo10");
        loginStep.buyerClickLoginButton();
//        mainPageSteps.iCanSeeAutomationpracticeComWebsite();
//        registrationPageSteps.iClickOnSignInButton();
//        registrationPageSteps.iCanSeeRegistrationPageForm();
//        registrationPageSteps.iWriteAnEmailAddress();
//        registrationPageSteps.iClickOnCreateAnAccountButton();

        //ASSERT//
        loginStep.asAUserShouldBeRedirectToMainGokomodoPage();
    }
}
