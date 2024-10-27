
public class Main {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        String testStr1 = "Civic";
        String testStr2 = "Hello";

        System.out.println(testStr1 + " is palindrome? " + palindrome.isPalindrome(testStr1));
        System.out.println(testStr2 + " is palindrome? " + palindrome.isPalindrome(testStr2));



    }
}
