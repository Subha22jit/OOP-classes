# JCF Assignment 4

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

#### **1. Write a Java program to display the elements and their positions in reverse order in a linked list.**

```java
import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        LinkedList<Integer> LL = new LinkedList<>(Arrays.asList(new Integer[] { 21, 23, 34, 49, 65 }));
        for (int i = LL.size() - 1; i >= 0; i--) {
            System.out.printf("%d - %d%n", i, LL.get(i));
        }
    }
}
```

Output:  

```bash
> java .\Question1.java
4 - 65
3 - 49
2 - 34
1 - 23
0 - 21
EXIT: 0
```

---

#### **2. Write a Java program of swap two elements in an linked list.**

```java
import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        LinkedList<Integer> LL = new LinkedList<>(Arrays.asList(new Integer[] { 21, 23, 34, 49, 65 }));
        System.out.println(LL);
        LL.addLast(LL.get(2));
        LL.remove(2);
        System.out.println(LL);
    }
}
```

Output:  

```bash
> java .\Question2.java
[21, 23, 34, 49, 65]
[21, 23, 49, 65, 34]
EXIT: 0
```

---

#### **3. Write a Java program to sort the elemnts in ascending order in Linked List.**

```java
import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        LinkedList<Integer> LL = new LinkedList<>(Arrays.asList(new Integer[] { 21, 232, 34, 94, 5 }));
        System.out.println(LL);
        LL.sort(null);
        System.out.println(LL);
    }
}
```

Output:  

```bash
> java .\Question3.java
[21, 232, 34, 94, 5]
[5, 21, 34, 94, 232]
EXIT: 0
```

---

#### **4. Write a Java program to sort the elemnts in descending order in Linked List.**

```java
import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        LinkedList<Integer> LL = new LinkedList<>(Arrays.asList(new Integer[] { 21, 232, 34, 94, 5 }));
        System.out.println(LL);
        LL.sort(Collections.reverseOrder());
        System.out.println(LL);
    }
}
```

Output:  

```bash
> java .\Question4.java
[21, 232, 34, 94, 5]
[232, 94, 34, 21, 5]
EXIT: 0
```

---

#### **5. Write a Java program to search an element in a linked list.**

```java
import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        LinkedList<Integer> LL = new LinkedList<>(Arrays.asList(new Integer[] { 21, 232, 34, 94, 5 }));
        System.out.println(LL.contains(21));
        System.out.println(LL.contains(2));
    }
}
```

Output:  

```bash
> java .\Question5.java
true
false
EXIT: 0
```

---

Made with `Code`, `Love` and `Markdown`  
By [Sayan Kundu](https://github.com/flametron/)  
Github Link: https://github.com/flametron/OOP-classes/blob/master/Assignments/JCFAssignment4.md