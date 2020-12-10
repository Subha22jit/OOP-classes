# Lab Assignment 6

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

#### **1. Take a sting from keyboard and convert into character array (new one).**

```java
import java.util.Scanner;

class Question1 {
    static void printArray(char[] c) {
        System.out.print("[");
        for (char ch : c) {
            System.out.print("'" + ch + "'");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next() + sc.nextLine();
        char c[] = new char[str.length()];
        char c2[] = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            c[i] = str.charAt(i);
        }
        printArray(c);
        printArray(c2);
    }
}
```

Output:  

```bash
> java .\Question1.java
Hello World
['H''e''l''l''o'' ''W''o''r''l''d']
['H''e''l''l''o'' ''W''o''r''l''d']
EXIT: 0
```

---

#### **2. Take a string from keyboard and a char array (of length 5). Now append the string to that char array.**

```java
import java.util.Scanner;
import java.util.Arrays;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c[] = new char[5];
        for (int i = 0; i < c.length; i++)
            c[i] = sc.next().charAt(0);
        String str = sc.next() + sc.nextLine();
        System.out.printf("Before:%nSTR=%s%nC[]=%s%n", str, Arrays.toString(c));
        char c2[] = new char[5 + str.length()];
        int i = 0;
        for (char ch : c)
            c2[i++] = ch;
        for (char ch : str.toCharArray())
            c2[i++] = ch;
        c = c2;
        System.out.printf("After:%nSTR=%s%nC[]=%s%n", str, Arrays.toString(c));

    }
}
```

Output:  

```bash
> java .\Question2.java
h
e
l
l
o
WORLD
Before:
STR=WORLD
C[]=[h, e, l, l, o]
After:
STR=WORLD
C[]=[h, e, l, l, o, W, O, R, L, D]
EXIT: 0
```

---

#### **3. Find length of a string taken from keyboard and also find the length of that string except front and end spaces.**

```java
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next() + sc.nextLine();
        System.out.println(str.length());
        System.out.println(str.trim().length());
    }
}
```

Output:  

```bash
> java .\Question3.java
    hello world       
18
11
EXIT: 0
```

---

#### **4. Check if "Tech" presents in "University of Technology" or not. If yes return its position.**

```java
public class Question4 {
    public static void main(String[] args) {
        String master = "University of Technology";
        String submis = "Tech";
        int i;
        if ((i = master.indexOf(submis)) >= 0)
            System.out.println(i);
        else
            System.out.println("Not Found");
    }
}
```

Output:  

```bash
> java .\Question4.java
14
EXIT: 0
```

---

#### **5. Write a program to take a sentence and convert it into string arrays and sort the words using any Sorting technique.**

```java
import java.util.Scanner;
import java.util.Arrays;

public class Question5 {

    // Mergesort karon amar bhalo legeche eta besh
    // In place korbe eta...
    public static void mergeSort(String[] a, int from, int to) {
        if (from == to) {
            return;
        }
        int mid = (from + to) / 2;
        mergeSort(a, from, mid);
        mergeSort(a, mid + 1, to);
        merge(a, from, mid, to);
    }

    public static void merge(String[] a, int from, int mid, int to) {
        int n = to - from + 1;
        String[] b = new String[n];
        int i1 = from;
        int i2 = mid + 1;
        int j = 0;

        while (i1 <= mid && i2 <= to) {
            if (a[i1].compareTo(a[i2]) < 0) {
                b[j] = a[i1];
                i1++;
            } else {
                b[j] = a[i2];
                i2++;
            }
            j++;
        }

        while (i1 <= mid) {
            b[j] = a[i1];
            i1++;
            j++;
        }

        while (i2 <= to) {
            b[j] = a[i2];
            i2++;
            j++;
        }

        for (j = 0; j < n; j++) {
            a[from + j] = b[j];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next() + sc.nextLine();
        String splited[] = str.split(" ");
        mergeSort(splited, 0, splited.length - 1);
        System.out.println(Arrays.toString(splited));
    }
}
```

Output:  

