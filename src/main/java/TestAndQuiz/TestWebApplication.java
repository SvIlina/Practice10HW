package TestAndQuiz;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.DoubleClickAction;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestWebApplication {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.testandquiz.com/selenium/testing.html");

        WebApplication webApplication = new WebApplication(webDriver);
        Actions action = new Actions(webDriver);

        webDriver.findElement(By.xpath("//*[text()='This is a link']")).click();
        webDriver.navigate().back();

        webApplication.inputText("id,jgfx ");
        webApplication.submitClick();

        webApplication.clickRadioButton();
        webApplication.clickCheckBox();

        Select drpDwn = new Select(webDriver.findElement(By.id("testingDropdown")));
        drpDwn.selectByValue("Manual");

        WebElement doubleClickAlert = webDriver.findElement(By.id("dblClkBtn"));
        action.doubleClick(doubleClickAlert).perform();
        Thread.sleep(1000);
        webDriver.switchTo().alert().accept();

        WebElement alert = webDriver.findElement(By.xpath("//*[contains(text(),'Generate Alert Box')]"));
        alert.click();
        Thread.sleep(1000);
        webDriver.switchTo().alert().accept();

        WebElement confirmBox = webDriver.findElement(By.xpath("//*[contains(text(),'Generate Confirm Box')]"));
        confirmBox.click();
        Thread.sleep(500);
        webDriver.switchTo().alert().accept();

        WebElement from = webDriver.findElement(By.xpath("//img[@id='sourceImage']"));
        WebElement to = webDriver.findElement(By.xpath("//div[@id='targetDiv']"));
        action.dragAndDrop(from,to).build().perform();
    }
}
