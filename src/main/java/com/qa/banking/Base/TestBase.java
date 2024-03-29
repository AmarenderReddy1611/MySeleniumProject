package com.qa.banking.Base;

import com.qa.banking.util.TestUtil;
import com.qa.banking.util.WebEventListener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    public static Properties prop;
    public  static EventFiringWebDriver e_driver;
    public static WebEventListener eventListener;




    public TestBase() {
        try {

            prop = new Properties();
            
            FileInputStream ip = new FileInputStream("C:\\Users\\USER\\IdeaProjects\\MyMavenProject\\src\\main\\java\\com\\qa\\banking\\Config\\config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }

    }


    public void initialization(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        String browserName =    prop.getProperty("browser");
     if(browserName.equals("chrome")){
         System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\IdeaProjects\\MyMavenProject\\src\\main\\java\\com\\qa\\banking\\util\\chromedriver.exe");
         driver = new ChromeDriver(options);
     }
     driver.manage().window().maximize();
     driver.manage().deleteAllCookies();
     driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIME, TimeUnit.SECONDS);
     driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);

     driver.get(prop.getProperty("url"));
        e_driver = new EventFiringWebDriver(driver);
        // Now create object of EventListerHandler to register it with EventFiringWebDriver
        eventListener = new WebEventListener();
        e_driver.register(eventListener);
        driver = e_driver;





    }



}
