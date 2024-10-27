import java.util.HashMap;

public class PhoneBook {

    protected HashMap<String, String> phoneBook = new HashMap<>();

    public void addEntry(String name, String number){
        this.phoneBook.put(name, number);
    }

    public void deleteEntry(String name){
        this.phoneBook.remove(name);
    }

    public String searchFor (String name) {
        return this.phoneBook.getOrDefault(name, "Entry not found");
    }

    public void displayEntries(){
        for (String key: phoneBook.keySet()){
            System.out.println(key +" "+ phoneBook.get(key));
        }
    }
}
