# Lab Assignment 1
## Object Oriented Programming

---
### **Name: Sayan Kundu**  
Roll: *67*  
*CSE* Department, *5th* Semester

---
#### **1. Add two numbers by taking input using Command Line input, Scanner class and  BufferedReader class.**
- Command Line input:
  ```java
  class Add{
      public static void main(String[] args) {
          int a = Integer.parseInt(args[0]);
          int b = Integer.parseInt(args[1]);
          int c = a + b;
          System.out.println(c);
      }
  }
  ```
  Output: 
  ```bash
  > java Add.java 1 2
  3
  ```
- Scanner class:
  ```java
  import java.util.Scanner;
  class Add{
      public static void main(String[] args) {
          int a,b,sum;
          Scanner sc = new Scanner(System.in);
          System.out.print("First number: ");
          a=sc.nextInt();
          System.out.print("Second number: ");
          b=sc.nextInt();
          sum=a+b;
          System.out.println(sum);
      }
  }
  ```
  Output: 
  ```bash
  > java Add.java
  First number: 1
  Second number: 2
  3
  ```
- BufferedReader class:
  ```java
  import java.io.*;
  class Add{
      public static void main(String[] args) {
          int a,b,sum;
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          System.out.print("First number: ");
          a= Integer.parseInt(br.readLine());
          System.out.print("Second number: ");
          b= Integer.parseInt(br.readLine());
          sum=a+b;
          System.out.println(sum);
      }
  }
  ```
  Output: 
  ```bash
  > java Add.java
  First number: 1
  Second number: 2
  3
  ```
---
#### **2. Write a program to find Area and Circumference of Cylinder Using Constructors - Keyboard Input or Command Line Input**

```java
import java.lang.Math;

public class Cylinder {
    double radius;
    double height; 
    Cylinder(int radius, int height){
        this.radius=radius;
        this.height=height;
    }

    double getSurfaceArea(){
        return ((2*Math.PI*Math.pow(this.radius,2)) + (2*Math.PI*this.radius*this.height));
    }

    double getVolume(){
        return Math.PI*Math.pow(this.radius,2)*this.height;
    }

    public static void main(String[] args) {
        if(args.length<2){
            System.out.println("Please include parameters in the format: radius height");
            System.exit(0);
        }
        Cylinder c = new Cylinder(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        System.out.printf("Surface Area: %.2f\nVolume: %.2f",c.getSurfaceArea(),c.getVolume());
    }

    
}
```
Output: 
  ```bash
  > java Cylinder.java 2 5
  Surface Area: 87.96
  Volume: 62.83
  ```
---
#### **3. Write a program to find Area and Volume of Cone Using Constructors - Keyboard Input or  Command Line Input.**
```java
import java.lang.Math;

public class Cone {
    double radius;
    double height; 
    Cone(int radius, int height){
        this.radius=radius;
        this.height=height;
    }

    double getSurfaceArea(){
        return ((Math.PI*radius*Math.sqrt(Math.pow(radius,2) + Math.pow(height,2)))+(Math.PI*radius*radius));
    }

    double getVolume(){
        return (Math.PI*Math.pow(radius,2)*height/3);
    }

    public static void main(String[] args) {
        if(args.length<2){
            System.out.println("Please include parameters in the format: radius height");
            System.exit(0);
        }
        Cone c = new Cone(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        System.out.printf("Surface Area: %.2f\nVolume: %.2f",c.getSurfaceArea(),c.getVolume());
    }

    
}
```
Output: 
  ```bash
  > java Cone.java 2 5
  Surface Area: 46.40
  Volume: 20.94
  ```
