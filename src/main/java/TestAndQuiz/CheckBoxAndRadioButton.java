package TestAndQuiz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxAndRadioButton {

    private final WebDriver driver;

    CheckBoxAndRadioButton(WebDriver webDriver) {
        driver = webDriver;
    }

    private By radioButton = By.id("male");
    private By checkBox = By.xpath("//input[@class='Performance']");

    public void clickRadioButton() {
        driver.findElement(radioButton).click();
    }

    public void clickCheckBox (){
        driver.findElement(checkBox).click();
    }
}
