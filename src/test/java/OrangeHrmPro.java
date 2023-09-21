
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.List;
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
      /*  String title=driver.getTitle();
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
*/
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
     /*   WebElement pim = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a"));
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

         Thread.sleep(5000);*/

         // test case 5. validate top menu bar
       /* WebElement pim = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a"));
        pim.click();
        List<WebElement>menubar=driver.findElements(By.xpath("//nav[@aria-label='Topbar Menu']//ul/li"));
        System.out.println("Number of items: "+menubar.size());
        for(int i=0;i<menubar.size();i++){
            String txt=menubar.get(i).getText();
            System.out.println(txt);
            if(txt.contentEquals("Configuration")){
                menubar.get(i).click();
                Thread.sleep(5000);
                //break;
            }
        }*/



        //test case -6
        /*
         //select configuration at PIM
        WebElement pim1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a"));
        pim1.click();
        String path="//span[@class='oxd-topbar-body-nav-tab-item']";
        WebElement configuration=driver.findElement(By.xpath(path));
        configuration.click();
        Thread.sleep(2000);
        // select termination record
        WebElement termination=driver.findElement(By.xpath("//a[contains(text(),'Termination Reasons')]"));
        termination.click();
        Thread.sleep(2000);




        //now click element
        WebElement retiredCheckbox=driver.findElement(By.xpath("//div[contains(text(),'Retired')]/preceding::span[1]/i"));
        // scroll to viewpoint
        //create an object of javascriptExecutor
        JavascriptExecutor je = (JavascriptExecutor) driver;
        // now execute query which actually will scroll until that element is not appeared on page.
        je.executeScript("arguments[0].scrollIntoView(true);",retiredCheckbox);
        System.out.println("Before checked: "+retiredCheckbox.isSelected());
        retiredCheckbox.click();
        Thread.sleep(5000);
        System.out.println("After checked: "+retiredCheckbox.isSelected());


        WebElement employeeList=driver.findElement(By.xpath("//a[normalize-space()='Employee List']"));
        employeeList.click();
        Thread.sleep(2000);

        WebElement jobTitle=driver.findElement(By.xpath("//a[normalize-space()='Employee List']"));
        employeeList.click();
        Thread.sleep(2000);*/

            // test case print menubar text

      /*  WebElement pim = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a"));
        pim.click();
        Thread.sleep(2000);
        List<WebElement> menuBar= driver.findElements(By.xpath("//nav[@aria-label='Topbar Menu']/ul/li"));
        System.out.println("Number of elements: "+menuBar.size());
        int size=menuBar.size();

        for(int i=0;i<size;i++){
            WebElement menu=menuBar.get(i);
           String txt=menu.getText();
            System.out.println(txt);
            if (txt.contentEquals("Configuration")){
                menu.click();
                Thread.sleep(5000);
            }
            else if (txt.contentEquals("Employee List")){
                System.out.println("From if else condition: "+txt);
            }else if(txt.contentEquals("Add Employee")){
                String  font=menu.getCssValue("font-size");
                System.out.println("Font size is: "+font);
            }

        }
*/
        //test case 7 validate menus
       String menu="//ul[@class='oxd-main-menu']/li";
       List<WebElement> menus= driver.findElements(By.xpath(menu));//will return 12 web elements
       int sizeOfMenus= menus.size();
        System.out.println("Number of elements: "+sizeOfMenus);



       /* WebElement element0 = menus.get(0);
        String text0=element0.getText();
        System.out.println("webElement text is: "+text0);

        WebElement element1= menus.get(1);
        String text1=element1.getText();
        System.out.println("webElement text is: "+text1);

        WebElement Element= menus.get(2);
        String text2=Element.getText();
        System.out.println("webElement text is: "+text2);

        WebElement element3 = menus.get(3);
        String text3=element3.getText();
        System.out.println("webElement text is: "+text3);

        WebElement element4 = menus.get(4);
        String text4=element4.getText();
        System.out.println("webElement text is: "+text4);*/

        for(int i=0;i<menus.size();i++){
            System.out.println("Value of i now: "+i);
            WebElement element = menus.get(i);
            String text=element.getText();
            System.out.println("webElement text is: "+text);
        }

        driver.close();
        driver.quit();
    }



}