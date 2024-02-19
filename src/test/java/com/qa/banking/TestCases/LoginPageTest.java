package com.qa.banking.TestCases;

import com.qa.banking.Base.TestBase;
import com.qa.banking.Pages.HomePage;
import com.qa.banking.Pages.LoginPage;
import com.qa.banking.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class LoginPageTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;
    String sheetName = "Credentials";
    Logger log =  Logger.getLogger(LoginPageTest.class);



    public LoginPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
    }

    @Test(priority = 1)
    public void loginPageTitleTest() {
        log.info("this is crazy");
        String title = loginPage.validatePageTitle();
        Assert.assertEquals(title, "ParaBank | Error");

    }

    @Test(priority = 2)
    public void bankingPageLogoTest() {
        log.warn("this is inasane");
        log.error("this shoud bedone");
        boolean validLogo = loginPage.validatePageLogo();
        Assert.assertTrue(validLogo);


    }
    @DataProvider
    public Object[][] getTestData(){
        Object data[][] = TestUtil.getTestData(sheetName);
        return data;
    }

    @Test(priority = 3,dataProvider = "getTestData")
    public void loginTest(String userName, String password) {
        homePage = loginPage.login(userName,password);


    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}


