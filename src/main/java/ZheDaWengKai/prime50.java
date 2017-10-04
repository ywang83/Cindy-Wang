package ZheDaWengKai;

import java.util.ArrayList;
import java.util.List;

public class prime50 {
    public static void main(String[] args) {
        List<Integer> aSub = getArrayList().subList(0,50);
        System.out.println(aSub);
    }

        public static ArrayList<Integer> getArrayList(){
        ArrayList<Integer> a = new ArrayList<>();
            for (int n =2; n<300; n++){
                boolean isPrime = true;
                for (int i = 2; i<n; i++) {
                    if (n % i == 0) {
                        isPrime = false;
                    }
                }
                    if (isPrime){
                        a.add(n);
                    }
                }
            return a;
        }
}
