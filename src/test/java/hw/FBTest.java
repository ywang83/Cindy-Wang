package hw;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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
        assertNotNull(fixture);
        assertEquals("fizz", fixture.getNumber());
    }

}