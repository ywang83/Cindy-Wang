package ZheDaWengKai;

public class CountDown {
    public static void main (String[] args){
        int count =100;
//        while (count>0){
//            System.out.println(count);
//            count--; // count = count-1;
//        }
        do{
            System.out.println(count);
            count--;
        }while (count>0);
        System.out.println(count);
        System.out.println("发射！");
    }
}
