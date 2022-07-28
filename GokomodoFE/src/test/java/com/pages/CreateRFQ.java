package com.pages;

import com.buildSettings.TestEnvironment;
import com.pages.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.XpiDriverService;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateRFQ {

    // STEP 1
    //Button create New
    @FindBy(how = How.XPATH, using ="//button[contains(text(),'Create new')]")
    public WebElement createNew;

    //Dropdown list Create RFQ
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'RFQ')]")
    public WebElement createRFQ;

    //Subject Title Quotation
    @FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]")
    public WebElement subjectTitle;

    //Choose Category
    @FindBy(how = How.ID, using = "react-select-3-input")
    public WebElement categoryQuo;

    //Choose SUB category
    @FindBy(how = How.ID, using = "react-select-5-input")
    public WebElement subCategoryQuo;

    //Choose Checkbox Category
    @FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/label[1]/span[1]")
    public WebElement checkboxCategory;

    //Additional Category 1
    @FindBy(how = How.ID, using = "react-select-10-input")
    public WebElement addAdditionalCat1;

    //Checkbox Additional Subcategory 1
    @FindBy(how = How.ID, using = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/label[1]/span[1]")
    public WebElement CheckAddSubCategory1;

    //Additional Category 2
    @FindBy(how = How.ID, using = "react-select-11-input")
    public WebElement addAdditionalCat2;

    //Checkbox Additional Subcategory 2
    @FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/label[1]/span[1]")
    public WebElement CheckAddSubCategory2;

    //Department List Down
    @FindBy(how = How.ID, using = "react-select-4-input")  //Set value (team 7)
    public WebElement listDownDepartment;

    //Choose Priority
    @FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[3]/div[1]/div[1]/div[4]/div[2]/label[1]/input[1]")
    public WebElement PriorUrgent;

    //save as draft page RFQ Information
    @FindBy(how = How.XPATH, using = "/button[contains(text(),'Save as Draft')]")
    public WebElement saveAsDraft;

    //button next product and deliveries
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Next: Products and Deliveries')]")
    public WebElement btnNextToPage2;

    //STEP 2
    //Delivery Method delivery
    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Delivered')]")
    public WebElement deliMethod;

    //product and deliveried list
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Add products and deliveries')]")
    public WebElement proDelList;

    //PAGE product and delivered list
    // Delivery label
    @FindBy(how = How.XPATH, using = "//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/input[1]")
    public WebElement Deliverylb;

    //save address Radio button
    @FindBy(how = How.XPATH, using = "//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/input[1]")
    public WebElement saveAddressbtn;

    //company list
    @FindBy(how = How.ID, using = "react-select-41-input") // set value (PT La Nausee)
    public WebElement listCompanyAdd;

    //company location
    @FindBy(how = How.ID, using = "react-select-42-input") // set value (HQ 1)
    public WebElement compLocId;

    //Product
    //upload File Excel
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Upload File')]")
    public WebElement BtnUploadXls;

    //PR ID textbox
    @FindBy(how = How.XPATH, using = "//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]")
    public WebElement PRidTbox;

    //Add Product manual
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Add Product')]")
    public WebElement BtnAddProManual;

    //pop up session Add New Product manual
    //Product name
    @FindBy(how = How.XPATH, using = "//body/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
    public WebElement ManualProNameTbox;

    //brand name
    @FindBy(how = How.XPATH, using = "//body/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input[1]")
    public WebElement ManualBrandTbox;

    //Quantity
    @FindBy(how = How.XPATH, using = "//body/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/input[1]")
    public WebElement QuantityTbox;

    //UoM textbox
    @FindBy(how = How.XPATH, using = "//body/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")
    public WebElement UoMTbox;

    //UoM Dropdown list
    @FindBy(how = How.XPATH, using = "//body/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/*[1]")
    public WebElement UoMDropdown;

    //no material SKU
    @FindBy(how = How.XPATH, using = "//body/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/input[1]")
    public WebElement MaterialSKUTbox;

    //Notes
    @FindBy(how = How.XPATH, using = "//body/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/input[1]")
    public WebElement notesAddproductManual;

    //add attachment
    @FindBy(how = How.XPATH, using = "//body/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/div[1]/div[2]/div[2]/div[1]/button[1]")  //set value (png, doc, img, pdf)
    public WebElement BtnaddAttachManual;

    //PR ID reference

    //Subsidiary dropdown list
    @FindBy(how = How.XPATH, using = "//body/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[8]/div[1]/div[1]/div[1]/div[2]/div[1]/*[1]")
    public WebElement SubsidiaryDropdown;

    //save button Add manual
    @FindBy(how = How.XPATH, using = "//body/div[4]/div[1]/div[1]/div[1]/div[1]/div[3]/button[2]")
    public WebElement BtnsaveManualAdd;


    //PR ID dropDown list
    @FindBy(how = How.XPATH, using = "//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]")
    public WebElement PRIDropDown;

    //Save Add new product
    @FindBy(how = How.XPATH, using = "//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/button[2]")
    public WebElement btnNewProduct;


    //Request for quotation
    //Submission Deadline
    @FindBy(how = How.XPATH, using = "//input[@id='rfqForm-dateDeadline']")
    public WebElement sbmDeadlineTbox;

    //Submission Time
    @FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
    public WebElement sbmTime;

    //expected delivery start
    @FindBy(how = How.XPATH, using = "//input[@id='rfqForm-startDeadline']") //set value (date)
    public WebElement staryDlvTbox;

    //expected delivery end
    @FindBy(how = How.XPATH, using = "//input[@id='rfqForm-endDeadline']") //set value (date)
    public WebElement endDlvTbox;

    //terms of payment
    @FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[1]") //set value (10 days after payment)
    public WebElement termPymTbox;

    //term of payment popup
    //

    //notes
    @FindBy(how = How.XPATH, using = "//textarea[contains(text())]")
    public WebElement notesProTbox;

    //Add attachment button
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Add Attachment')]")
    public WebElement BtnaddAttach;

    //next vendor session button
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Next: Vendor Selection')]")
    public WebElement BtnVndrSession;


    //STEP 3
    //Vendor selection

    //Vendor type
    //all vendor
    @FindBy(how = How.XPATH, using = "//label[contains(text(),'All Vendor')]")
    public WebElement RdBtnAllVendor;

    //Verified Vendor
    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Verified Vendor')]")
    public WebElement RdBtnVerifVendor;

    //Area served
    //input area served TextBox
    @FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[3]/div[2]/div[1]/div[2]/input[1]")
    public WebElement inpAreaServedTbox;

    //Checkbox area
    @FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[3]/div[2]/div[2]/div[1]/label[1]/span[1]")
    public WebElement ChkBoxArea;

    //Vendor Vendor search
    //Gokomodo Search (auto)
    @FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[3]/div[2]/div[2]/div[1]/label[1]/span[1]")
    public WebElement RdBtnVendorAuto;

    //Gokomodo manual search
    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Manual Search')]")
    public WebElement RdBtnVendorManual;

    //Search vendor Input name Box
    @FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[3]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")
    public WebElement InptVendornameBox;

    //Checkbox all vendors
    @FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[3]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/label[1]/span[1]")
    public WebElement ChkBoxAllVendors;

    //button Next: Summary
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Next: Summary')]")
    public WebElement Btnsummary;

    //STEP 4
    //summary

    //summary Button
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Next: Submit RFQ')]")
    public WebElement BtnSubmitRFQ;

    //save as draft
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Save as Draft')]")
    public WebElement draftBtnSummary;

    //public CreateRFQ() { super(TestEnvironment.HOME_URL); }


}
