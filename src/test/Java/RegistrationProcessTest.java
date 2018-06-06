import common.TestBase;
import org.testng.annotations.Test;


public class RegistrationProcessTest extends TestBase{


    @Test(dataProvider="Authentication", dataProviderClass = DataProviderTest.class)
    public void homePageTest(String sName, String sLastname){
        homePage.clickRegistrationButton()
                .fillNameInput(sName)
                .fillLastNameInput(sLastname);

    }
}
