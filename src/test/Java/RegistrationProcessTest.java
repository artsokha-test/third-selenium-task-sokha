import common.TestBase;
import org.testng.annotations.Test;


public class RegistrationProcessTest extends TestBase{


    @Test(dataProvider="Authentication", dataProviderClass = DataProviderTest.class)
    public void homePageTest(String sName, String sLastname, String sPhone, String sUsername, String sEmail, String sDescription, String sPassword){
        homePage.clickRegistrationButton()
                .fillNameInput(sName)
                .fillLastNameInput(sLastname)
                .clickOnSingleRadiobutton()
                .clickOnReadingCheckbox()
                .fillPhoneInput(sPhone)
                .fillUsernameInput(sUsername)
                .fillEmailInput(sEmail)
                .fillDescriptionInput(sDescription)
                .fillPasswordInput(sPassword)
                .fillConfirmPasswordInput(sPassword)
                .clickOnSubmitButton();


    }
}
