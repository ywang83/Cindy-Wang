package hw;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FBTest {
    private FB fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new FB();
    }

    @After
    public void tearDown() throws Exception {
        fixture = null;
    }

    @Test
    public void getNumber() throws Exception {
        int n=10;
        String Expected[]= {"getNumber()"};
        String output[] = {"1","2","fizz","4","buzz","fizz","7","8","fizz"};
        assertEquals(output,Expected);
    }

}