package Test_Functionalities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScriptAlerts {

    private final WebDriver driver;

    public JavaScriptAlerts(WebDriver driver) {this.driver = driver;}

    @FindBy(xpath = "//button[@onclick='jsAlert()'][contains(.,'Click for JS Alert')]")
    private WebElement btnJsAlert;

    @FindBy(xpath = "//button[@onclick='jsConfirm()'][contains(.,'Click for JS Confirm')]")
    private WebElement btnJsConfirm;

    @FindBy(xpath = "//button[@onclick='jsPrompt()'][contains(.,'Click for JS Prompt')]")
    private WebElement btnJsPrompt;

    @FindBy(xpath = "//p[contains(@id,'result')]")
    private WebElement results;

    public void click_btnJsAlert()
    {
        btnJsAlert.click();
        driver.switchTo().alert().accept();
        String getResults = results.getText();
    }

    public void click_btnJsConfirm()
    {
        btnJsConfirm.click();
        driver.switchTo().alert().dismiss();
        String getResults = results.getText();
    }

    public void click_btnJsPrompt()
    {
        btnJsPrompt.click();
        driver.switchTo().alert().sendKeys("Entering Text in Prompt");
    }

}
