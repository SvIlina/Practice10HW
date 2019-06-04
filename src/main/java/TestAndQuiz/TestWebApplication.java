package TestAndQuiz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestWebApplication {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.testandquiz.com/selenium/testing.html");

        WebApplication webApplication = new WebApplication(webDriver);

        webDriver.findElement(By.xpath("//*[text()='This is a link']")).click();
        webDriver.navigate().back();

        webApplication.inputText("id,jgfx ");
        webApplication.submitClick();



    }
}
