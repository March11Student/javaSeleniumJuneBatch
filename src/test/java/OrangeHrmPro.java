import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class OrangeHrmPro {
    public static void main(String[] args) {
        // Set the path to ChromeDriver executable
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\workspace\\javaSeleniumJuneBatch\\chromedriver.exe");
        // Instantiate a ChromeDriver class.
        WebDriver driver = new ChromeDriver();

        // Navigate to the webpage
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
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
        }

    }}