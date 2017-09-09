package hw;

public class CallFB {
    public static void main(String arg[]){
        for(int i = 1; i<100; i++){
            FB fb = new FB();
            System.out.println(fb.getNumber(i));
        }
    }
}


