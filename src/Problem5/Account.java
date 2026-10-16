package Problem5;

import java.util.ArrayList;
import java.util.List;

public class Account {
    protected String emailAddress;
    protected String name;
    private final List<AddressBook> addressBooks = new ArrayList<>();

    public Account(String emailAddress, String name){
        this.emailAddress = emailAddress;
        this.name = name;
    }
    public String getEmailAddress() { return this.emailAddress; }
    public String getName(){ return this.name; }
    public void setEmailAddress(String newEmailAddress){ this.emailAddress = newEmailAddress; }
    public void setName(String newName){ this.name = newName; }

    public AddressBook[] getAddressBooks(){ return addressBooks.toArray(new AddressBook[0]); }

    public void addAddressBook(AddressBook book){
        if (book != null && !addressBooks.contains(book)){
            addressBooks.add(book);
        }
    }

    // Prints each distinct email domain found in all contacts of all address books
    public void printAllContactDomains() {
        for (AddressBook book : addressBooks) {
            for (Contact c : book.getContacts()) {
                String domain = c.getEmailDomain();
                if (!domain.isEmpty()) {
                    System.out.println(domain);
                }
            }
        }
    }
    public String getFullName(){
        // "firstName lastName" trimmed
        return name==null ? "" : name.trim().replaceAll(" {2,}", " ");
    }

}
