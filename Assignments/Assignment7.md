# Lab Assignment 7

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

#### **1. Write a program to handle the ArithmeticException.**

```java
public class Question1 {
    public static void main(String[] args) {
        int a;
        try{
            //Some Arith Expr
            a=5/0;
        }
        catch(ArithmeticException e){
            System.out.printf("ERROR in : Line %s, %s:%s",e.getStackTrace()[0].getLineNumber(),
            e.getStackTrace()[0].getClassName(),e.getStackTrace()[0].getMethodName());
        }
    }
}
```

Output:  

```bash
> java .\Question1.java
ERROR in : Line 6, Question1:main
EXIT: 0
```

---

#### **2. Write a program for multiple catch to fire ArrayIndexOutOfBoundsException and StringIndexOutOfBoundsException both.**

```java
public class Question2 {
    public static void main(String[] args) {
        int arr[] = { 1, 2 };
        String str = "hello blyat";
        try {
            System.out.println(str.charAt(90));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.printf("String Index out of Bound in : Line %s, %s:%s%n", e.getStackTrace()[0].getLineNumber(),
                    e.getStackTrace()[0].getClassName(), e.getStackTrace()[0].getMethodName());

            try {
                System.out.println(arr[4]);
            } catch (ArrayIndexOutOfBoundsException e2) {
                System.out.printf("Array Index out of Bound in : Line %s, %s:%s%n",
                        e2.getStackTrace()[0].getLineNumber(), e2.getStackTrace()[0].getClassName(),
                        e2.getStackTrace()[0].getMethodName());
            }
        } catch (Exception e) {
            System.out.printf("ERROR in : Line %s, %s:%s%n", e.getStackTrace()[0].getLineNumber(),
                    e.getStackTrace()[0].getClassName(), e.getStackTrace()[0].getMethodName());
        }
    }
}
```

Output:  

```bash
> java .\Question2.java
String Index out of Bound in : Line 48, java.lang.StringLatin1:charAt
Array Index out of Bound in : Line 12, Question2:main
EXIT: 0
```

---

#### **3. Write a program to fire the NegativeArraySize exception.**

```java
public class Question3 {
    public static void main(String[] args) {
        int a[];
        try {
            a = new int[-1];
        } catch (NegativeArraySizeException e) {
            System.out.printf("Negative size in : Line %s, %s:%s", e.getStackTrace()[0].getLineNumber(),
                    e.getStackTrace()[0].getClassName(), e.getStackTrace()[0].getMethodName());
        }
    }
}
```

Output:  

```bash
> java .\Question3.java
Negative size in : Line 5, Question3:main
EXIT: 0
```

---

#### **4. Define an object reference and initialize it to null. Try to call a method through this reference. Now wrap the code in a try-catch clause to catch the exception.**

```java
public class Question4 {
    public static void main(String[] args) {
        StringBuffer sb = null;
        try {
            sb.reverse();
        } catch (NullPointerException e) {
            System.out.printf("NullPointerException in : Line %s, %s:%s", e.getStackTrace()[0].getLineNumber(),
                    e.getStackTrace()[0].getClassName(), e.getStackTrace()[0].getMethodName());
        }
    }
}
```

Output:  

```bash
> java .\Question4.java
NullPointerException in : Line 5, Question4:main
EXIT: 0
```

---

#### **5. Write a program to fire any checked exception manually using ‘throw’ keyword.**

```java
public class Question5 {
    public static void main(String[] args) {
        try {
            System.out.println("THROWING EXCEPTION");
            throw new Exception("NO DESCRIPTION");
        } catch (Exception e) {
            System.out.printf("ERROR in : Line %s, %s:%s%n", e.getStackTrace()[0].getLineNumber(),
                    e.getStackTrace()[0].getClassName(), e.getStackTrace()[0].getMethodName());
            System.out.println(e);
        }
        System.exit(1);
    }
}
```

Output:  

```bash
> java .\Question5.java
THROWING EXCEPTION
ERROR in : Line 5, Question5:main
java.lang.Exception: NO DESCRIPTION
EXIT: 1
```

---

#### **6. Write a program to create a user defined exception named PayOutOfBoundsException (provided the monthly salary of a person is less than Rs. 10,000 /-) and fire the exception.**

