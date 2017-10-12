package dataStructure;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import static java.lang.StrictMath.pow;
import static org.junit.Assert.*;

public class fnTest {

    @Rule
    public TestName name = new TestName();
    long startTime;
    long endTime;
    private final int n = 10;

    @Before
    public void recordStartTime() {
        startTime = System.currentTimeMillis();
    }

    @After
    public void recordEndTime() {
        endTime = System.currentTimeMillis();
        System.out.println("N = " + n);
        System.out.println( name.getMethodName() + " Running time : " + (endTime - startTime) + " ms");
    }

    @Test
    public static double fx(int n, double a[], double x){
        int i;
        double p=a[0];
        for (i=1; i<=n; i++){
            p+=(a[i]*pow(x,i));
        }
        return p;
    }


}