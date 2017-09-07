package hw;

public class BuzzCmd {

    public static void main(String args[]) {
       int n=1;
       int m=0;
        for (String s: args) {
            m = Integer.parseInt(s);
     }
        BuzzCmd fb = new BuzzCmd();
        if(m>0){
        fb.getNumber(n,m);}
        else{System.out.println("error");}
    }

    public String getNumber(int n,int m)
    {
        for(n = 1; n<m ; n++){
            if(n%15 == 0 ){
                System.out.println ("fizzbuzz");
            }
            else if(n%5 == 0 ){
                System.out.println ("buzz");
            }
            else if(n%3 == 0 ){
                System.out.println ("fizz");
            }
            else {System.out.println (Integer.toString(n));}
            }
        return null;
    }
}


