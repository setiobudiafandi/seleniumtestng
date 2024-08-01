package DemoTestNG;

import org.testng.annotations.*;

@Test(groups = "smoke")
public class ConfigurationAnnotations_2_ListBox {

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
        System.out.println("Execute Before Class : List Box");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Execute After Class : List Box");
    }

    public void test1_BootstrapListBox() {
        System.out.println("Test Method 3 : Bootstrap List Box");
    }
     
    public void test2_JQueryListBox() {
        System.out.println("Test Method 4 : JQuery List Box");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Execute before test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("Execute after test");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Execute before suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("Execute after suite");
    }
    
    @BeforeGroups(groups = "smoke")
    public void beforeGroups() {
        System.out.println("Execute before groups");
    }

    @AfterGroups(groups = "smoke")
    public void afterGroups() {
        System.out.println("Execute after groups");
    }
}
