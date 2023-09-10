package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestBaseClass {
    public WebDriver driver;



    @BeforeSuite
    public void beforeSuite(){
        System.out.println("it is before suite");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("it Is before class");
    }

    @BeforeMethod
    public void beforeMethod(){
        // Set the path to ChromeDriver executable
     //   System.setProperty(
       //         "webdriver.chrome.driver",
       //         "C:\\Users\\Zayan\\Desktop\\javaSeleniumJuneBatch\\src\\test\\java\\resources\\chrome.exe");

        System.setProperty(
                "webdriver.gecko.driver",
                "C:\\Users\\Zayan\\Desktop\\javaSeleniumJuneBatch\\src\\test\\java\\resources\\geckodriver.exe");


        // Instantiate a ChromeDriver class.
        //  WebDriver driver = new ChromeDriver();

        // Instantiate a Firefox class.
         driver = new FirefoxDriver();

        // Navigate to the webpage
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        System.out.println("it is before method");
    }

    @AfterMethod
    public void afterMethod(){

        System.out.println("it is after method");
        driver.close();
        driver.quit();
    }

    @AfterClass
    public void afterClass(){
        System.out.println("it is after class");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("it is after suite");
    }
}
