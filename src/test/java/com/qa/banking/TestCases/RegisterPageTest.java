package com.qa.banking.TestCases;

import com.qa.banking.Base.TestBase;
import com.qa.banking.Pages.HomePage;
import com.qa.banking.Pages.LoginPage;
import com.qa.banking.Pages.RegisterPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class RegisterPageTest extends TestBase {
    RegisterPage registerPage;
    LoginPage loginPage;

    HomePage homePage;
    public RegisterPageTest(){
        super();
    }
    @BeforeMethod
    public void setup() {
        initialization();
        loginPage = new LoginPage();
        registerPage = new RegisterPage();
        homePage = new HomePage();
    }
    @Test(priority = 1)
    public void newuserregistration() throws InterruptedException {
        loginPage.clickonResgisterlink();
        registerPage.newUserRegistration(prop.getProperty("fn"),prop.getProperty("ln"),prop.getProperty("address"),prop.getProperty("city"),prop.getProperty("zip"),prop.getProperty("state"),prop.getProperty("ssn"),prop.getProperty("phone"),prop.getProperty("username"),prop.getProperty("password"));
        registerPage.clickonRegister();
    }




}








