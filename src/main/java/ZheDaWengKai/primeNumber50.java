package ZheDaWengKai;

public class primeNumber50 {
    public static void main(String[] args) {
        int count =0;
        for (int n = 2; n < 1000; n++) {
            int isPrime = 1;
            for (int i = 2; i < n; i++) {

                if (n % i == 0) {
                    isPrime = 0;
                    break;
                }
            }

           do {
               if (isPrime == 1) {
                   System.out.println(count + " "+ n);
                   count++;
               }
           }while (count<50);
        }
    }
}
