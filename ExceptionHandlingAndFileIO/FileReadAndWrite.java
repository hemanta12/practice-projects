import java.io.*;

public class FileReadAndWrite {
    static File file = new File("Names.txt");
    public static void readFile(){
        try( BufferedReader br = new BufferedReader(new FileReader(file))) {
            if (!file.exists()){
                file.createNewFile();
                System.out.println("New file created as it was not found");
            }
            String name;
            while ((name = br.readLine())!=null){
                System.out.println(name);
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void writeToFile( String newName) {
        try(FileWriter fw = new FileWriter(file, true)){
            fw.write(newName + "\n");
            System.out.println("Successfully added: "+ newName+ " to the file");

        }catch(IOException e){
            System.out.println("Error writing to file "+ e.getMessage());
        }
    }
    public static void main(String[] args)  {
        System.out.println("First Read");
        readFile();
        writeToFile("Alex");
        writeToFile("Bobby");

        System.out.println("Second Read");
        readFile();

    }
}
