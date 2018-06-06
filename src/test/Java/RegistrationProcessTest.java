import common.TestBase;
import org.testng.annotations.Test;


public class RegistrationProcessTest extends TestBase{


    @Test(dataProvider="Authentication")
    public void homePageTest(String sName, String sLastname){
        homePage.clickRegistrationButton()
                .fillNameInput(sName)
                .fillLastNameInput(sLastname);

    }
}
