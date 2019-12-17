package andrii;

import org.junit.Assert;
import org.junit.Test;

import static andrii.Recursive_factorial.*;

public class Recursive_factorialTest {

    @Test
    public void Tfactorial() {
        int b = 3;
        Assert.assertEquals(6,factorial(b));
        System.out.println("Test successful!");
    }
}