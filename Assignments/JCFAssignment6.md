# JCF Assignment 6

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

#### **1. Write a Java program to collaborate specified values with the specified keys and display as a set view for both keys and values respectively.**

```java
import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Hello", 1);
        hm.put("World", 2);
        hm.put("New", 2);
        System.out.println("Keys: " + hm.keySet());
        System.out.println("Values: " + hm.values());
    }
}
```

Output:  

```bash
> java .\Question1.java
Keys: [New, Hello, World]
Values: [2, 1, 2]
EXIT: 0
```

---

#### **2. Write a Java program to count the number of key and unique values in a collection.**

```java
import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Hello", 1);
        hm.put("World", 2);
        hm.put("New", 2);
        System.out.println("Keys: " + hm.keySet().size());
        System.out.println("Values: " + new HashSet(hm.values()).size());
    }
}
```

Output:  

```bash
> java .\Question2.java
Keys: 3
Values: 2
EXIT: 0
```

---

#### **3. Write a Java program to copy all of the contents <key, value> from the specified map to another map and if there is any duplicate value then make it double.**

```java
import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        HashMap<String, Integer> hm2 = new HashMap<>();
        hm.put("Hello", 1);
        hm.put("World", 2);
        hm.put("New", 2);
        hm.put("New2", 2);
        hm.forEach((String k, Integer v) -> {
            if (hm2.values().contains(v)) {
                Integer in = v;
                while (hm2.values().contains(in)) {
                    in = in * 2;
                }
                hm2.put(k, in);
            } else
                hm2.put(k, v);
        });
        System.out.println("OLD: " + hm);
        System.out.println("NEW: " + hm2);
    }
}
```

Output:  

```bash
> java .\Question3.java
OLD: {New=2, Hello=1, New2=2, World=2}
NEW: {New=2, Hello=1, New2=4, World=8}
EXIT: 0
```

---

#### **4. Write a Java program to search for a specified key in a map.**

```java
import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Hello", 1);
        hm.put("World", 2);
        hm.put("New", 2);
        System.out.println(hm.keySet().contains("Hello"));
        System.out.println(hm.keySet().contains("Cello"));
        // can also use containsKey()
    }
}
```

Output:  

```bash
> java .\Question4.java
true
false
EXIT: 0
```

---

#### **5. Write a Java program to search for a specified value in a map.**

```java
import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Hello", 1);
        hm.put("World", 2);
        hm.put("New", 2);
        System.out.println(hm.values().contains(1));
        System.out.println(hm.values().contains(3));
        // can also use containsValue()
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

#### **6. Write a Java program to search for a value of a specified key in a map.**

```java
import java.util.*;

public class Question6 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Hello", 1);
        hm.put("World", 2);
        hm.put("New", 2);
        System.out.println(hm.get("Hello"));
        System.out.println(hm.get("Cello"));
    }
}
```

Output:  

```bash
> java .\Question6.java
1
null
EXIT: 0
```

---

#### **7. Write a Java program to get all keys contained in this map.**

```java
import java.util.*;

public class Question7 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Hello", 1);
        hm.put("World", 2);
        System.out.println("Keys: " + hm.keySet());
    }
}
```

Output:  

```bash
> java .\Question7.java
Keys: [Hello, World]
EXIT: 0
```

---

#### **8. Write a Java program to get all values contained in this map.**

```java
import java.util.*;

public class Question8 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Hello", 1);
        hm.put("World", 2);
        hm.put("New", 2);
        System.out.println("Values: " + hm.values());
    }
}
```

Output:  

```bash
> java .\Question8.java
Values: [2, 1, 2]
EXIT: 0
```

---

Made with `Code`, `Love` and `Markdown`  
By [Sayan Kundu](https://github.com/flametron/)  
Github Link: https://github.com/flametron/OOP-classes/blob/master/Assignments/JCFAssignment6.md