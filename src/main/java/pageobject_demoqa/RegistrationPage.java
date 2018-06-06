package pageobject_demoqa;

import common.LogFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;

public class RegistrationPage extends SideMenu{

    private static final Logger LOG = LogFactory.getLogger(RegistrationPage.class);
//    Select select = new Select(driver);

    @FindBy(id = "name_3_firstname")
    protected WebElement nameInput;

    @FindBy(id = "name_3_lastname")
    protected WebElement lastNameInput;

    @FindBy(xpath = "//label[text()=\"Single\"]/following-sibling::*[1]")
    protected WebElement selectSingleRadioButton;

    @FindBy(xpath = "//label[text()=\"Reading\"]/following-sibling::*[1]")
    protected WebElement selectReadingCheckbox;

    @FindBy(id = "phone_9")
    protected WebElement phoneInput;

    @FindBy(id = "username")
    protected WebElement usernameInput;

    @FindBy(id = "email_1")
    protected WebElement emailInput;

    @FindBy(id = "description")
    protected WebElement descriptionInput;

    @FindBy(id = "password_2")
    protected WebElement passwordInput;

    @FindBy(id = "confirm_password_password_2")
    protected WebElement confirmPasswordInput;

    @FindBy(name = "pie_button")
    protected WebElement submitButton;



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

    public RegistrationPage clickOnSingleRadiobutton() {
        selectSingleRadioButton.click();
        LOG.info("Selected Martial status 'Single' radiobutton ");
        return this;
    }

    public RegistrationPage clickOnReadingCheckbox(){
        selectReadingCheckbox.click();
        LOG.info("Selected Hobby 'Reading': ");
        return this;
    }

    public RegistrationPage fillPhoneInput(String input) {
        phoneInput.clear();
        phoneInput.sendKeys(input);
        LOG.info("Filled phone input with numbers: " + input);
        return this;
    }

    public RegistrationPage fillUsernameInput(String input) {
        usernameInput.clear();
        usernameInput.sendKeys(input);
        LOG.info("Filled username input with text: " + input);
        return this;
    }

    public RegistrationPage fillEmailInput(String input) {
        emailInput.clear();
        emailInput.sendKeys(input);
        LOG.info("Filled email input : " + input);
        return this;
    }

    public RegistrationPage fillDescriptionInput(String input) {
        descriptionInput.clear();
        descriptionInput.sendKeys(input);
        LOG.info("Filled description input with text: " + input);
        return this;
    }

    public RegistrationPage fillPasswordInput(String input) {
        passwordInput.clear();
        passwordInput.sendKeys(input);
        LOG.info("Filled Password input: " + input);
        return this;
    }

    public RegistrationPage fillConfirmPasswordInput(String input) {
        confirmPasswordInput.clear();
        confirmPasswordInput.sendKeys(input);
        LOG.info("Filled Confirm password: " + input);
        return this;
    }

    public RegistrationPage clickOnSubmitButton() {
        submitButton.click();
        LOG.info("Clicked submit button: ");
        return this;
    }

}