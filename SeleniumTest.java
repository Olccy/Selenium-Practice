import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    @Test
    public void main() throws InterruptedException{



        WebDriverManager.chromedriver ().setup ();
        WebDriver driver = new ChromeDriver ();
        driver.manage ().window ().maximize ();
        driver.manage ().deleteAllCookies ();


        driver.get ("https://demoqa.com/");
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,450)","");

        WebElement element = driver.findElement (By.xpath ("//div[@class='category-cards']/div[.='Elements']"));
        element.click();

        Thread.sleep (2000);

        WebElement webTables = driver.findElement (By.xpath ("//li[.='Web Tables']"));
        webTables.click();

        Thread.sleep (2000);

        WebElement add = driver.findElement (By.id("addNewRecordButton"));
        add.click ();

        Thread.sleep (2000);

        WebElement firstName = driver.findElement (By.id("firstName"));
        firstName.click ();
        firstName.sendKeys ("Selenium");

        Thread.sleep (2000);

        WebElement lastName = driver.findElement (By.id("lastName"));
        lastName.click ();
        lastName.sendKeys ("Otomasyon");

        Thread.sleep (2000);

        WebElement email = driver.findElement (By.id("userEmail"));
        email.click ();
        email.sendKeys ("selenium@otomasyon.com");

        Thread.sleep (2000);

        WebElement age = driver.findElement (By.id("age"));
        age.click ();
        age.sendKeys ("29");

        Thread.sleep (2000);

        WebElement salary = driver.findElement (By.id ("salary"));
        salary.click ();
        salary.sendKeys ("50000");

        Thread.sleep (2000);

        WebElement department = driver.findElement (By.id("department"));
        department.click ();
        department.sendKeys ("Quality Engineer");

        Thread.sleep (2000);

        WebElement submit = driver.findElement (By.id("submit"));
        submit.click ();

        Thread.sleep (1500);

        driver.quit();



    }
    }
