import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by chandan on 12/9/2015.
 */
public class SimpleTest1 extends SimpleTest {

    int a;
    int b;

    @BeforeClass
    public void beforeClass(){
        a=3;
        b=4;
    }

    @Test
    public void test1(){
        driver.get("https://www.google.co.uk");
        System.out.println(driver.getTitle());
        Assert.assertEquals(a + 1, b);
    }

    @Test
    public void test2(){
        driver.get("https://twitter.com/");
        System.out.println(driver.getTitle());
        Assert.assertTrue(a < b);
    }

    @Test
    public void test3(){
        driver.get("https://www.instagram.com/");
        System.out.println(driver.getTitle());
        Assert.assertTrue(a < b);
    }
}
