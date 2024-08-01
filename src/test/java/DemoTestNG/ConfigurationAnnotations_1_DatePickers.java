package DemoTestNG;

import org.testng.annotations.*;

public class ConfigurationAnnotations_1_DatePickers {
    @Test(groups = "smoke")
    public void test1_BootstrapDatePicker() {
        System.out.println("Test Method 1 : Bootstrap Date Picker");
    }
     
    @Test
    public void test2_JQueryDatePicker() {
        System.out.println("Test Method 2 : JQuery Date Picker");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Execute Before Each Test Method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Execute After Each Test Method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Execute Before Class : Date Pickers");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Execute After Class : Date Pickers");
    }
}