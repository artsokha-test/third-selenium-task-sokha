import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class DataProviderTest {

    @DataProvider(name="Authentication")
    public static Object[][] Authentication() {
        return new Object[][] {{"testuser_1", "Test123"}, {"testuser_2", "test123"}};
    }

}
