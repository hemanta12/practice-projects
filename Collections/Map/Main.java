public class Main {

    public static void main(String[] args) {
        PhoneBook newPhoneBook = new PhoneBook();

        //Adding entries to phonebook
        newPhoneBook.addEntry("Alex", "415-111-1111");
        newPhoneBook.addEntry("Craig", "415-222-2222");

        //Printing the current phoneBook
        System.out.println("Entries in phoneBook: " );
       newPhoneBook.displayEntries();

        //Deleting entries from phoneBook
        newPhoneBook.deleteEntry("Craig");
        System.out.println("Entries in phoneBook after deleting: " );
        newPhoneBook.displayEntries();

        //Searching for an entry from a key
        System.out.println("Entry found for Alex: " + newPhoneBook.searchFor("Alex"));

    }
}