# Lab Assignment 3

## Object Oriented Programming

---

### **Name: Sayan Kundu**  

Roll: **67**  

**CSE** Department, **5th** Semester

[Ran on]  
[java 14.0.2 2020-07-14]  
[Java(TM) SE Runtime Environment (build 14.0.2+12-46)]  
[Java HotSpot(TM) 64-Bit Server VM (build 14.0.2+12-46, mixed mode, sharing)]  
Ran using single source-file program syntax of JDK 11+ :  
`java [options] source-file [args ...]`

---

#### **1. Check without having any abstract method/s whether a class can be abstract; if so, then use  that concrete method/s from another class having main method.**

```java

public class temp {
    public static void main(String[] args) {
        A.display();
    }
}

abstract class A {
    static void display() {
        System.out.println("Hello World");
    }
}
```

Output:  

```bash
> java .\temp.java
Hello World
```

---

#### **2. Create an abstract class with three abstract methods check whether you can we override only  few methods (not all methods) in subclass or not.**

```java
public class AbsClass extends Parent {
    void show1() {
        System.out.println("Modified Show 1");
    }

    // void show2() {
    //     System.out.println("Modified Show 2");
    // }

    public static void main(String[] args) {
        AbsClass abc = new AbsClass();
        abc.show1();
        abc.show2();
        abc.show3();
    }
}

abstract class Parent {
    abstract void show1();

    abstract void show2();

    void show3() {
        System.out.println("Original Show 3");
    }
}
```

Output:

```bash
> java .\AbsClass.java
.\AbsClass.java:1: error: AbsClass is not abstract and does not override abstract method show2() in Parent
public class AbsClass extends Parent {
       ^
1 error
error: compilation failed
```

**Working:**  

```java
public class AbsClass extends Parent {
    void show1() {
        System.out.println("Modified Show 1");
    }

    void show2() {
        System.out.println("Modified Show 2");
    }

    public static void main(String[] args) {
        AbsClass abc = new AbsClass();
        abc.show1();
        abc.show2();
        abc.show3();
    }
}

abstract class Parent {
    abstract void show1();

    abstract void show2();

    void show3() {
        System.out.println("Original Show 3");
    }
}
```

Output:

```bash
> java .\AbsClass.java
Modified Show 1
Modified Show 2
Original Show 3
```

---

#### **3. Assume that a bank maintains two kinds of account for its customers, one called savings account and other called current account. The savings account provides compound interest and  withdrawal facilities but no cheque book facility. The current account provides cheque book  facility but no interest. Current account holders should also maintain a minimum balance (say  Rs. 1000) and if the balance falls below this level a service charge is imposed (say Rs. 100).**

Create a class `Account` that stores customer name, account number and type of account. From  this class derive two classes `Curr_Acct` and `Savn_Acct` respectively to make them more specific  to their requirements. Include the necessary methods to achieve the following tasks:  
a. Accept deposit from a customer and update the balance.  
b. Display the balance.  
c. Compute and deposit interest.  
d. Permit withdrawal and update the balance.  
e. Check for minimum balance, impose penalty, if necessary, and update the balance.  Use constructors to initialize the class members.

```java
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
```

Output:

```bash
> java .\Bank.java
DEPOSIT
[Name: Alom Musk][A/C Number: 52014]New Balance: 500.0   
[Name: Horri Puttor][A/C Number: 57278]New Balance: 500.0
DISPLAY
[Name: Alom Musk][A/C Number: 52014]Current Balance: 500.0
[Name: Horri Puttor][A/C Number: 57278]Current Balance: 500.0
COMPOUND INTEREST
[Name: Alom Musk][A/C Number: 52014]No Interest for Current Accounts
[Name: Horri Puttor][A/C Number: 57278]New Balance: 522.5
WITHDRAW Rs. 10
[Name: Alom Musk][A/C Number: 52014]New Balance: 490.0
[Name: Horri Puttor][A/C Number: 57278]New Balance: 512.5
CHECK MIN BALANCE
[Name: Alom Musk][A/C Number: 52014]New Balance: 390.0
[Name: Horri Puttor][A/C Number: 57278]New Balance: 512.5
```

---

Made with `Code`, `Love` and `Markdown`  
By [Sayan Kundu](https://github.com/flametron/)  
Github Link: https://github.com/flametron/OOP-classes/blob/master/Assignments/Assignment3.md