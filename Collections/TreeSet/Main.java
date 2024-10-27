import java.util.TreeSet;

public class Main {


    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(20);
        numbers.add(2);
        numbers.add(4);


        for (Integer num : numbers){
            System.out.println(num);
        }



    }

}
