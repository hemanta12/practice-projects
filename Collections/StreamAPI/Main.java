//Filtering out odd numbers and squaring the remaining even numbers
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 10, 1, 11,20);

        nums.stream()
                .filter(n-> n%2 == 0)
                .map(n->n*n)
                .forEach(System.out::println);


    }
}