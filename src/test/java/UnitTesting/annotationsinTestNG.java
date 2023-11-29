package UnitTesting;

import org.testng.Assert;
import org.testng.annotations.*;

public class annotationsinTestNG {

    @BeforeSuite
    public static void BeforeSuite() {
        System.out.println("this is before suite");
        //initialize the webdriver and perform global setup
    }

    @BeforeClass
    public static void BeforeClass() {
        System.out.println("this is before class");
        //perform class level setup ex: opening a specific page
    }

    @BeforeMethod
    public static void BeforeMethod() {
        System.out.println("this is before method");
        //perform actions before each test method ex: login
    }

    @BeforeTest
    public static void BeforeTest() {
        System.out.println("this is before test");
        //perform actions before each test
    }

    @Test
    public static void test() {
        System.out.println("this is test");
        //test features could be 1 or more @ test depending on the feature
    }

    @AfterTest
    public static void afterTest() {
        System.out.println("this is after test");
        //perform action after each test ex:clear cookies and history
    }

    @AfterMethod
    public static void afterMethod() {
        System.out.println("this is after method");
        // after each method ex: logout
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("this is after class");
        //ex: navigate back to the home page close windows or tabs
    }

    @AfterSuite
    public static void afterSuite() {
        System.out.println("this is after suite");
        //global clean up ex: closing browser or quit driver control for web browser
    }

    @Test
    @Parameters({"a", "b"})
    public void testME(int c, int d) {
        int sum = c + d;
        System.out.println(sum);
    }

    //
    @Test
    @Parameters({"a", "b"})
    public void testME1(int c, int d) {
        int sub = c - d;
        System.out.println(sub);
    }

    //
    @Test
    @Parameters({"a", "b"})
    public void testME2(int c, int d) {
        int div = c / d;
        System.out.println(div);
    }

    @Test
    @Parameters({"a", "b"})
    public void testME3(int c, int d) {
        int mul = c * d;
        System.out.println(mul);
    }

    //
    @DataProvider(name = "myData")
    public Object[][] myData() {
        return new Object[][]{
                {3, 5, 8},
                {2, 5, 7},
                {5, 5, 10}
        };
    }

    @Test(groups = {"mytest"}, dataProvider = "myData")
    public void datagivenTest(int a, int b, int expectedResult) {
        calculator c = new calculator();
        int result = c.add(a, b);
        Assert.assertEquals(result, expectedResult);
    }

    class calculator {
        public int add(int a, int b) {
            return a + b;
        }
    }
}







