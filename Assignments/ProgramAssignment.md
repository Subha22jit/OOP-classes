# Program Assignment

## Object Oriented Programming

---

### **Name: Sayan Kundu**  

Roll: **67**  

**CSE** Department, **5th** Semester

[Ran on]  
[java 14.0.2 2020-07-14]  
[Java(TM) SE Runtime Environment (build 14.0.2+12-46)]  
[Java HotSpot(TM) 64-Bit Server VM (build 14.0.2+12-46, mixed mode, sharing)]  
Ran using single source-file program syntax of JDK 11+, unless `javac` is explicitly shown in output:  
`java [options] source-file [args ...]`

---

#### **1. Suppose you have a BankAcc with an initial amount of $50 and you have to add some more amounts to it. Create a class 'AddAmount' with a data member named 'amount' with an initial value of $50. Now make two constructors of this class as follows: i - without any parameter - no amount will be added to the BankAcc ii - having a parameter which is the amount that will be added to BankAcc Create object of the 'AddAmount' class and display the final amount in BankAcc.**

```java
public class Question1 {
    public static void main(String[] args) {
        AddAmount a = new AddAmount();
        AddAmount b = new AddAmount(100);
        System.out.println(a.amt);
        System.out.println(b.amt);
    }
}

public class BankAcc {
    public int amt = 50;

}

public class AddAmount extends BankAcc {
    public int amount = 50;

    AddAmount(int amount) {
        super();
        this.amount = amount;
        super.amt = super.amt + this.amount;
    }

    AddAmount() {

        super();
    }
}
```

Output:  

```bash
> java .\Question1.java
50
150
EXIT: 0
```

---

#### **2. Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it, then the message "I love programming languages" should be printed. If some String is passed to it, then in place of "programming languages" the name of that String variable should be printed. For example, while creating object if we pass "Java", then "I love Java" should be printed.**

```java
public class Question2 {
    public static void main(String[] args) {
        new Programming();
        new Programming("Sleeping");
    }
}

public class Programming {
    Programming() {
        System.out.println("I love programming languages");
    }

    Programming(String lang) {
        System.out.println("I love " + lang);
    }
}
```

Output:  

```bash
> java .\Question2.java
I love programming languages
I love Sleeping
EXIT: 0
```

---

#### **3. Let’s create a bank account. Create a class named 'BankAccount' with the following data members**

1. Name of depositor  
2. Address of depositor  
3. Type of account  
4. Balance in account  
5. Number of transactions  

Class 'BankAccount' has a method for each of the following

1. Generate a unique account number for each depositor for first depositor, account number will be BA1000, for second depositor it will be BA1001 and so on  
2. Display information and balance of depositor  
3. Deposit more amount in balance of any depositor  
4. Withdraw some amount from balance deposited  
5. Change address of depositor  

After creating the class, do the following operations

1. Enter the information (name, address, type of account, balance) of the depositors. Number of depositors is to be entered by user.  
2. Print the information of any depositor.  
3. Add some amount to the account of any depositor and then display final information of that depositor  
4. Remove some amount from the account of any depositor and then display final information of that depositor  
5. Change the address of any depositor and then display the final information of that depositor  
6. Randomly repeat these processes for some other bank accounts and after that print the total number of transactions.  

```java
import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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

enum Account {
    CURRENT, SAVINGS, RECURRING
};

class BankAccount {
    public String name, address, acnumber;

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

        int r, p;

        r = (int) amt;
        p = (int) ((amt * 100) - (r * 100));

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

}
```

Output:  

```bash
> java .\Question3.java
Enter to continue

[INSTRUCTION] Create Two Bank Accounts
Name: John Doe, Account Number: BA1000
Type: CURRENT
Between Heaven and Hell
Balance: 0.0
Transctions Recorded:0
Name: Sayan Kundu, Account Number: BA1001
Type: RECURRING
Definately Hell
Balance: 0.0
Transctions Recorded:0
Enter to continue

[INSTRUCTION] Display information of any account
Name: Sayan Kundu, Account Number: BA1001
Type: RECURRING
Definately Hell
Balance: 0.0
Transctions Recorded:0
Enter to continue

[INSTRUCTION] Deposit Money
Name: Sayan Kundu, Account Number: BA1001
Type: RECURRING
Definately Hell
Balance: 10000.50
Transctions Recorded:1
Enter to continue

[INSTRUCTION] Withdraw
Name: Sayan Kundu, Account Number: BA1001
Type: RECURRING
Definately Hell
Balance: 9000.25
Transctions Recorded:2
Enter to continue

[INSTRUCTION] Address Change
Name: John Doe, Account Number: BA1000
Type: CURRENT
Notun Hell e eseche
Balance: 0.0
Transctions Recorded:0
Enter to continue

[INSTRUCTION] Repeat and Total Transactions
Total Transactions: 4
EXIT: 0
```

---

Made with `Code`, `Love` and `Markdown`  
By [Sayan Kundu](https://github.com/flametron/)  
Github Link: https://github.com/flametron/OOP-classes/blob/master/Assignments/ProgramAssignment.md