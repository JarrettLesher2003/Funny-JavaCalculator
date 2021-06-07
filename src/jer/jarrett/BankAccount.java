package jer.jarrett;

import java.util.Scanner;

// NOTE: this does not account for the use of doubles, so decimals are a no-go. Sorry.
// I'm really lazy and bored right now. I could be putting this effort
// of writing this into changing it because it's a really simple change
// but i couldn't be bothered. ¯\_(ツ)_/¯

public class BankAccount {
    //initialize variables
    private int accountNumber;
    private int balance;
    private String customerName;
    private String eMail;
    private String phoneNumber;

    public BankAccount(){
        this(1000, 0, "Default Name", "Default E-Mail", "Default Phone");
        System.out.println("Empty constructor called.");
    }

    //constructor introduction
    public BankAccount(int accountNumber, int balance, String customerName, String eMail, String phoneNumber) {
        System.out.println("Account constructor with parameters called.");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String eMail, String phoneNumber) {
        this(1000, 100, customerName, eMail, phoneNumber);
        this.customerName = customerName;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
    }

    //initialize scanner
    Scanner scanner = new Scanner(System.in);

    //GET AND SET DECLARED/INITIALIZED VARIABLES
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String geteMail() {
        return eMail;
    }
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String setPhoneNumber() {
        return phoneNumber;
    }

    public void getPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void interactionDistraction(String customerName, String eMail, int accountNumber, int balance) {
        //tests if account number matches
        if(this.accountNumber == scanner.nextInt()) {
            //line below acts as buffer for the enter
            scanner.nextLine();
            System.out.println("Excellent. Now as an additional security, enter your provided e-mail.");
            //checks if e-mail matches
            if (this.eMail.equals(scanner.nextLine())) {
                System.out.println("Hello, " + this.customerName + ". Your current account balance is $" + balance + ". Would you like to deposit, or withdrawl?");

                // i think, and dont quote me on this, that the
                // switch statement below acts as the buffer
                // for the enter key being pressed but honestly
                // i got no clue. any ways, this switch statement
                // checks what the user enters and runs code dependent
                // on that factor.
                switch(scanner.nextLine()) {
                    case "deposit":
                        System.out.println("Excellent, and how much will you be depositing?");
                        int depositNumber = scanner.nextInt();
                        int newBalance = balance + depositNumber;
                        System.out.println("Previous balance is $" + balance + ". You chose to deposit $" + depositNumber + ". New Balance is $" + newBalance + ".");
                        break;
                    case "withdrawl":
                        System.out.println("Great! How much would you like to withdrawl? Current balance is $" + balance + ".");
                        int withdrawlNumber = scanner.nextInt();
                        int newWithdrawlBalance = balance - withdrawlNumber;
                        if(balance < withdrawlNumber) {
                            System.out.println("Sorry, you have too little funds to withdrawl.");
                        } else {
                            System.out.println("You successfully withdrew $" + withdrawlNumber + " and your new account balance is $" + newWithdrawlBalance + ". Thank you for using our service!");
                        } break;
                }// DO NOT FORGET TO CLOSE THE SCANNER!
                scanner.close();

            } // else statement for wrong email
            else {
                System.out.println("Sorry, wrong e-mail inputted. Restart program and type slowly and surely this time.");
            }// else statement for wrong account number
            } else {
            System.out.println("Sorry, wrong account number inputted. Restart program and type correctly this time.");
        }
        }
    }
