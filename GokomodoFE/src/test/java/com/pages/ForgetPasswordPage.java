package com.pages;

import com.buildSettings.TestEnvironment;
import com.pages.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ForgetPasswordPage extends BasePage<ForgetPasswordPage> {

    @FindBy(how = How.XPATH,using = "//h2[contains(text(),'Masuk')]")
    public WebElement labelCorporate;

    @FindBy (how = How.XPATH, using = "//a[contains(text(),'Lupa Password?')]")
    public WebElement LinktextForgetPassword;

    @FindBy (how = How.ID, using = "email-forgot-password") //input[@data-cy="email"]
    public WebElement EmailForgetPossword;

    @FindBy (how = How.XPATH, using = "//button[contains(text(),'Atur Ulang Kata Sandi')]")
    public WebElement BtnAturUlangKataSandi;

    @FindBy (how = How.XPATH, using = "//a[contains(text(),'Kembali ke Halaman Masuk')]")
    public WebElement BtnCekEmailAnda;


    public ForgetPasswordPage () { super(TestEnvironment.HOME_URL);
    }
}
