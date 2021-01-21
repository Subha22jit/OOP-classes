# JCF Assignment 2

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

#### **1. Write a Java program to retrieve an element (at a specified index) from a given array list if index is outside of size then print an exception.**

```java
import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyCustomList a = new MyCustomList();
        for (String s2 : args)
            a.add(Integer.parseInt(s2));
        System.out.print("Enter the index: ");
        int i = sc.nextInt();
        try {
            System.out.println(a.getval(i));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

class MyCustomList extends ArrayList<Integer> {
    ArrayList<Integer> ar;

    MyCustomList() {
        ar = new ArrayList<>();
    }

    void add(int a) {
        this.ar.add(a);
    }

    int getval(int index) throws BoddoBeshiBenrePakaException {
        if (index < 0 || index > (this.ar.size() - 1))
            throw new BoddoBeshiBenrePakaException();
        else
            return this.ar.get(index);
    }
}

class BoddoBeshiBenrePakaException extends Exception {

}
```

Output:  

```bash
> java .\Question5.java
Enter the index: 2
BoddoBeshiBenrePakaException
EXIT: 0
> java .\Question5.java 8 76  1 2
Enter the index: 2
1
```

---

#### **2. Write a program in Java that accepts a shopping list of five items from the command line and stores them in a ArrayList.**

```java
import java.util.*;

public class Question6 {
    public static void main(String[] args) throws Exception {
        if (args.length != 5)
            throw new CartErModdhe5TaItemLagbe();
        else {
            ArrayList<String> as = new ArrayList<>(Arrays.asList(args));
            System.out.println(as);
        }
    }
}

class CartErModdhe5TaItemLagbe extends Exception {

}
```

Output:  

```bash
> java .\Question6.java Begun Potol Alu Sosha Chaal
[Begun, Potol, Alu, Sosha, Chaal]
EXIT: 0
> java .\Question6.java Begun Potol Alu Sosha      
Exception in thread "main" CartErModdhe5TaItemLagbe
        at Question6.main(Question6.java:6)        
EXIT: 1
```

---

#### **3. Modify the program of Question No. 2 to accomplish the following: a) To delete an item in the list b) To add an item at a specified location in the list. c) To add an item at the end of the list. d) To print the contents of the ArrayList.**

```java
import java.util.*;

public class Question7 {
    public static void main(String[] args) throws Exception {
        if (args.length != 5)
            throw new CartErModdhe5TaItemLagbe();
        else {
            ArrayList<String> as = new ArrayList<>(Arrays.asList(args));
            System.out.println(as);
            as.remove(0);
            as.add("Tata");
            as.add(2, "Toto");
            System.out.println(as);
        }
    }
}

class CartErModdhe5TaItemLagbe extends Exception {

}
```

Output:  

```bash
> java .\Question7.java Begun Potol Alu Sosha Chaal
[Begun, Potol, Alu, Sosha, Chaal]
[Potol, Alu, Toto, Sosha, Chaal, Tata]
EXIT: 0
```

---

#### **4. Write a Java program to increment a specific array element by given element.**

```java
import java.util.*;

public class Question8 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(new Integer[] { 10, 20, 30, 40 }));
        System.out.println(al);
        al.set(1, (al.get(1) + al.get(3)));
        System.out.println(al);
    }
}
```

Output:  

```bash
> java .\Question8.java
[10, 20, 30, 40]
[10, 60, 30, 40]
EXIT: 0
```

---

#### **5. Write a Java program to remove the third element from a array list and insert it at the end.**

```java
import java.util.*;

public class Question9 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(new Integer[] { 10, 20, 30, 40 }));
        System.out.println(al);
        al.add(al.get(2));
        al.remove(2);
        System.out.println(al);
    }
}
```

Output:  

```bash
> java .\Question9.java
[10, 20, 30, 40]
[10, 20, 40, 30]
EXIT: 0
```

---

#### **6. Write a Java program to search an element in a array list if not found then return false.**

```java
import java.util.*;

public class Question10 {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(new Integer[] { 10, 20, 30, 40 }));
        System.out.println(al.contains(10));
        System.out.println(al.contains(1));
    }
}
```

Output:  

```bash
> java .\Question10.java
true
false
EXIT: 0
```

---

Made with `Code`, `Love` and `Markdown`  
By [Sayan Kundu](https://github.com/flametron/)  
Github Link: https://github.com/flametron/OOP-classes/blob/master/Assignments/JCFAssignment2.md