package Textbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class buildIndexCall {
    public static void main(String[] args) {
//
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> aMap = (Map<String, Integer>) new buildIndex(scan);
//        buildIndex aMap= new buildIndex(scan);
        int count=0;
        while (scan.nextLine()!=null){
            count = aMap.get(scan.nextLine());
            count++;
        }
        System.out.println(aMap.get(count));
    }
}
