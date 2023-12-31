import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;


public class OrangeHrmPro {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to ChromeDriver executable
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Users\\Zayan\\Desktop\\javaSeleniumJuneBatch\\src\\test\\java\\resources\\chrome.exe");

        System.setProperty(
                "webdriver.gecko.driver",
                "C:\\Users\\Zayan\\Desktop\\javaSeleniumJuneBatch\\src\\test\\java\\resources\\geckodriver.exe");


        // Instantiate a ChromeDriver class.
      //  WebDriver driver = new ChromeDriver();

        // Instantiate a Firefox class.
        WebDriver driver ;
              driver  = new FirefoxDriver();

        // Navigate to the webpage
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);



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

        /*driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

        // Define the expected text you want to validate
        String expected_text="Dashboard";
        // Find the WebElement containing the text you want to validate
        WebElement dashboard_text=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6"));

        // Get the actual text from the WebElement
        String actual_text =dashboard_text.getText();

        // Compare the actual text with the expected text
        if (actual_text.contains(expected_text)){
            System.out.println("Text validation Pass");
        } else {
            System.out.println("Text validation failed!");
        }
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();

        // Define the expected text you want to validate
        String expected_login_text="Login";
        // Find the WebElement containing the text you want to validate
        WebElement login_text=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/h5"));

        // Get the actual text from the WebElement
        String actual_login_text =login_text.getText();

        // Compare the actual text with the expected text
        if (expected_login_text.contains(actual_login_text)){
            System.out.println("Login_Text validation Pass");
        } else {
            System.out.println("Login_Text validation failed!");
        }*/

        // ******************** Test case-4. validate add employee*******************************************************
        WebElement pim = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a"));
        pim.click();
        Thread.sleep(5000);
        WebElement addEmployee = driver.findElement(By.xpath("//a[contains(text(),'Add Employee')]"));
        addEmployee.click();
        Thread.sleep(2000);

        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstName']"));
        firstName.sendKeys("Bilkis");
        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastName']"));
        lastName.sendKeys("Indorewala");

        WebElement employeeId = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input"));
        employeeId.clear();
        employeeId.sendKeys("3579");
        WebElement save = driver.findElement(By.xpath("//button[@type='submit']"));
        save.click();
        Thread.sleep(5000);

        WebElement fName = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[1]/div[1]/h6"));
         String fullName =  fName.getText();

        if (fullName.contentEquals("Bilkis Indorewala")){
            System.out.println("name match");

        }else {
            System.out.println("name not match");
        }

    WebElement dir=driver.findElement(By.xpath("//span[normalize-space()='Directory']"));
        dir.click();
        Thread.sleep(3000);
        WebElement emp=driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
        emp.sendKeys("Bilkis");
        Thread.sleep(3000);

        emp.sendKeys(Keys.ARROW_DOWN);
         emp.sendKeys(Keys.ENTER);

         WebElement searchButton=driver.findElement(By.xpath("//button[normalize-space()='Search']"));
         searchButton.click();

         Thread.sleep(5000);




        driver.close();
        driver.quit();
    }



}