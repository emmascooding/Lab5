package Problem5;

public class Contact {
    private String emailAddress;
    private String faxNumber;
    private String name;
    private String primaryContactMethod;

    public Contact(String emailAddress, String faxNumber, String name, String primaryContactMethod){
        this.emailAddress=emailAddress;
        this.faxNumber = faxNumber;
        this.name = name;
        this.primaryContactMethod = primaryContactMethod;
    }
    // getters
    public String getEmailAddress(){
        return this.emailAddress;
    }
    public String getFaxNumber(){
        return this.faxNumber;
    }
    public String getName(){
        return this.name;
    }
    public String getPrimaryContactMethod(){
        return this.primaryContactMethod;
    }
    //setters
    public void setEmailAddress(String newEmailAddress){
        this.emailAddress=newEmailAddress;
    }
    public void setFaxNumber(String newFax){
        this.faxNumber=newFax;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public void setPrimaryContactMethod(String newPCM){
        this.primaryContactMethod = newPCM;
    }
    public String getEmailDomain(){
        if (emailAddress == null) { return ""; }
        int at = emailAddress.indexOf('@');
        if (at < 0 || at == emailAddress.length()-1) { return ""; }
        return emailAddress.substring(at + 1).trim().toLowerCase();
    }
    public String getContactSummary(){
        return name + " <" + emailAddress + ">, fax: " + faxNumber + ", preferred: " + primaryContactMethod;
    }

}

