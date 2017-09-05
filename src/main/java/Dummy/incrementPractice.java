package Dummy;
import static java.lang.System.out;

/**
 * Created by ywang83 on 9/5/2017.
 */
public class incrementPractice {
    public static void main(String args[]){
        int i=10;

        out.println(i++); //10
        out.println(--i); //10

        --i;
        i--;
        out.println(i); //8
        out.println(++i);//9
        out.println(i--);//9
        out.println(i);//8

        i++;
        i=i++ + i++;
        out.println(i);//19
        i=i++ + i++;
        out.println(i);//39
    }
}
