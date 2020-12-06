# Lab Assignment 4

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

#### **1. Show that ordinary block is executed when object is created and also the order of execution of these blocks (for multiple blocks/ inherited block). And 2. Show that static block is executed at the time of class loading and also the order of execution of these blocks (for multiple blocks/ inherited block).**

```java
class maintesting extends sup {
    static {
        System.out.println("Sub Static Block before main()");
        // System.exit(0);
    }
    {
        System.out.println("Sub Instance Block");
    }

    maintesting() {
        super();
        System.out.println("Sub Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Sub class Main()");
        new maintesting();
        System.exit(0);
    }

    static {
        System.out.println("Sub Static Block after main()");
    }
}

class sup {
    sup() {
        System.out.println("Super Constructor");
    }

    {
        System.out.println("Super Instance Block");
    }
    static {
        System.out.println("Super Static Block");
    }
}
```

Output:  

```bash
> java .\maintesting.java
Super Static Block
Sub Static Block before main()
Sub Static Block after main()
Sub class Main()
Super Instance Block
Super Constructor
Sub Instance Block
Sub Constructor
EXIT: 0
```

---

#### **3. Create a class with variable(s) and method(s) (all will be default accessed) under package pOne. Now create a class under package pTwo, which is subclass of firstly created class. In the method here (i.e. class of pTwo) call variable(s) and method(s) of previous class (i.e. class of pOne). If errors come, rectify them. Now from Main (under working directory) access second class’s members.**

.\pOne\C1.java

```java
package pOne;

public class C1 {
    static public int var1 = 10;

    static public void show() {
        System.out.println(var1);
    }
}
```

.\pTwo\C2.java

```java
package pTwo;

import pOne.C1;

public class C2 extends C1 {
    public int var2 = var1 + 10;

    public void show2() {
        System.out.println("EI TOH EKHANE: " + pOne.C1.var1);
        C1.show();
    }
}
```

.\MainRunner.java

```java
public class MainRunner {
    public static void main(String[] args) {
        pTwo.C2 c = new pTwo.C2();
        c.show2();
        System.out.println(c.var2);
    }
}
```

Output:  

```bash
> java .\MainRunner.java
EI TOH EKHANE: 10
10
20
EXIT: 0
```

---

#### **4. Create an interface containing three methods, in a package ‘pkgOne’. Implement the interface from a class under package pkgTwo. From main, under working directory, create object of the class and call methods of interface.**

.\pkgOne\intface.java

```java
package pkgOne;

public interface intface{
    void show1();
    void show2(int a);
    void show3();
}
```

.\pkgTwo\implementation.java

```java
package pkgTwo;

public class implementation implements pkgOne.intface {
    public void show1() {
        System.out.println("SHOWING ONE");
    }

    public void show2(int a) {
        System.out.println(a);
    }

    public void show3() {
        System.out.println("SHOWING LAST");
    }
}
```

.\MainRunner.java

```java
public class MainRunner {
    public static void main(String[] args) {
        pkgTwo.implementation imp = new pkgTwo.implementation();
        imp.show1();
        imp.show2(29);
        imp.show3();
    }
}
```

Output:  

```bash
> java .\MainRunner.java
SHOWING ONE
29
SHOWING LAST
EXIT: 0
```

---

Made with `Code`, `Love` and `Markdown`  
By [Sayan Kundu](https://github.com/flametron/)  
Github Link: https://github.com/flametron/OOP-classes/blob/master/Assignments/Assignment4.md