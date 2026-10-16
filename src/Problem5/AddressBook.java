package Problem5;

import java.util.List;
import java.util.ArrayList;

public class AddressBook {
    protected String name;
    private final List<Contact> contacts = new ArrayList<>();
    private List<ContactGroup> contactGroups = new ArrayList<>();

    public AddressBook(String name){
        this.name = name;
    }

    public Contact getContact(){
        return contacts.isEmpty() ? null : contacts.get(0);
    }

    public Contact[] getContacts(){
        return contacts.toArray(new Contact[0]);
    }

    public String getName() {
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }

    public void insertContact(Contact contact){
        addContact(contact);
    }

    public void addContact(Contact c){
        if (c != null && !contacts.contains(c)){
            contacts.add(c);
        }
    }
    public void addContactGroup(ContactGroup g){
        if (g != null && !contactGroups.contains(g)){
            contactGroups.add(g);
        }
    }

    public ContactGroup[] getContactGroups(){
        return contactGroups.toArray(new ContactGroup[0]);
    }
    public String getSummary(){
        StringBuilder sb = new StringBuilder();
        sb.append("Addressbook \"").append(name).append("\": ").append(contacts.size()).append(" contact(s), ").append(contactGroups.size()).append(" group(s)");
        for (Contact c : contacts){
            sb.append("\n  - ").append(c.getContactSummary());
        }
        return sb.toString();
    }

    public Contact findByEmail(String email){
        if (email == null){
            return null;
        }
        for (Contact c : contacts){
            if (email.trim().equalsIgnoreCase(c.getEmailAddress())){
                return c;
            }
        }
        return null;
    }
}
