package Textbook;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class bankAccountTest {
    private String fixtrue;
    @Before
    public void setUp() {
        fixtrue = "pin";
    }

    @After
    public void tearDown() {
        fixtrue = null;
    }

    @Test
    public void testverifyPIN(){
        String inputPin="";

        assertEquals(inputPin, fixtrue);
    }


}