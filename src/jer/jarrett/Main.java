package jer.jarrett;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BankAccount jarrettsAccount = new BankAccount(6969, 139, "Jarrett Lesher", "jarrettlesher2003@gmail.com", "779-123-4567");
        BankAccount buttsAccount = new BankAccount("Buttface", "buttlol@gmail.com", "8172003843");
        System.out.println(buttsAccount.getAccountNumber() + " name " + buttsAccount.getCustomerName());
        System.out.println("Welcome! Please enter your account number to get started.");
        VIPCustomer person1 = new VIPCustomer();
        System.out.println(person1.getCustomerName());

        VIPCustomer person2 = new VIPCustomer("Yo Mama", 25000.00);
        System.out.println(person2.getCustomerName());

        VIPCustomer person3 = new VIPCustomer("Gordon Freeman", 100.00, "gordonfreemanisasexyman@yahoo.com");
        System.out.println(person3.getCustomerName());
        System.out.println(person3.geteMail());

        jarrettsAccount.interactionDistraction(jarrettsAccount.getCustomerName(), jarrettsAccount.geteMail(), jarrettsAccount.getAccountNumber(), jarrettsAccount.getBalance());
    }
}
