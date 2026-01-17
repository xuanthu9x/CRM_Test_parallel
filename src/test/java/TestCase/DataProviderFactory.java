package TestCase;

import helpers.ExcelHelper;
import helpers.SystemHelper;
import org.testng.annotations.DataProvider;

public class DataProviderFactory {
    @DataProvider(name = "data_provider_login", parallel = true)
    public Object[][] dataLogin() {
        return new Object[][]{{"admin@example.com", "123456"}, {"user1@example.com", "123456"}};
    }

    @DataProvider(name = "data_provider_login_excel", parallel = true)
    public Object[][] dataLoginFromExcel() {
        ExcelHelper excelHelper = new ExcelHelper();
        Object[][] data = excelHelper.getExcelData(SystemHelper.getCurrentDir() + "src/test/resources/DataTest/Login1.xlsx", "Login");
        System.out.println("Login Data from Excel: " + data);
        return data;
    }
}
