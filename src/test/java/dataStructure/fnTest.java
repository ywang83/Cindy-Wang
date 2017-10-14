package dataStructure;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import java.util.ArrayList;
import java.util.LinkedList;

import static java.lang.StrictMath.pow;
import static org.junit.Assert.*;

public class fnTest {

    @Rule
    public TestName name = new TestName();
    long startTime;
    long endTime;
    private final int MAX = 10;

    @Before
    public void recordStartTime() {
        startTime = System.currentTimeMillis();
    }

    @After
    public void recordEndTime() {
        endTime = System.currentTimeMillis();
        System.out.println("N = " + MAX);
        System.out.println(name.getMethodName() + " Running time : " + (endTime - startTime) + " ms");
    }

    private double[] array;

    @Before
    public void setUp() throws Exception {
        array = new double[MAX];
        double p;
        double x;
    }

    @After
    public void tearDown() throws Exception {
        array = null;
    }

    @Test
    public void fx() {
        int i;
        double x = 1.1;
        double p = array[0];
        for (i = 1; i < MAX; i++) {
            p += (array[i] * pow(x, i));
        }
    }

    @Test
    public void fxSmart() {
        int i;
        double x = 1.1;
        double p = array[MAX-1];
        for (i = MAX; i > 0; i--) {
            p = array[i - 1] + x * p;
        }

    }
}