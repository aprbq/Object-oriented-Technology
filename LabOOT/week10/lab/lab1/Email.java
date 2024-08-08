package week10.lab.lab1;

public class Email implements ToolBox {
        private String emailAddress;
        private String localPart;
        private String domainName;
        private String password;
    
    public Email(String emailAddress, String password) {
        this.emailAddress = emailAddress;
        
        int atIndex = emailAddress.indexOf('@');
        this.localPart = emailAddress.substring(0, atIndex);
        this.domainName = emailAddress.substring(atIndex + 1);
        this.password = password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getLocalPart() {
        return localPart;
    }

    public String getDomainName() {
        return domainName;
    }

    public String getPassword() {
        return password;
    }

    public void getInfo() {
        System.out.println("Email address: " + emailAddress);
        System.out.println("Local Part: " + localPart);
        System.out.println("Domain Name: " + domainName);
    }
}