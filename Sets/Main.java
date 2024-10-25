import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String [] name = {"Alex", "Bob", "Charles", "Bob", "Alex", "Diana"};

        HashSet <String> uniqueNames = new HashSet<>();
        for (String str: name){
            uniqueNames.add(str);
        }

        String[] newArray = uniqueNames.toArray(new String[0]);
        Arrays.sort(newArray);
        for (Object n: newArray){
            System.out.println(n);
        }
    }
}
