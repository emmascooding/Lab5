package Problem5;

import java.util.ArrayList;
import java.util.List;

public class ContactGroup {
    protected String name;
    private final List<Contact> contacts = new ArrayList<>();
    private final List<ContactGroup> children = new ArrayList<>();
    private ContactGroup parent;

    public ContactGroup(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public void addContact(Contact c){
        if (c != null && !contacts.contains(c)){
            contacts.add(c);
        }
    }
    public void addChild(ContactGroup child){
        if (child != null && child != this && !children.contains(child)){
            children.add(child);
            child.parent = this;
        }
    }

    public ContactGroup getParent(){
        return this.parent;
    }
    public String buildGroupReport(){
        StringBuilder sb = new StringBuilder();
        appendReport(sb, 0);
        return sb.toString();
    }
    // Recursive helper: indents subgroups under their parent
    private void appendReport(StringBuilder sb, int depth){
        String indent = "  ".repeat(depth);
        sb.append(indent).append("Group: ").append(name).append(" (").append(contacts.size()).append(" contact(s))\n");
        for (Contact c : contacts){
            sb.append(indent).append("  - ").append(c.getName()).append(" <").append(c.getEmailAddress()).append(">\n");
        }
        for (ContactGroup child : children){
            child.appendReport(sb, depth+1);
        }
    }
}
