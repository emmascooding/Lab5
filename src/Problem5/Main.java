package Problem5;

public class Main {
    public static void main(String[] args){
        Account acc = new Account("Imane.SINDI@um6p.ma", "   Imane    Sindi");
        AddressBook book = new AddressBook("Work");
        acc.addAddressBook(book);

        Contact a = new Contact("mariam@um6p.ma", "111", "Mariam", "email");
        Contact b = new Contact("Yasmin@gmail.com", "222", "Yasmin", "fax");
        Contact c = new Contact("Nissrine@um6p.ma", "333", "Nissrine", "email");

        book.addContact(a);
        book.addContact(b);
        book.addContact(c);

        ContactGroup friends = new ContactGroup("Friends");
        ContactGroup close = new ContactGroup("Close friends");
        friends.addContact(a);
        friends.addChild(close);
        close.addContact(b);
        close.addContact(c);
        book.addContactGroup(friends);

        System.out.println("Full name: [" + acc.getFullName() + "]");
        System.out.println(book.getSummary());
        System.out.println("findByEmail(mariam@um6p.ma): " + book.findByEmail("mariam@um6p.ma").getName());
        System.out.println("findByEmail(x@y.z): " + book.findByEmail("x@y.z"));
        System.out.println("Domains:");
        acc.printAllContactDomains();
        System.out.print(friends.buildGroupReport());
    }
}
