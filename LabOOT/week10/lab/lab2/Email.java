package week10.lab.lab2;

public class Email {
    private String emailAddress;
    private String localPart;
    private String domainName;
    private String password;

    public Email(String fullName, String domainName, String password) {
        String[] nameParts = fullName.split(" ");
        String lastNameInitial = nameParts[nameParts.length - 1].substring(0, 1).toLowerCase();
        this.localPart = nameParts[0].toLowerCase() + "." + lastNameInitial;
        this.domainName = domainName + ".com";
        this.emailAddress = this.localPart + "@" + this.domainName;
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
        System.out.println("Email: " + emailAddress);
        System.out.println("Local Part: " + localPart);
        System.out.println("Domain Name: " + domainName);
    }
}