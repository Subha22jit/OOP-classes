# JCF Assignment 3

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

#### **1. Add specified elements to the start, end and at any position in a linked list.**

```java
import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        LinkedList<Integer> LL = new LinkedList<>();
        LL.add(2);
        LL.addFirst(1);
        LL.addLast(9);
        LL.add(2, 3);
        System.out.println(LL);
    }
}
```

Output:  

```bash
> java .\Question1.java
[1, 2, 3, 9]
EXIT: 0
```

---

#### **2. Remove specified element from the start, end and at any position in a linked list.**

```java
import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        LinkedList<Integer> LL = new LinkedList<>(Arrays.asList(new Integer[] { 1, 2, 3, 4, 5 }));
        System.out.println(LL);
        LL.removeFirst();
        System.out.println(LL);
        LL.removeLast();
        System.out.println(LL);
        LL.remove(1);
        System.out.println(LL);
    }
}
```

Output:  

```bash
> java .\Question2.java
[1, 2, 3, 4, 5]
[2, 3, 4, 5]
[2, 3, 4]
[2, 4]
```

---

#### **3. Get specified element from the start, end and at any position in a linked list.**

```java
import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        LinkedList<Integer> LL = new LinkedList<>(Arrays.asList(new Integer[] { 1, 2, 3, 4, 5 }));
        System.out.println(LL);
        System.out.println(LL.getFirst());
        System.out.println(LL.get(2));
        System.out.println(LL.getLast());
    }
}
```

Output:  

```bash
> java .\Question3.java
[1, 2, 3, 4, 5]
1
3
5
EXIT: 0
```

---

#### **4. Write a Java program to iterate through all elements in a linked list starting at the specified position.**

```java
import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        LinkedList<Integer> LL = new LinkedList<>(Arrays.asList(new Integer[] { 1, 2, 3, 4, 5 }));
        System.out.println(LL);
        Integer ar[] = new Integer[5];
        LL.toArray(ar);
        int startingIndex = 2;
        for (int i = startingIndex; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
        for (ListIterator LI = LL.listIterator(startingIndex); LI.hasNext();) {
            System.out.println(LI.next());
        }
    }
}
```

Output:  

```bash
> java .\Question4.java
[1, 2, 3, 4, 5]
3
4
5
3
4
5
EXIT: 
```

---

#### **5. Write a Java program to iterate a linked list in reverse order starting at the specified position.**

```java
import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        LinkedList<Integer> LL = new LinkedList<>(Arrays.asList(new Integer[] { 1, 2, 3, 4, 5 }));
        System.out.println(LL);
        Integer ar[] = new Integer[5];
        LL.toArray(ar);
        int startingIndex = 2;
        for (int i = startingIndex; i < ar.length; i++) {
            System.out.println(ar[ar.length - i - 1]);
        }
    }
}
```

Output:  

```bash
> java .\Question5.java
[1, 2, 3, 4, 5]
3
2
1
EXIT: 0
```

---

Made with `Code`, `Love` and `Markdown`  
By [Sayan Kundu](https://github.com/flametron/)  
Github Link: https://github.com/flametron/OOP-classes/blob/master/Assignments/JCFAssignment3.md