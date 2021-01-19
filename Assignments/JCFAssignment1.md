# JCF Assignment 1

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

#### **1. Write a List which take elements from user input and find the sum of the elements. 2. Write a List which take elements from user input and sort the elements in ascending order. 3. Write a List which take elements from user input and sort the elements in descending order. 4. Write a program that prints its arguments in random order. Do not make a copy of the argument array. Demonstrate how to print out the elements using the traditional enhanced for statement.**

```java
import java.util.*;

public class Question1234 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        for (String s2 : args)
            a.add(Integer.parseInt(s2));
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        System.out.println(sum);
        Collections.sort(a);
        System.out.println(a);
        Collections.sort(a, Collections.reverseOrder());
        System.out.println(a);
        Collections.shuffle(a);
        System.out.println(a);
        for (int i : a){
            System.out.println(i);
        }
    }
}
```

Output:  

```bash
> java .\Question1234.java 1 7 17 1 87 12 27 123
275
[1, 1, 7, 12, 17, 27, 87, 123]
[123, 87, 27, 17, 12, 7, 1, 1]
[7, 17, 1, 27, 12, 1, 123, 87]
17
1
123
12
7
27
87
1
EXIT: 0
```

---

Made with `Code`, `Love` and `Markdown`  
By [Sayan Kundu](https://github.com/flametron/)  
Github Link: https://github.com/flametron/OOP-classes/blob/master/Assignments/JCFAssignment1.md