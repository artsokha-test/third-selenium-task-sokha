import org.testng.annotations.DataProvider;

public class DataProviderTest {

    @DataProvider(name="Authentication")
    public static Object[][] registrationData() {
        return new Object[][] {
                {"TestFirstName_1", "TestLastName_1", "222-333-444", "TestUsername_1", "test1@mail.com","This is test user 1", "test1234"},
                {"TestFirstName_2", "TestLastName_2", "222-555-444", "TestUsername_2", "test2@mail.com","This is test user 1", "test1234"},
                };
    }

}
