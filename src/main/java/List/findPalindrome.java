import java.util.*;

public class findPalindrome {


    public static void main(String[] args) {

        String in="kayak";
        findPalindrome object = new findPalindrome(in);
        System.out.println(object.isPalindrome());
    }
    private String input;
    private Stack<Character> stack = new Stack<Character>();

    public findPalindrome(String str){
        input = str;
        fillStack();
    }

    private void fillStack(){
        for(int i=0; i<input.length(); i++){
            stack.push(input.charAt(i));
        }
    }

    private String buildReverse(){
        StringBuilder result = new StringBuilder();
        while(!stack.empty()){
            result.append(stack.pop());
        }
        return result.toString();
    }

    public boolean isPalindrome(){
        return input.equalsIgnoreCase(buildReverse());
    }
}
