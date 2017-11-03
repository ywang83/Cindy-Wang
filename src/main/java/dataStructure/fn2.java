package dataStructure;

import static java.lang.StrictMath.pow;

public class fn2 {
    public static void main(String[] args) {
// f(x)=1 + x +...+ x(n)    x(n)n次方


        System.out.println(fx(5, 3));
        System.out.println(fxSmart(5,3));
    }

    public static int fx(int n, int x){
        int p=0;
        for (int i=0; i<=n; i++){
            p+=(pow(x,i));
        }
        return p;
    }

    //f(x)=1 + x(1 + x(1 +x(...x(1 + x)) )
    public static int fxSmart (int n, int x){
        int p=0;
//        for (int i=n; i>=0; i--){
        for (int i=0; i<=n; i++){
            p=1+x*p;
        }
        return p;
    }

}
