//Implement a simple Address Book using ArrayList and HashMap.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Contact {
    private String name;
    private String phoneNumber;
    private String email;

    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String toString() {
        return "Name: " + name + ", Phone: " + phoneNumber + ", Email: " + email;
    }

    public String getName() {
        return name;
    }
}

public class AddressBook {
    private ArrayList<Contact> contactList = new ArrayList<>();
    private HashMap<String, Contact> contactMap = new HashMap<>();

    public void addContact(Contact contact) {
        contactList.add(contact);
        contactMap.put(contact.getName(), contact);
    }

    public void displayAllContacts() {
        for (Contact c : contactList) {
            System.out.println(c);
        }
    }

    public void searchContact(String name) {
        Contact contact = contactMap.get(name);
        if (contact != null) {
            System.out.println("Found: " + contact);
        } else {
            System.out.println("Contact not found.");
        }
    }

    public static void main(String[] args) {
        AddressBook book = new AddressBook();
        Scanner sc = new Scanner(System.in);

        // Sample data
        book.addContact(new Contact("sneha", "8964036549", "Sneha9584@gmail.com"));
        book.addContact(new Contact("Pal", "0987654321", "pal@example.com"));

        System.out.println("All Contacts:");
        book.displayAllContacts();

        System.out.print("\nEnter name to search: ");
        String searchName = sc.nextLine();
        book.searchContact(searchName);
    }
}
