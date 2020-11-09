# Lab Assignment 1

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

#### **1. Create a class and test if method overloading holds good for return type of method or not.**

```java
public class Test {
    int getValue() {
        return 1;
    }

    double getValue() {
        return 2.0;
    }

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.getValue());
    }
}
```

Output:  

```bash
> java .\Test.java
.\Test.java:6: error: method getValue() is already defined in class Test
    double getValue() {
           ^
1 error
error: compilation failed
```

**Working:**  

```java
public class Test {
    int getValue() {
        return 1;
    }

    double getValue(double v) {
        return v;
    }

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.getValue());
    }
}
```

Output:  

```bash
> java .\Test.java
1
```

---

#### **2. Overload the constructors for class Box for cube and cone and also display its volume. AND 3. Do the problem 2 for method overloading.**

```java
public class Box {
    int h, r;
    boolean isCube;

    Box(int h) {
        this.h = h;
        this.isCube = true;
    }

    Box(int r, int h) {
        this.r = r;
        this.h = h;
        this.isCube = false;
    }

    double getVolume(boolean chck) {
        return 0.00;
    }

    double getVolume() {
        return this.isCube ? Math.pow(this.h, 3) : Math.PI * Math.pow(this.r, 2) * (this.h / 3);
    }

    public static void main(String[] args) {
        Box cube = new Box(2);
        Box cone = new Box(2, 3);
        System.out.println("Cube : " + String.format("%.2f", cube.getVolume()));
        System.out.println("Cone : " + String.format("%.2f", cone.getVolume()));
        System.out.println("Nulled : " + String.format("%.2f", cone.getVolume(true)));

    }
}
```

Output:

```bash
> java .\Box.java
Cube : 8.00
Cone : 12.57
Nulled : 0.00
```

---

#### **4. Create a class EMP having instance variable name and id. Create its subclass (say Scientist)  which has instance variable no_of_publication and experience. Now create its subclass, say  Dscientist which has instance variable award. Put a method: public String toString () { } in every  class where you describe about the class and from main create object of each class and print each  object.**

```java
public class EMP {
    String name;
    int id;

    EMP(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return String.format("[%s Class] Name: %s, ID: %d",
                this.getClass().getEnclosingClass() == null ? this.getClass().getSimpleName()
                        : this.getClass().getEnclosingClass().getSimpleName(),
                this.name, this.id);
    }

    public static void main(String[] args) {
        EMP e = new EMP("Sayan Kundu", 1);
        Scientist s = new Scientist("Sayan Kundu", 1, 999999, "Expert");
        Dscientist d = new Dscientist("Sayan Kundu", 1, 999999, "Expert", "Professional Scientist");
        System.out.println(e);
        System.out.println(s);
        System.out.println(d);
    }
}

class Scientist extends EMP {
    int no_of_publication;
    String experience;

    Scientist(String name, int id, int no_of_publication, String experience) {
        super(name, id);
        this.no_of_publication = no_of_publication;
        this.experience = experience;
    }

    public String toString() {
        return super.toString() + String.format(" > [%s Class] No. of publications: %d, Experience: %s",
                this.getClass().getSimpleName(), this.no_of_publication, this.experience);
    }
}

class Dscientist extends Scientist {

    String award;

    Dscientist(String name, int id, int no_of_publication, String experience, String award) {
        super(name, id, no_of_publication, experience);
        this.award = award;
    }

    public String toString() {
        return super.toString() + String.format(" > [%s Class] Award: %s", this.getClass().getSimpleName(), this.award);
    }
}
```

Output:

```bash
> java .\EMP.java
[EMP Class] Name: Sayan Kundu, ID: 1
[Scientist Class] Name: Sayan Kundu, ID: 1 > [Scientist Class] No. of publications: 999999, Experience: Expert
[Dscientist Class] Name: Sayan Kundu, ID: 1 > [Dscientist Class] No. of publications: 999999, Experience: Expert >
[Dscientist Class] Award: Professional Scientist
```

---

#### **5. Create a class with a method void show () and make 3 subclasses of it and all subclasses have  void show () method overridden and call those methods using their class references. AND 6. Do the problem 5 using dynamic method dispatching.**

```java
public class ShowMe {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please supply question number! ");
            return;
        }
        if (Integer.parseInt(args[0]) == 6) {
            Master m1 = new Master();
            m1.show();
            m1 = new Slave1();
            m1.show();
            m1 = new Slave2();
            m1.show();
            m1 = new Slave3();
            m1.show();
        } else if (Integer.parseInt(args[0]) == 5) {
            Master m1 = new Master();
            Slave1 s1 = new Slave1();
            Slave2 s2 = new Slave2();
            Slave3 s3 = new Slave3();
            m1.show();
            s1.show();
            s2.show();
            s3.show();
        } else
            System.out.println("Use 5 for Question 5 or 6 for Question 6.");
    }

}

class Master {
    void show() {
        System.out.println("Showing from Master " + this.getClass().getSimpleName());
    }
}

class Slave1 extends Master {
    void show() {
        System.out.println("Showing from Slave #1 " + this.getClass().getSimpleName());
    }
}

class Slave2 extends Master {
    void show() {
        System.out.println("Showing from Slave #2 " + this.getClass().getSimpleName());
    }
}

class Slave3 extends Master {
    void show() {
        System.out.println("Showing from Slave #3 " + this.getClass().getSimpleName());
    }
}
```

Outputs:  
Run for question 5:  

```bash
> java .\ShowMe.java 5
Showing from Master Master
Showing from Slave #1 Slave1
Showing from Slave #2 Slave2
```

Run for question 6:

```bash
> java .\ShowMe.java 6
Showing from Master Master
Showing from Slave #1 Slave1
Showing from Slave #2 Slave2
Showing from Slave #3 Slave3
```
