package ZheDaWengKai;//package Search;

import java.util.ArrayList;

public class prime50 {
	
	    public static void main(String[] args) {
	    	
	        ArrayList<Integer> subA= new ArrayList<Integer>(getArrayList().subList(0, 50));
	        System.out.print(subA);
	    }
	    	
	    public static ArrayList<Integer> getArrayList (){
	    	ArrayList<Integer> a = new ArrayList(); 
	    	
	        for (int i=2; i<300; i++){
	        	 int isPrime=1;
	        for (int j=2; j<i; j++){
	            if (i%j==0){
	                isPrime=0;
	          }
	        }
	            	if(isPrime==1){	
	            		 a.add(i);
	            }
	        }
			return a;	
	   }
}     

