package com.pages.sampleImplementation;

import com.pages.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AccountDetailsPage extends BasePage<AccountDetailsPage> {

    //VIEW//
    @FindBy(how = How.XPATH, using = "//p[@class='info-account']")
    public WebElement myAccountDetailsDashboard;

    public AccountDetailsPage() {
        super("/index.php");
    }
}