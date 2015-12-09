import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by chandan on 12/9/2015.
 */
public class SimpleTest1 {

    int a;
    int b;

    @BeforeClass
    public void beforeClass(){
        a=3;
        b=4;
    }

    @Test
    public void test1(){
        System.out.println(Thread.currentThread().getName());
        Assert.assertEquals(a + 1, b);
    }

    @Test
    public void test2(){
        System.out.println(Thread.currentThread().getName());
        Assert.assertTrue(a < b);
    }

    @Test
    public void test3(){
        System.out.println(Thread.currentThread().getName());
        Assert.assertTrue(a < b);
    }
}
