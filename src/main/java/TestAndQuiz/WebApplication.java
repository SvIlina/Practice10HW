package TestAndQuiz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebApplication {

    //Find Text Box
    @FindBy(id = "fname")
    private WebElement textBox;

    //Submit button
    @FindBy(id = "idOfButton")
    private WebElement submitButton;

    private By radioButton = By.id("male");
    private By checkBox =  By.xpath("//input[@class='Performance']");

    WebApplication(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    public void inputText(String text) {
        textBox.sendKeys(text);
    }

    public void submitClick() {
        submitButton.click();
    }

    public void clickRadioButton () {

    }


}
