package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateQuotation {

    //Step 1 Seller side

    //Button notif
    @FindBy(how = How.XPATH, using = "//header/div[1]/nav[1]/div[2]/li[2]/a[1]/*[1]")
    public WebElement BtnNotif;

    //inquiry button
    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Inquiry')]")
    public WebElement BtnInquiry;

    //Quotation iinquiry
    @FindBy(how = How.XPATH, using = "//tbody/tr[1])")
    public WebElement BtnQuo;

    //create quotation button
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Create Quotation')]")
    public WebElement BtnCreQuo;

    //pop up button Quo
    @FindBy(how = How.XPATH, using = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[2]")
    public WebElement btnQuoPopUp;

    //do to page send quotation

    //public CreateQuotation() { super(TestEnvironment.HOME_URL); }


}
