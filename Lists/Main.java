import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        //ADD
        students.add("Amazon");
        students.add("Docker");
        students.add("Bootstrap");
        students.add("Canva");


        //Print
        System.out.println("The items in the list are: ");
        for (String stu : students){
            System.out.println(stu);
        }
        //Remove
        students.remove("Canva");
        System.out.println("The items in the updated list are: ");
        for (String stu : students){
            System.out.println(stu);
        }
        //Update
        students.set(2, "Bandwidth");
        System.out.println("The items in the updated list are: ");
        for (String stu : students){
            System.out.println(stu);
        }

        //Sort
        Collections.sort(students);
        System.out.println("The items in the updated list are: ");
        for (String stu : students){
            System.out.println(stu);
        }
    }
}