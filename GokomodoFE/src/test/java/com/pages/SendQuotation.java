package com.pages;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SendQuotation {

    // STEP 1

    //Print Quotation
    @FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/a[1]")
    public WebElement BtnPrintQuo;

    //Submit payments Terms button
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Submit Payment Terms')]")
    public WebElement BtnSubmitpPymTerms;

    //update quotations
    //using manual
    @FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/input[1]")
    public WebElement RdBtnManualQuoSend;

    //Select origin of shipment
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Select Origin of Shipment')]")
    public WebElement BtnOriginOfShipment;

    //Franco Area
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Change Franco Area')]")
    public WebElement BtnFrancoArea;

    //using Excel;
    @FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[2]/div[1]/input[1]")
    public WebElement RdBtnExcelQuoSend;

    //CheckBox quotation
    @FindBy(how = How.XPATH, using = "//tbody/tr[1]/td[1]/label[1]/span[1]")
    public WebElement ChckboxItemQuo;

    //product name
    @FindBy(how = How.XPATH, using = "//tbody/tr[2]/td[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/input[1]") //set value (name)
    public WebElement ProNameTbox;

    //unit cost
    @FindBy(how = How.XPATH, using = "//tbody/tr[2]/td[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/input[1]") //set value (55555)
    public WebElement unitCostTbox;

    //Quantity & UoM

    //Ready stock
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Ready Stock')]")
    public WebElement BtnReadyStock;

    //Stock
    @FindBy(how = How.XPATH, using = "//tbody/tr[2]/td[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")
    public WebElement ReadyStockUnit;

    //Indent
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Indent')]")
    public WebElement BtnIndent;

    //Ready stock Indent
    @FindBy(how = How.XPATH, using = "//tbody/tr[2]/td[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")
    public WebElement RdyStckIndentTbox;

    //Indent Unit
    @FindBy(how = How.XPATH, using = "//tbody/tr[2]/td[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/input[1]")
    public WebElement IndentUnitTbox;

    //Indent Time Estimation
    @FindBy(how = How.XPATH, using = "//tbody/tr[2]/td[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
    public WebElement IndentTimeTbox;


    //Discount button
    @FindBy(how = How.XPATH, using = "//tbody/tr[2]/td[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[2]/div[1]/div[1]/label[1]")
    public WebElement BtnDiscount;

    //Discount Type
    @FindBy(how = How.XPATH, using = "//tbody/tr[2]/td[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/*[1]")
    public WebElement btnDscontType;

    //Notes
    @FindBy(how = How.XPATH, using = "//tbody/tr[2]/td[1]/div[1]/div[1]/div[1]/div[1]/div[11]/div[2]/textarea[1]")
    public WebElement NotesIndentTbox;

    //Attachment
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Add Attachment')]")
    public WebElement BtnAttch;

    //PPN 10%
    @FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]/div[3]/div[1]/div[1]/label[1]/span[1]")
    public WebElement ChckBtnPPN;

    //Upload Attachment Step 4
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Upload Attachments')]")
    public WebElement BtnUploadAttch;

    //Notes
    @FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[2]/div[7]/div[2]/textarea[1]")
    public WebElement notesTboxStep4;

    //button Draft Step 4
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Draft')]")
    public WebElement BtnDraft;

    //Send Quotation
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Send Quotation')]")
    public WebElement BtnSendQuo;

    //public SendQuotation() { super(TestEnvironment.HOME_URL); }


}