---
#### **4. Create a class First, make instance variable `int x`, method `void show()` and also put `main()` method inside that class and use the instance variable and method from `main()`.**
```java
public class First {
    int x;
    First(int x){
        this.x=x;
    }
    void show(){
        System.out.println(x);
    }
    
    public static void main(String[] args) {
        First f = new First(1);
        f.show();
    }
}
```
Output:
  ```bash
  > java First.java
  1
```
---
#### **5. Create a class; make its instance variable and method. Use them from `main()`, declared in different class.**
```java
public class Second {
    public static void main(String[] args) {
        Submis s = new Submis(2);
        s.show();
    }
}


class Submis{
    int x;
    Submis(int x){
        this.x=x;
    }
    void show(){
        System.out.println(this.x);
    }
}
```
Output:
```bash
> java Second.java
2
```
---
#### **6. Create a class, make method inside it and pass object as parameter of this method. a) pass  same class’s object, b) pass different class’s object**
```java
class Second {
    public static void main(String args[]) {
        First ob1 = new First();
        Second ob2 = new Second();
        ob1.show(ob1);// pass same class object
        ob1.show(ob2);// pass different class object
    }
}

class First {
    void show(Second ob2) {
        System.out.println(ob2);
    }

    void show(First ob1) {
        System.out.println(ob1);
    }
}
```
Output:
```bash
> java Second.java
First@76a4d6c
Second@517cd4b
```
---
#### **7. Create a class; put a method inside this class which will return a class reference return  same class and/or different class object.**
```java
public class ClassRef {
    static Class returnClass(Object ob) {
        if (ob.getClass() == ClassRef.class)
            System.out.println("Same Class Detected!");
        return ob.getClass();
    }

    Object getNewObject(boolean same) {
        if (same)
            return new ClassRef();
        return new TClass();
    }

    public static void main(String[] args) {
        ClassRef cr = new ClassRef();
        Object ob1 = cr.getNewObject(true);
        Object ob2 = cr.getNewObject(false);
        System.out.println("ROOT " + cr + " FROM " + cr.getClass());
        System.out.println("GEN-1 " + ob1 + " FROM " + ob1.getClass());
        System.out.println("GEN-2 " + ob2 + " FROM " + ob2.getClass());
    }
}

class TClass {

}
```
Output:
```bash
> java ClassRef.java
ROOT ClassRef@1b68b9a4 FROM class ClassRef
GEN-1 ClassRef@4f9a3314 FROM class ClassRef
GEN-2 TClass@3b2c72c2 FROM class TClass  
```
---
#### **8. Write a JAVA Program to make a Student class with proper attributes like roll no, name,  stream, and college.**
```java
package codes;

public class Student {
    String name;
    int roll;
    String stream;
    String college;

    public Student() {
        this.name = "Unknown";
        this.roll = 0;
        this.stream = "N/A";
        this.college = "N/A";
    }

    public Student(String name, int roll, String stream, String college) {
        this.name = name;
        this.roll = roll;
        this.stream = stream;
        this.college = college;
    }

    public String toString() {
        return String.format("Student Name: %s%nRoll No:%d%nStream: %s%nCollege: %s%n", this.name, this.roll,
                this.stream, this.college);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Sayan Kundu",67,"CSE","AoT");
        System.out.println(s1);
        System.out.println(s2);
    }
}
```
Output:
```bash
❯ java Student.java
Student Name: Unknown
Roll No:0
Stream: N/A
College: N/A

Student Name: Sayan Kundu
Roll No:67
Stream: CSE
College: AoT

```
---
#### 9. Design a class to represent a Bank Account. Include the following things:
> **Fields**  
> -Name of the depositor  
> -Account number  
> -Type of account  
> -Balance amount in the account 

> **Methods**  
> -To assign initial values  
> -To deposit an amount  
> -To withdraw an amount after checking balance  
> -To display the name and balance

```java
public class Bank {
    String name, type;
    int acc, bal;

    Bank() {
        name = "N/A";
        type = "N/A";
        acc = 0000;
        bal = 0000;
    }

    Bank(String name, String type, int acc, int bal) {
        this.name = name;
        this.type = type;
        this.acc = acc;
        this.bal = bal;
    }

    void Deposit(int amt) {
        bal = bal + amt;
    }

    void Withdraw(int amt) {
        if (bal > amt)
            bal = bal - amt;
        else
            System.out.println("Insuffient Balance");
    }

    void Display() {
        System.out.println("Name: " + name);
        System.out.println("Balance: " + bal);
    }

    public static void main(String[] args) {
        Bank b = new Bank("Sayan Kundu", "Borolok", 165846, 100000);
        b.Deposit(5000);
        b.Withdraw(2000);
        b.Display();
    }
}
```
Output:
```bash
❯ java Bank.java
Name: Sayan Kundu
Balance: 103000
```