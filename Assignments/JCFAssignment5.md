# JCF Assignment 5

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

#### **1. Given an element write a program to check if element exists in HashSet or not.**

```java
import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        HashSet<Integer> HS = new HashSet<>();
        HS.add(10);
        HS.add(20);
        HS.add(30);
        System.out.println(HS.contains(10));
        System.out.println(HS.contains(1));
    }
}
```

Output:  

```bash
> java .\Question1.java
true
false
EXIT: 0
```

---

#### **2. Given an element write a program to sort the elements in ascending order in HashSet.**

```java
import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        HashSet<Integer> HS = new HashSet<>();
        HS.add(10);
        HS.add(20);
        HS.add(30);
        System.out.println(HS);
        ArrayList<Integer> list = new ArrayList<Integer>(HS);
        Collections.sort(list);
        System.out.println(list);
    }
}
```

Output:  

```bash
> java .\Question2.java
[20, 10, 30]
[10, 20, 30]
EXIT: 0
```

---

#### **3. Given an element write a program to sort the elements in descending order in HashSet.**

```java
import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        HashSet<Integer> HS = new HashSet<>();
        HS.add(10);
        HS.add(20);
        HS.add(30);
        System.out.println(HS);
        ArrayList<Integer> list = new ArrayList<Integer>(HS);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
```

Output:  

```bash
> java .\Question3.java
[20, 10, 30]
[30, 20, 10]
EXIT: 0
```

---

#### **4. Write a Java program to compare two sets and retain elements which are distincts in the sets.**

```java
import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        HashSet<Integer> HS1 = new HashSet<>();
        HashSet<Integer> HS2 = new HashSet<>();
        HS1.add(10);
        HS1.add(20);
        HS1.add(30);
        HS2.add(10);
        HS2.add(20);
        HS1.removeIf(n -> (!HS2.contains(n)));
        System.out.println(HS1);
    }
}
```

Output:  

```bash
> java .\Question4.java
[20, 10]
EXIT: 0
```

---

#### **5. Write a Java program to remove the elements which are greater than a specific elements from a hash set.**

```java
import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        HashSet<Integer> HS1 = new HashSet<>();
        HS1.add(10);
        HS1.add(20);
        HS1.add(30);
        HS1.removeIf(n -> (n > 25));
        System.out.println(HS1);
    }
}
```

Output:  

```bash
> java .\Question5.java
[20, 10]
EXIT: 0
```

---

#### **6. Write a Java program to compare two hash set return true if two hash set are same false if atleast one element hash sets are different.**

```java
import java.util.*;

public class Question6 {
    public static void main(String[] args) {
        HashSet<Integer> HS1 = new HashSet<>();
        HashSet<Integer> HS2 = new HashSet<>();
        HashSet<Integer> HS3 = new HashSet<>();
        HS1.add(10);
        HS1.add(20);
        HS1.add(30);
        HS2.add(10);
        HS2.add(20);
        HS3.add(10);
        HS3.add(20);
        HS3.add(30);
        System.out.println(HS1.equals(HS2));
        System.out.println(HS1.equals(HS3));
    }
}
```

Output:  

```bash
> java .\Question6.java
false
true
EXIT: 0
```

---

#### **7. Take elements into two linked lists at runtime and merge the second list with the first list.**

```java
import java.util.*;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> LL1 = new LinkedList<Integer>();
        while (true) {
            System.out.print("[FIRST] Enter a number, or enter \'q\' to stop: ");
            try {
                LL1.add(Integer.parseInt(sc.next()));
            } catch (NumberFormatException e) {
                break;
            }
        }

        LinkedList<Integer> LL2 = new LinkedList<Integer>();
        while (true) {
            System.out.print("[SECOND] Enter a number, or enter \'q\' to stop: ");
            try {
                LL2.add(Integer.parseInt(sc.next()));
            } catch (NumberFormatException e) {
                break;
            }
        }
        for (Integer i : LL2) {
            // System.out.println(i + " is contained in LL1: " + LL1.contains(i));
            if (!LL1.contains(i))
                LL1.add(i);
        }
        System.out.println(LL1);
    }
}

```

Output:  

```bash
> java .\Question7.java
[FIRST] Enter a number, or enter 'q' to stop: 1
[FIRST] Enter a number, or enter 'q' to stop: 2
[FIRST] Enter a number, or enter 'q' to stop: 3
[FIRST] Enter a number, or enter 'q' to stop: q
[SECOND] Enter a number, or enter 'q' to stop: 1
[SECOND] Enter a number, or enter 'q' to stop: 4
[SECOND] Enter a number, or enter 'q' to stop: 9
[SECOND] Enter a number, or enter 'q' to stop: 10
[SECOND] Enter a number, or enter 'q' to stop: q
[1, 2, 3, 4, 9, 10]
EXIT: 0
```

---

#### **8. Write a java program to check whether an element is present in LinkedList during insertion of the elements.**

```java
import java.util.*;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> LL1 = new LinkedList<Integer>();
        while (true) {
            System.out.print("Enter a number, or enter \'q\' to stop: ");
            try {
                Integer i = new Integer(sc.next());
                if (LL1.contains(i)) {
                    System.out.println("LL1 already containts " + i);
                } else
                    LL1.add(i);
            } catch (NumberFormatException e) {
                break;
            }
        }
        System.out.println(LL1);
    }
}

```

Output:  

```bash
> java .\Question8.java
Note: .\Question8.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.
Enter a number, or enter 'q' to stop: 1
Enter a number, or enter 'q' to stop: 2
Enter a number, or enter 'q' to stop: 1
LL1 already containts 1
Enter a number, or enter 'q' to stop: 1
LL1 already containts 1
Enter a number, or enter 'q' to stop: 2
LL1 already containts 2
Enter a number, or enter 'q' to stop: q
[1, 2]
EXIT: 0
```

---

#### **9. Write a java program to convert a HashSet into ArrayList.**

```java
import java.util.*;

public class Question9 {
    public static void main(String[] args) {
        HashSet<Integer> HS = new HashSet<>();
        HS.add(10);
        HS.add(20);
        HS.add(30);
        System.out.println(HS);
        ArrayList<Integer> list = new ArrayList<Integer>(HS);
        System.out.println(list);
    }
}
```

Output:  

```bash
> java .\Question9.java
[20, 10, 30]
[20, 10, 30]
EXIT: 0
```

---

#### **10. Write a Java program to remove all of the elements from a hash set.**

```java
import java.util.*;

public class Question10 {
    public static void main(String[] args) {
        HashSet<Integer> HS = new HashSet<>();
        HS.add(10);
        HS.add(20);
        HS.add(30);
        System.out.println(HS);
        HS.clear();
        System.out.println(HS);
    }
}
```

Output:  

```bash
> java .\Question10.java
[20, 10, 30]
[]
EXIT: 0
```

---

Made with `Code`, `Love` and `Markdown`  
By [Sayan Kundu](https://github.com/flametron/)  
Github Link: https://github.com/flametron/OOP-classes/blob/master/Assignments/JCFAssignment5.md