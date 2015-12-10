import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by chandan on 12/9/2015.
 */
public class SimpleTest {

    WebDriver driver;
    int a;
    int b;

    public SimpleTest() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @BeforeClass
    public void beforeClass(){
        a=3;
        b=4;
    }

    @Test
    public void test1(){
        driver.get("https://maven.apache.org");
        System.out.println("Test1 " + driver.getTitle());
        Assert.assertEquals(a + 1, b);
    }

    @Test
    public void test2(){
        driver.get("https://github.com/");
        System.out.println("Test2 " + driver.getTitle());
        Assert.assertTrue(a < b);
    }

    @Test
    public void test3(){
        driver.get("https://about.gitlab.com/");
        System.out.println("Test3 " + driver.getTitle());
        Assert.assertTrue(a < b);
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
