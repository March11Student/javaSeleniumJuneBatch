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
                System.getProperty("user.dir")+"\\src\\test\\java\\resources\\chromedriver.exe");

        /*System.setProperty(
               "webdriver.gecko.driver",
               System.getProperty("user.dir")+\\src\\test\\java\\resources\\geckodriver.exe");

*/
       //declare driver
        WebDriver driver ;

        // Instantiate a Firefox class.
        //  driver  = new FirefoxDriver();

        // Instantiate a ChromeDriver class.
        driver  = new ChromeDriver();

        // Navigate to the webpage
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //add implicit wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //maximize window
        driver.manage().window().maximize();



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