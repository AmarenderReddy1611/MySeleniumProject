package com.qa.banking.Pages;

import com.qa.banking.Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.awt.*;

public class HomePage extends TestBase {
    @FindBy(xpath = "//a[text()='Open New Account']")
    WebElement OpenNewAccountLink;

    @FindBy(xpath = "//a[text()='home']")
    WebElement HomebuttonLink;

    @FindBy(xpath = "//a[text()='Accounts Overview']")
    WebElement AccountsOverviewLink;

    @FindBy(xpath = "//a[text()='Transfer Funds']")
    WebElement TransferFundsLink;

    @FindBy(xpath = "//a[text()='Bill Pay']")
    WebElement BillPayLink;

    @FindBy(xpath = "//a[text()='Find Transactions']")
    WebElement FindTransactionsLink;

    @FindBy(xpath = "//a[text()='Update Contact Info']")
    WebElement UpdateContactInfoLink;
    @FindBy(xpath = "//a[text()='Request Loan']")
    WebElement RequestLoanLink;
    @FindBy(xpath = "//a[text()='Log Out']")
    WebElement LogOutLink;
    @FindBy(xpath = "//li[text()='ATM Services']")
    WebElement ATMservicesList;
    @FindBy(xpath="//h1[contains(text(),'Welcome')]")
    WebElement headerwithUserName;


    //initializing the page objects

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public String validateHomePage() {
        return driver.getTitle();

    }
//    public boolean verifynewUser(){
//        String usernamecreated = headerwithUserName.getText();
//        if(usernamecreated.contains(prop.getProperty("un1"))){
//            System.out.println("User is created successfully");
//            return true;
//
//        }else{
//            return false;
//        }
//    }

    public OpenNewAccountPage clickOnOpenNewAccount() {
        OpenNewAccountLink.click();
        return new OpenNewAccountPage();

    }

    public void VerifyATMServices() {
        HomebuttonLink.click();
        ATMservicesList.isDisplayed();

    }

    public UpdateContactInfo updateContactInfoCheck() {
        if (UpdateContactInfoLink.isDisplayed() == true) {
            UpdateContactInfoLink.click();


        }
        return new UpdateContactInfo();
    }
    public void verifyAccountsOverviewPage(){
        AccountsOverviewLink.click();

    }


}
