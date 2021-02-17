import java.util.*;

public class BankAccount {
    public String name, address, acnumber;

    enum Account {
        CURRENT, SAVINGS, RECURRING
    };

    public Account type;
    private int balRup;
    private int balPaise;
    public int noTransc;
    static int i = 0;

    BankAccount(String name, String address, Account type) {
        this.name = name;
        this.address = address;
        this.type = type;
        this.acnumber = generate();
        this.balRup = this.balPaise = this.noTransc = 0;
    }

    BankAccount() {
        this("John Doe", "Between Heaven and Hell", Account.CURRENT);
    }

    String generate() {
        return "BA" + (1000 + i++);
    }

    boolean success() {

        this.noTransc++;
        return true;
    }

    public String toString() {
        return String.format("Name: %s, Account Number: %s%nType: %s%n%s%nBalance: %d.%d%nTransctions Recorded:%d",
                this.name, this.acnumber, this.type, this.address, this.balRup, this.balPaise, this.noTransc);
    }

    void display() {
        System.out.println(this);
    }

    boolean deposit(double amt) {
        // String tmp = String.format("%.2f", amt);
        // System.out.println(tmp);
        // System.out.println(tmp.split(".")[0]);
        int r, p;
        // r = Integer.parseInt(tmp.split(".")[0]);
        // p = Integer.parseInt(tmp.split(".")[1]);
        r = (int) amt;
        p = (int) ((amt * 100) - (r * 100));
        // System.out.println("DEBUG: " + p);
        this.balPaise = this.balPaise + p;
        if (this.balPaise > 100) {
            this.balPaise = this.balPaise % 100;
            this.balRup = this.balRup + (this.balPaise / 100);
        }
        this.balRup = this.balRup + r;
        return success();
    }

    boolean withdraw(double amt) {
        double bal = Double.parseDouble(String.format("%d.%d", this.balRup, this.balPaise));
        if ((bal - amt) < 0)
            return false;
        amt = bal - amt;
        int r, p;
        // r = Integer.parseInt(tmp.split(".")[0]);
        // p = Integer.parseInt(tmp.split(".")[1]);
        r = (int) amt;
        p = (int) ((amt * 100) - (r * 100));
        this.balPaise = p;
        this.balRup = r;
        return success();
    }

    boolean changeAddress(String newAddress) {
        this.address = newAddress;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // BankAccount b = new BankAccount();
        // System.out.println(b);
        // b.deposit(1000.00);
        // b.deposit(1000.250000);
        // System.out.println(b);
        // b.withdraw(1000);
        // System.out.println(b);
        // System.out.println("CUTSOM WITHDRAW STATUS: " + b.withdraw(2000));
        // System.out.println(b);
        int step = 0;
        BankAccount b1 = null;
        BankAccount b2 = null;
        while (step < 6) {
            System.out.println("Enter to continue");
            String tmp = sc.nextLine();
            step++;
            switch (step) {
                case 1:
                    System.out.println("[INSTRUCTION] Create Two Bank Accounts");
                    b1 = new BankAccount();
                    b2 = new BankAccount("Sayan Kundu", "Definately Hell", Account.RECURRING);
                    System.out.println(b1);
                    System.out.println(b2);
                    break;
                case 2:
                    System.out.println("[INSTRUCTION] Display information of any account");
                    System.out.println(b2);
                    break;
                case 3:
                    System.out.println("[INSTRUCTION] Deposit Money");
                    b2.deposit(10000.50);
                    System.out.println(b2);

                    break;
                case 4:
                    System.out.println("[INSTRUCTION] Withdraw");
                    b2.withdraw(1000.25);
                    System.out.println(b2);
                    break;
                case 5:
                    System.out.println("[INSTRUCTION] Address Change");
                    b1.changeAddress("Notun Hell e eseche");
                    System.out.println(b1);
                    break;
                case 6:
                    System.out.println("[INSTRUCTION] Repeat and Total Transactions");
                    b1.deposit(10.00);
                    b1.deposit(20.00);
                    System.out.println("Total Transactions: " + (b1.noTransc + b2.noTransc));
            }
        }
    }
}
