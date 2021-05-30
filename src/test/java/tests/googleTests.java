package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.SearchPage;


public class googleTests {

    private static WebDriver driver;
    private static SearchPage searchPage;

    @BeforeAll
    public static void init() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        searchPage = new SearchPage(driver);
    }

    @Test
    public void test1() {
        driver.get("http://google.com");
        searchPage.search("калькулятор");
        WebElement element = driver.findElement(By.xpath(".//div[text()='(']"));
        element.click();
        WebElement element1 = driver.findElement(By.xpath(".//div[text()='1']"));
        element1.click();
        WebElement element2 = driver.findElement(By.xpath(".//div[text()='+']"));
        element2.click();
        WebElement element3 = driver.findElement(By.xpath(".//div[text()='2']"));
        element3.click();
        WebElement element4 = driver.findElement(By.xpath(".//div[text()=')']"));
        element4.click();
        WebElement element5 = driver.findElement(By.xpath(".//div[text()='×']"));
        element5.click();
        WebElement element6 = driver.findElement(By.xpath(".//div[text()='3']"));
        element6.click();
        WebElement element7 = driver.findElement(By.xpath(".//div[text()='−']"));
        element7.click();
        WebElement element8 = driver.findElement(By.xpath(".//div[text()='4']"));
        element8.click();
        WebElement element9 = driver.findElement(By.xpath(".//div[text()='0']"));
        element9.click();
        WebElement element10 = driver.findElement(By.xpath(".//div[text()='÷']"));
        element10.click();
        WebElement element11 = driver.findElement(By.xpath(".//div[text()='5']"));
        element11.click();
        WebElement element12 = driver.findElement(By.xpath(".//div[text()='=']"));
        element12.click();
    WebDriverWait wait = new WebDriverWait(driver, 10);
}
@AfterAll
    public static void teardown() {
        driver.quit();
}
}

