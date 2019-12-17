package andrii;

import org.junit.Assert;
import org.junit.Test;

import static andrii.Fibonachi.*;

public class FibonachiTest {

    @Test
    public void Tfib() {
        int a = 4;
        Assert.assertEquals(3,fib(a));
        System.out.println("Test successful!");
    }
}