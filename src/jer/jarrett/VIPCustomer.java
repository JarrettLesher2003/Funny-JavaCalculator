package jer.jarrett;

public class VIPCustomer {
    private String customerName;
    private double creditLimit;
    private String eMail;

    public VIPCustomer() {
        this("Default Name", 50000.00, "default@gmail.com");
    }

    public VIPCustomer(String customerName, double creditLimit) {
        this(customerName, creditLimit, "unknown@gmail.com");
    }

    public VIPCustomer(String customerName, double creditLimit, String eMail) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.eMail = eMail;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String geteMail() {
        return eMail;
    }
}
