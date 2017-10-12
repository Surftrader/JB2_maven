import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by johndoe on 11.10.17.
 */
public class HelloTest {
    @Test
    public void testHello() {
        Assert.assertEquals("Hello!", Hello.hello());
    }

    @Test
    public void testHelloAge() {
        Assert.assertEquals("Hello, 6!", Hello.helloAge(6));
        Assert.assertEquals("Hello, 20!", Hello.helloAge(20));
        Assert.assertEquals("Hello, 100!", Hello.helloAge(100));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHelloAgeZero() {
        Hello.helloAge(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHelloAgeNegativ() {
        Hello.helloAge(-10);
    }

}