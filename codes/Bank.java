import java.util.Random;

public class Bank {
    public static void main(String[] args) {
        Curr_Acct cac = new Curr_Acct("Alom Musk");
        Savn_Acct sac = new Savn_Acct("Horri Puttor");
        System.out.println("DEPOSIT");
        cac.deposit(500); // taka diye die ektu
        sac.deposit(500); // ekeo
        System.out.println("DISPLAY");
        cac.displayBalance();
        sac.displayBalance();
        System.out.println("COMPOUND INTEREST");
        cac.compoundInterest();
        sac.compoundInterest();
        System.out.println("WITHDRAW Rs. 10");
        cac.withdraw(10);
        sac.withdraw(10);
        System.out.println("CHECK MIN BALANCE");
        cac.checkMinBal();
        sac.checkMinBal();
    }

}

abstract class Account {
    String name;
    int number;
    String type;
    double balance;
    double minBalance;
    Random rand = new Random();

    abstract void compoundInterest();

    abstract void cheque();

    void displayBalance() {
        System.out.println(
                "[Name: " + this.name + "][A/C Number: " + this.number + "]" + "Current Balance: " + this.balance);
    }

    void deposit(int n) {
        this.balance += n;
        System.out
                .println("[Name: " + this.name + "][A/C Number: " + this.number + "]" + "New Balance: " + this.balance);
    }

    void checkMinBal() {
        if (this.balance >= 0 && this.balance < this.minBalance)
            this.balance -= 100;
        System.out
                .println("[Name: " + this.name + "][A/C Number: " + this.number + "]" + "New Balance: " + this.balance);
    }

    void withdraw(double amt) {
        this.balance -= amt;
        System.out
                .println("[Name: " + this.name + "][A/C Number: " + this.number + "]" + "New Balance: " + this.balance);
    }

}

class Curr_Acct extends Account {
    Curr_Acct(String name) {
        this.name = name;
        this.number = this.rand.nextInt(100000);
        this.type = "Current";
        this.balance = 0.0;
        this.minBalance = 1000.0;
    }

    void compoundInterest() {
        System.out.println(
                "[Name: " + this.name + "][A/C Number: " + this.number + "]" + "No Interest for Current Accounts");
    }

    void cheque() {
        System.out.println("[Name: " + this.name + "][A/C Number: " + this.number + "]" + "Cheque Available!");
    }

}

class Savn_Acct extends Account {
    Savn_Acct(String name) {
        this.name = name;
        this.number = this.rand.nextInt(100000);
        this.type = "Savings";
        this.balance = 0.0;
        this.minBalance = 0.0;
    }

    void compoundInterest() {
        double am = (this.balance * 4.5 * 1) / 100;
        this.balance += am;
        System.out
                .println("[Name: " + this.name + "][A/C Number: " + this.number + "]" + "New Balance: " + this.balance);
    }

    void cheque() {
        System.out.println("[Name: " + this.name + "][A/C Number: " + this.number + "]" + "Cheque not Available!");
    }

}