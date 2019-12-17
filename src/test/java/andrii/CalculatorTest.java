package andrii;

import org.junit.Assert;
import org.junit.Test;

import static andrii.Calculator.*;

public class CalculatorTest {

    @Test
    public void Tsum() {
        int a = 2;
        int b = 4;
        Assert.assertEquals(6,sum(a,b));
        System.out.println("Test successful!");
    }

    @Test
    public void Tsubstract() {
        int a = 8;
        int b = 1;
        Assert.assertEquals(7,substract(a,b));
        System.out.println("Test successful!");
    }

    @Test
    public void Tdivide() {
        int a = 4;
        int b = 2;
        Assert.assertEquals(2,divide(a,b));
        System.out.println("Test successful!");
    }

    @Test
    public void Tmultiplication() {
        int a = 3;
        int b = 3;
        Assert.assertEquals(9,multiplication(a,b));
        System.out.println("Test successful!");
    }
}