```bash
> java .\Question5.java
you don't know who i am but i know you
[am, but, don't, i, i, know, know, who, you, you]
EXIT: 0
```

---

#### **6. Generate password from initials of one’s first_name, middle_name, last_name and with last four digit of your roll_no.(if middle name not presents ,it won't come)**

```java
import java.util.Scanner;
import java.util.Arrays;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first_name = sc.next() + sc.nextLine();
        String middle_name = sc.nextLine();
        if (middle_name.length() <= 0)
            middle_name = "\0";
        String last_name = sc.next() + sc.nextLine();
        if (!sc.hasNextLong()) {
            sc.nextLine();
        }
        // long roll_numer = sc.nextLong();
        String roll_number2 = sc.next() + sc.nextLine();
        // System.out.printf("%s%s%s%d%n", first_name.charAt(0), middle_name.charAt(0), last_name.charAt(0),
        //         (roll_numer % 10000));
        System.out.printf("%s%s%s%s%n", first_name.charAt(0), middle_name.charAt(0), last_name.charAt(0),
                (roll_number2.substring(roll_number2.length() - 4)));
    }
}

```

Output:  

```bash
> java .\Question6.java
Sayan
    
Kundu
121310007
SK0007
EXIT: 0
```

---

#### **7. Show that the String object is immutable but StringBuffer type object is mutable.**

```java
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next() + sc.nextLine();
        StringBuffer sb = new StringBuffer(str);
        int previous_hashCode = str.hashCode();
        str = str.concat("HELLOOOOOOO");
        System.out.printf("[STRING]%nPrevious Hash: %d%nNew Hash: %d%nSame: %s%n", previous_hashCode, str.hashCode(),
                str.hashCode() == previous_hashCode);
        previous_hashCode = sb.hashCode();
        sb.append("HELLOOOOOOO");
        System.out.printf("[STRINGBUFFER]%nPrevious Hash: %d%nNew Hash: %d%nSame: %s%n", previous_hashCode,
                sb.hashCode(), sb.hashCode() == previous_hashCode);

    }
}
```

Output:  

```bash
> java .\Question7.java
Hello World
[STRING]
Previous Hash: -862545276
New Hash: -530582578
Same: false
[STRINGBUFFER]
Previous Hash: 1567885839
New Hash: 1567885839
Same: true
EXIT: 0
```

---

#### **8. Write a program in Java which will read a string and rewrite it in the alphabetical order. For example, the word STRING should be written as GINRST.**

```java
import java.util.Scanner;
import java.util.Arrays;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next() + sc.nextLine();
        char c[] = st.toCharArray();
        Arrays.sort(c);
        System.out.println(c);
    }
}
```

Output:  

```bash
> java .\Question8.java
SAYAN
AANSY
EXIT: 0
```

---

#### **9. Write a program in Java to extract a portion of a character string and print the extracted string. Assume that m characters are extracted, starting with the n-th character.**

```java
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next() + sc.nextLine();
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(str.substring(n - 1, n + m));
    }
}
```

Output:  

```bash
> java .\Question9.java
Hello world I am fine
7
5
world 
EXIT: 0
```

---

#### **10.Write your own method called deleteMe(String str, int m) that returns the input string with the m-th element removed.**

```java
import java.util.Scanner;

public class Question10 {
    static String deleteMe(String str, int m) {
        char c2[] = new char[str.length()-1];
        int add=0;
        for(int i=0;i<str.length();i++){
            if(i!=m){
                c2[i-add]=str.charAt(i);
            }
            else{
                add++;
            }
        }
        return new String(c2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next() + sc.nextLine();
        int m = sc.nextInt();
        System.out.println(str.length());
        str = deleteMe(str, m - 1);
        System.out.println(str.length());
        System.out.println(str);
    }
}
```

Output:  

```bash
> java .\Question10.java
ThisIsALongWord
7
15
14
ThisIsLongWord
EXIT: 0
```

---

Made with `Code`, `Love` and `Markdown`  
By [Sayan Kundu](https://github.com/flametron/)  
Github Link: https://github.com/flametron/OOP-classes/blob/master/Assignments/Assignment6.md