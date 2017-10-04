package ZheDaWengKai;

public class mudAndDivid {
    public static void main(String[] args){
        int n =352;
        int result = 0;
        do{
            int digit = n%10;
            result = result*10+digit;
           // System.out.println("n =" + n);
            System.out.print(digit);
            n = n/10;
        }while (n>0);
        System.out.println();
        System.out.println(result);

//        System.out.println(n%10);
//        System.out.println(n/10);
//        n=n/10;
//        System.out.println(n%10);
//        System.out.println(n/10);
    }
}
