package dataStructure;

import static java.lang.StrictMath.pow;

public class fn {
    public static void main(String[] args) {
// f(x)=a[0] + a[1]x +...+a[n]x(n) - a[n]n下标 x(n)n次方

        double[] array = {1, 3, 5};
        System.out.println(fx(2, array, 3));
        System.out.println(fxSmart(2, array, 3));
    }

    public static double fx(int n, double a[], double x){
        int i;
        double p=a[0];
        for (i=1; i<=n; i++){
            p+=(a[i]*pow(x,i));
        }
        return p;
    }

    //f(x)=a[0] + x(a[1] + x(a[2] +x(...x(a[n-1] + x(a[n]))) )
    public static double fxSmart (int n, double a[], double x){
        int i;
        double p=a[n];
        for (i=n; i>0; i--){
            p=a[i-1]+x*p;
        }
        return p;
    }

}
