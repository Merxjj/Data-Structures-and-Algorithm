/* A bank maintains two kinds of accounts - Savings Account and Current Account. 
The savings account provides compound interest, deposit and withdrawal facilities.
 The current account only provides deposit and withdrawal facilities. Current account 
 holders should also maintain a minimum balance. If balance falls below this level, a
  service charge is imposed. Create a class Account that stores customer name, account number,
  
  and type of account. From this derive the classes Curr-acct and Sav-acct. Include the necessary 
  methods in order to achieve the following tasks. 
a) Accept deposit from a customer and update the balance. 
b) Display the balance. 
c) Compute interest and add to balance. 

Permit withdrawal and update the balance (Check for the minimum balance, impose penalty if necessary).
A super class Record has been defined to store the names and ranks of 50 students. Define a
 sub class Rank to find the highest rank along with the name. The details of both classes are given below:


Class name : Record
Data Members / instance variables:
name[ ] : to store the names of students
rnk[ ] : to store the ranks of students


Member functions:
Record() : constructor to initialize data members
void readvalues() : to store names and ranks
void display() : displays the names and the corresponding ranks


Class name : Rank
Data Members / instance variables:
index : integer to store the index of the topmost rank


Member functions
Rank() : constructor to invoke the base class constructor and to initialize index to 0.
void highest() : finds the index location of the topmost rank and stores it in index without 

sorting the array 6
void display() : displays the name and ranks along with the name having the topmost rank.


Specify the class Record giving details of the constructor(), void readvalues(), void display().
 Using the concept of inheritance, specify the class Rankgiving details of constructor(), void
  highest() and void display().*/

  // Base class for Accounts
class Account {
    String name;
    int accNo;
    String accType;
    double balance;

    public Account(String name, int accNo, String accType, double balance) {
        this.name = name;
        this.accNo = accNo;
        this.accType = accType;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ". New balance: " + balance);
    }

    public void displayBalance() {
        System.out.println("Account Holder: " + name + ", Account Number: " + accNo + ", Balance: " + balance);
    }
}

// Savings Account class
class SavAcct extends Account {
    double interestRate;

    public SavAcct(String name, int accNo, double balance, double interestRate) {
        super(name, accNo, "Savings", balance);
        this.interestRate = interestRate;
    }

    public void computeInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest of " + interest + " added. New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

// Current Account class
class CurrAcct extends Account {
    double minBalance;
    double serviceCharge;

    public CurrAcct(String name, int accNo, double balance, double minBalance, double serviceCharge) {
        super(name, accNo, "Current", balance);
        this.minBalance = minBalance;
        this.serviceCharge = serviceCharge;
    }

    public void withdraw(double amount) {
        if (balance - amount < minBalance) {
            balance -= (amount + serviceCharge);
            System.out.println("Withdrew " + amount + ", below minimum balance. Imposed service charge of " + serviceCharge + ". New balance: " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
        }
    }
}

// Main method to test Bank Account system
public class Bank {
    public static void main(String[] args) {
        // Savings Account example
        SavAcct savings = new SavAcct("Alice", 12345, 2000, 0.04);
        savings.deposit(500);
        savings.computeInterest();
        savings.withdraw(1000);
        savings.displayBalance();

        // Current Account example
        CurrAcct current = new CurrAcct("Bob", 67890, 1500, 1000, 100);
        current.deposit(500);
        current.withdraw(600);
        current.withdraw(900);
        current.displayBalance();
    }
}





