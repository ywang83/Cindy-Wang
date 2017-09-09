package hw;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FBTest {

    @Test
    public void FB10minus() {
        assertEquals("buzz", FB.getNumber(-10));
    }

    @Test
    public void FB1minus() {
        assertEquals("-1", FB.getNumber(-1));
    }

    @Test
    public void FB0() {
        assertEquals("0", FB.getNumber(0));
    }

    @Test
    public void FB1() {
        assertEquals("1", FB.getNumber(1));
    }

    @Test
    public void FB7() {
        assertEquals("7", FB.getNumber(7));
    }

    @Test
    public void FB17() {
        assertEquals("17",FB.getNumber(17));
    }

}