```java
public class Question6 {
    public static void main(String[] args) {
        int salary = 1000;
        try {
            if (salary < 10000)
                throw new PayOutOfBoundsException("Tor taka nei");
        } catch (PayOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}

class PayOutOfBoundsException extends Exception {
    PayOutOfBoundsException(String s) {
        super(s);
    }

    public String toString() {
        return String.format("TOR TAKA NEI in : Line %s, %s:%s%n", this.getStackTrace()[0].getLineNumber(),
                this.getStackTrace()[0].getClassName(), this.getStackTrace()[0].getMethodName());
    }
}
```

Output:  

```bash
> java .\Question6.java
TOR TAKA NEI in : Line 6, Question6:main

EXIT: 0
```

---

#### **7. Create a class with two methods, f( ) and g( ). In g( ), throw an exception of a new type that you define. In f( ), call g( ), catch its exception and, in the catch clause, throw a different exception (of a second type that you define). Test your code in main( ).**

```java
public class Question7 {
    public static void main(String[] args) {
        TesterClass tc = new TesterClass();
        try {
            tc.f();
        } catch (SecondException e) {
            System.out.println(e);
        }
    }
}

class TesterClass {
    void f() throws SecondException {
        try {
            g();
        } catch (FirstException e) {
            System.out.println(e);
            throw new SecondException("Second");
        }
    }

    void g() throws FirstException {
        throw new FirstException("FIRST");
    }
}

class FirstException extends Exception {
    FirstException(String s) {
        super(s);
    }

    public String toString() {
        return String.format("PROTHOM EXCEPTION in : Line %s, %s:%s%n", this.getStackTrace()[0].getLineNumber(),
                this.getStackTrace()[0].getClassName(), this.getStackTrace()[0].getMethodName());
    }
}

class SecondException extends Exception {
    SecondException(String s) {
        super(s);
    }

    public String toString() {
        return String.format("DWITIO EXCEPTION in : Line %s, %s:%s%n", this.getStackTrace()[0].getLineNumber(),
                this.getStackTrace()[0].getClassName(), this.getStackTrace()[0].getMethodName());
    }
}
```

Output:  

```bash
> java .\Question7.java
PROTHOM EXCEPTION in : Line 23, TesterClass:g

DWITIO EXCEPTION in : Line 18, TesterClass:f

EXIT: 0
```

---

#### **8. Write a program that takes one string and two integers as command line argument and prints the reverse of the substring of the string specified by the two numbers. The program should handle all possible exception that may arise due to bad input.**

```java
public class Question8 {
    public static void main(String[] args) {
        String str = null;
        int start = 0;
        int end = 0;
        StringBuffer sb = null;
        try {
            str = args[0];
            start = Integer.parseInt(args[1]);
            end = Integer.parseInt(args[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.printf("Input Format: java .\\%s <string> <start> <end>%n", Question8.class.getSimpleName());
            System.exit(0);
        }

        try {
            sb = new StringBuffer(str.substring(start - 1, end));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Indices are wrong, please fix");
            System.exit(0);
        }
        System.out.println(sb.reverse());
    }
}
```

Output:  

```bash
> java .\Question8.java
Input Format: java .\Question8 <string> <start> <end>
EXIT: 0
> java .\Question8.java Hello 2 10
Indices are wrong, please fix
EXIT: 0
> java .\Question8.java Hello 2 3 
le
EXIT: 0
```

---

#### **9. Write a demo program to illustrate ‘throws’ versus method overriding.**

Case 1:
```java
class Super {
    void show1() throws IndexOutOfBoundsException {

    }
}

class Sub extends Super {
    void show1() throws Exception {

    }
}

```

Output:  

```bash
> javac .\Question9.java
.\Question9.java:8: error: show1() in Sub cannot override show1() in Super
    void show1() throws Exception {
         ^
  overridden method does not throw Exception
1 error
EXIT: 1
```

---

Made with `Code`, `Love` and `Markdown`  
By [Sayan Kundu](https://github.com/flametron/)  
Github Link: https://github.com/flametron/OOP-classes/blob/master/Assignments/Assignment7.md