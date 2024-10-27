//Palindrome Checker

import java.util.Deque;
import java.util.LinkedList;

public class Palindrome {
    public static boolean isPalindrome(String str){
        Deque<Character> deque = new LinkedList<>();

        for (char ch: str.toLowerCase().toCharArray()){
            deque.add(ch);
        }

        //Check chars from both end
        while (deque.size()>1){
            char front = deque.removeFirst();
            char back = deque.removeLast();

            if (front!= back){
                return false;
            }
        }
        return true;
    }
}
