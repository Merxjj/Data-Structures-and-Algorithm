import java.util.Scanner;

class Account {
    String Name;
    String acc_No;
    String acc_Type;
    double bal;

    public Account(String Name, String acc_No, String acc_Type) {
        this.Name = Name;
        this.acc_No = acc_No;
        this.acc_Type = acc_Type;
        this.bal = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            bal += amount;
            System.out.println("Deposit successful. New balance: " + bal);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Current balance: " + bal);
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= bal) {
            bal -= amount;
            System.out.println("Withdrawal successful. New balance: " + bal);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}

class SavAcct extends Account {
    double in_Rate;

    public SavAcct(String Name, String acc_No, double in_Rate) {
        super(Name, acc_No, "Savings");
        this.in_Rate = in_Rate;
    }

    public void computeInterest(int years) {
        double interest = bal * Math.pow(1 + (in_Rate / 100), years) - bal;
        bal += interest;
        System.out.println("Interest computed and added. New balance: " + bal);
    }
}

class CurrAcct extends Account {
    double min_Bal;
    double ser_Charge;

    public CurrAcct(String Name, String acc_No, double min_Bal, double ser_Charge) {
        super(Name, acc_No, "Current");
        this.min_Bal = min_Bal;
        this.ser_Charge = ser_Charge;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && bal - amount >= 0) {
            bal -= amount;
            System.out.println("Withdrawal successful. New balance: " + bal);
            if (bal < min_Bal) {
                bal -= ser_Charge;
                System.out.println("Balance below minimum. Service charge imposed. New balance: " + bal);
            }
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        SavAcct savings = new SavAcct("Alice", "SA123", 5.0);
        savings.deposit(1000);
        savings.displayBalance();
        savings.computeInterest(2);
        savings.withdraw(200);

        System.out.println();
        
        CurrAcct current = new CurrAcct("Bob", "CA456", 500, 50);
        current.deposit(1000);
        current.displayBalance();
        current.withdraw(600); // should trigger service charge if balance falls below minimum
        current.displayBalance();
        
        sc.close();
    }
}
