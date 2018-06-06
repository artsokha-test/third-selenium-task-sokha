package pageobject_demoqa;

import common.LogFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;

public class RegistrationPage extends SideMenu{

    private static final Logger LOG = LogFactory.getLogger(RegistrationPage.class);

    @FindBy(id = "name_3_firstname")
    protected WebElement nameInput;

    @FindBy(id = "name_3_lastname")
    protected WebElement lastNameInput;

    private WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public RegistrationPage fillNameInput(String input) {
        nameInput.clear();
        nameInput.sendKeys(input);
        LOG.info("Filled name input with text: " + input);
        return this;
    }

    public RegistrationPage fillLastNameInput(String input) {
        lastNameInput.clear();
        lastNameInput.sendKeys(input);
        LOG.info("Filled last name input with text: " + input);
        return this;
    }
}