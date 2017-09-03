package hw;

public class ArrayFizz {
    public static void main (String args[]) {
        int n[] = new int[100];
        for (int i=0; i<n.length; i++){
            if((n[i]=i+1)%15 == 0){
                System.out.println("fizzbuzz");}
            else if ((n[i]=i+1)%3 == 0){
                System.out.println("fizz");}
            else if ((n[i]=i+1)%5 == 0){
                System.out.println("buzz");}
            else {
            System.out.println(n[i]);}
        }
    }
}
