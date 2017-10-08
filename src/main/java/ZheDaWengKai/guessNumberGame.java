package ZheDaWengKai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class guessNumberGame {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        List<Integer> random = new ArrayList<>();
        List<Integer> guess = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        random.add(r.nextInt(10));
        random.add(r.nextInt(10));
        random.add(r.nextInt(10));

//        for(int i = 0; i < 3; i++){
//            int number = (int)(Math.random()*10);
//            if(!random.contains(number)){
//                random.add(number);//if duplicate,only generate one or two elements.
//            }
//        }

        System.out.println(random);

        do{
           guess.add(s.nextInt());
           guess.add(s.nextInt());
           guess.add(s.nextInt());
           System.out.println(guess);

            if (guess.equals(random)) {
                System.out.println("Congratulations!");
            }

            for(Integer guessValue: guess) {
                if (random.contains(guessValue)) {
                    temp.add(guessValue);
                 System.out.println("Right Number: " + temp.size());
                }
//                System.out.println("Right Number: 0");
//                guess.clear();
            }
        }while(random != guess);
    }
}
