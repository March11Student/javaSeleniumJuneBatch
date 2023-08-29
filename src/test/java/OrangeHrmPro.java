import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class OrangeHrmPro {
    /*Environment setup
    steps:
        Steps 1.install java
        Step-2.Install ide(integrated development environment)(intellij,eclipes)
        step-3.download drivers(chrome,firefox,safari)
        step-4.create new maven/gradle project
        step-5.add dependencies (selenium, testng)
        sept-6. create package and class amd method(at least main method)
    * */
    public static void main(String[] args) throws InterruptedException {
        /*step7. we have let the systen where is the driver.exe file located
        syntax:System.setProperty( String parameter1,String parameter2)
                parameter1-"webdriver.driverName.driver"
                parameter2-location of the driver
        */

        System.setProperty(
                "webdriver.gecko.driver",
                "C:\\Users\\Zayan\\Desktop\\javaSeleniumJuneBatch\\src\\test\\java\\resources\\geckodriver.exe");
       /* System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Users\\Zayan\\Desktop\\javaSeleniumJuneBatch\\src\\test\\java\\resources\\chromedriver.exe");*/
        /* Step8. Instantiate a driver class.
        *         syntax: WebDriver driver=new driverClass()
        * */

      //  WebDriver driver = new ChromeDriver();
        WebDriver driver = new FirefoxDriver();

       /* Step 9:  Navigate to the webpage
                    driver.get(pass URL as a String) or
                    driver.navigate.to(pass URL as String)

                    */
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

       // driver.get("https://abc8472.sg-host.com/");
        //
        /* supporting steps
         Step-10:add implicit wait
            syntax- driver.manage().timeouts().implicityWait(long value,Time unit)

         */
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(5000);
 //**********************common for every test case*******************************************
        //Test case-1: validate web title
            //step-1. get the page title
        String title=driver.getTitle();
            //validate the title

        if(title.contentEquals("OrangeHRM")){
            System.out.println("title Match");
        }else{
            System.out.println("Title Does Not match");
        }

//*************************end of test case 1***************************************************
 // ***************** Test case 2: validate url ***********************************
        String url=driver.getCurrentUrl();
        System.out.println(url);
        //validation
        if(url.contentEquals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")){
            System.out.println("URL Match");
        }else{
            System.out.println("URL Does Not match");
        }

//***************************end of  test case****************************************************
// test case-3 validate user login
        //finding webelement
        WebElement userName=driver.findElement(By.name("username"));
        //send characters
        userName.sendKeys("Admin");

        WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("admin123");

        WebElement loginButton=driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        Thread.sleep(5000);
        // validation
        WebElement dash=driver.findElement(By.xpath("//h6"));
        String dashName=dash.getText();

        //testng assertion
        Assert.assertEquals(dashName, "Dashboard");

        //***********************************Test case 4 validate add employee *************************************


        driver.close();
        driver.quit();

    }
}