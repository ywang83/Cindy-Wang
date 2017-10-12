package dataStructure;

public class printN {
    public static void main(String[] args) {
        print(100000);
       // printN(1000);//n=100,000 break down with Exception in thread "main" java.lang.StackOverflowError
    }

    public static void print(int n){
        for(int i =1; i<=n; i++){
            System.out.println(i);
        }
    }

    public static void printN(int n){ //递归
        if(n!=0){
            printN(n-1);
            System.out.println(n);
        }
    }
}
