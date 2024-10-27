//People in line
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    protected Queue<String> line = new LinkedList<>();

    public void addPerson(String name){
        line.offer(name);
        System.out.println(name + " is added to the line");
    }
    public void displayQueue(){
        System.out.println("The current line is: " + line);
    }

    public void servePerson() {
        if (!line.isEmpty()){
            String servedPerson = line.poll();
            System.out.println(servedPerson+ " has been served");
        }else{
            System.out.println("Line is empty");
        }
    }

    public void nextInLine(){
        if (!line.isEmpty()) {
            String nextPerson = line.peek();
            System.out.println("Next Person in line is: " + nextPerson);
        }else{
            System.out.println("Line is empty");
        }
    }



    public static void main(String[] args) {
        Main main = new Main();
        main.addPerson("Alex");
        main.addPerson("Bob");
        main.addPerson("Charles");

        main.displayQueue();

        main.servePerson();
        main.displayQueue();
        main.addPerson("Derek");

        main.nextInLine();
        main.displayQueue();

    }
}