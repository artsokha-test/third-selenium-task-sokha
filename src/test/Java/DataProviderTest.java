import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class DataProviderTest {

    private static WebDriver driver;

    @DataProvider(name="Authentication")
    public static Object[][] credentials() {
        return new Object[][] {{"testuser_1", "Test@123"}, {"testuser-1", "test@123"}};
    }

}
