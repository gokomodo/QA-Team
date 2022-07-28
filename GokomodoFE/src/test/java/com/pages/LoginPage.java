package com.pages;

import com.buildSettings.TestEnvironment;
import com.pages.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage<LoginPage> {

    @FindBy(how = How.XPATH,using = "//h2[contains(text(),'Masuk')]")
    public WebElement labelCorporate;
    @FindBy (how = How.XPATH, using = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")
    public WebElement EmailTextBox;

    @FindBy (how =How.XPATH, using = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]")
    public WebElement Password ;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Masuk')]")
    public WebElement BtnMasuk;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'PT La Nausee')]")
    public WebElement labelWelcome;


    public LoginPage (){
        super (TestEnvironment.HOME_URL);
    }

}
