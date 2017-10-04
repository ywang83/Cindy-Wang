//package Search;

import java.util.*;


public class prime50 {
    public static void main(String[] args) {
        int isPrime=1;
        int num=2;
        for (int i=0; i<20; ){
        for (int j=2; j<num; j++){
            if (num/j==0){
                isPrime=0;
            }
            if(isPrime==1){
                System.out.println(num);
            }
            num++;
            }
    }
}
}