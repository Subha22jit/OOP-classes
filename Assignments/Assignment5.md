# Lab Assignment 5

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

#### **1. Create an interface named Shape with a field pie (=3.14). Create two subclasses of it named Circle and Rectangle create object of the two classes and calculate their area.**

```java
public class Question1 {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(5, 10);
        System.out.printf("Circle: %.2f%nRectangle: %.2f%n", c.area(), r.area());
    }
}

public interface Shape {
    float pi = 3.14F;

    float area();
}

public class Circle implements Shape {
    float radius;

    Circle(float radius) {
        this.radius = radius;
    }

    Circle() {
        this.radius = 0.0F;
    }

    public float area() {
        return pi * this.radius * this.radius;
    }
}

public class Rectangle implements Shape {
    float width;
    float length;

    Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    Rectangle() {
        this.length = 0.0F;
        this.width = 0.0F;
    }

    public float area() {
        return this.length * this.width;
    }
}
```

Output:  

```bash
> java .\Question1.java
Circle: 78.50
Rectangle: 50.00
EXIT: 0
```

---

#### **2. Create a class which contains an inner class. Show that inner class can use member of outer class directly, but Outer class can use member of Inner class only through its object. Check the name of class file, you created.**

```java
public class Question2 {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.show();
        Outer.Inner i = new Outer().new Inner();
        i.show();
    }
}

class Outer {
    int outerVal = 2;

    void show() {
        System.out.printf("[OT] Outer Class Value: %d%n", outerVal);
        System.out.printf("Inner Class Static Value: %d%n", Inner.innerValStatic);
        System.out.printf("Inner Class Instance Value: %d%n", new Inner().innerValInstance);
    }

    class Inner {
        static final int innerValStatic = 3;
        int innerValInstance = 1;

        void show() {
            System.out.printf("[IN] Inner Class Value: %d%nOuter Class Value: %d%n", innerValStatic, outerVal);
        }
    }
}

```

Output:  

```bash
> java .\Question2.java
[OT] Outer Class Value: 2
Inner Class Static Value: 3
Inner Class Instance Value: 1
[IN] Inner Class Value: 3
Outer Class Value: 2
EXIT: 0
```

---

#### **3. Create two interfaces, each with two methods. Inherit a new interface from the two, adding a new method. Create a class by implementing the new interface and also inheriting from a concrete class. In main (), create an object of derived class and call the methods. [do all without package statement]**

```java
public class Question3 {
    public static void main(String[] args) {
        WorkingClass wc = new WorkingClass();
        wc.show1();
        wc.show2();
        wc.show3(1000);
        wc.show4();
        wc.showConcOut();
    }
}

interface Inner1 {
    void show1();

    void show2();
}

interface Inner2 {
    void show3(int a);

    void show4();
}

interface OuterInt extends Inner1, Inner2 {

}

class ConcreteOuter {
    int val = 10;

    void showConcOut() {
        System.out.println("Concrete Outer Class here");
    }
}

class WorkingClass extends ConcreteOuter implements OuterInt {
    public void show1() {
        System.out.println("Showing 1");
    }

    public void show2() {
        System.out.println("Showing 2");
    }

    public void show3(int a) {
        System.out.printf("Showing 3 %d%n", a);
    }

    public void show4() {
        System.out.println("Showing 4");
    }
}
```

Output:  

```bash
> java .\Question3.java
Showing 1
Showing 2
Showing 3 1000
Showing 4
Concrete Outer Class here
EXIT: 0
```

---

#### **4. Write a program to demonstrate anonymous inner class (using super class and interface)**

```java
public class Question4 {
    public static void main(String[] args) {
        Quuu q = new Quuu() {
            public void show() {
                System.out.println("SHowing");
            }
        };
        q.show();

        SHO s = new SHO() {
            void display() {
                super.display();
                System.out.println("Showing 2");
            }

        };
        s.display();
    }
}

interface Quuu {
    void show();
}

class SHO {
    void display() {
        System.out.println("Showing 1");
    }
}
```

Output:  

```bash
> java .\Question4.java
SHowing
Showing 1
Showing 2
EXIT: 0
```

---

Made with `Code`, `Love` and `Markdown`  
By [Sayan Kundu](https://github.com/flametron/)  
Github Link: https://github.com/flametron/OOP-classes/blob/master/Assignments/Assignment5.md