package com.qa.banking.Pages;

import com.qa.banking.Base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends TestBase {
    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[text()='Signing up is easy!']")
    WebElement registrationPageHeading;
    @FindBy(xpath = "//input[@id='customer.firstName']")
    WebElement firstName;
    @FindBy(xpath = "//input[@id='customer.lastName']")
    WebElement lastName;
    @FindBy(xpath = "//input[@id='customer.address.street']")
    WebElement address;
    @FindBy(xpath = "//input[@id='customer.address.city']")
    WebElement City;
    @FindBy(xpath = "//input[@id='customer.address.state']")
    WebElement state;
    @FindBy(xpath = "//input[@id='customer.address.zipCode']")
    WebElement zipCode;
    @FindBy(xpath = "//input[@id='customer.phoneNumber']")
    WebElement phoneNumber;
    @FindBy(xpath = "//input[@id='customer.ssn']")
    WebElement ssn;
    @FindBy(xpath = "//input[@id='customer.username']")
    WebElement customerUsername;
    @FindBy(xpath = "//input[@id='customer.password']")
    WebElement customerPassword;
    @FindBy(xpath = "//input[@id='repeatedPassword']")
    WebElement ConfirmPassword;
    @FindBy(xpath = "//input[@type='submit']")
    WebElement registerButton;


    public void newUserRegistration(String fn, String ln, String Address, String city, String zipcode,
                                    String State, String Ssn, String phonenumber, String customerusername, String password) {

        firstName.sendKeys(fn);
        lastName.sendKeys(ln);
        address.sendKeys(Address);
        phoneNumber.sendKeys(phonenumber);
        City.sendKeys(city);
        zipCode.sendKeys(zipcode);
        ssn.sendKeys(Ssn);
        state.sendKeys(State);
        customerUsername.sendKeys(customerusername);
        customerPassword.sendKeys(password);
        ConfirmPassword.sendKeys(password);




    }
  public HomePage clickonRegister(){
        registerButton.click();
        return new HomePage();
  }

}
