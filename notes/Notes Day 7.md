# Variables

##### Day 7 - 24 Sept, 2020

## Static Variable

Variables declared inside class but outside of the body of the method using static keyword are known as static variables. It has one copy per class.  
Static and Instance variables, if not initialized, will be set to their default values.

```java
class Box{
    int w; //Instance Var
    static int h; // Static Var
    public static void main(String[] args){
        int d; // Local Var
        System.out.println(d);  // ERROR: not initialized
        System.out.println(h);
        System.out.println(new Box().w);
    }
}
```

---

`new` is used to allocate memory dynamically.  

| Variable | Location |
| :-: | :-: |
| Local | Stack |
| Instance | Heap |
| Dynamic | Heap |

---

**Static variables get updated, and the update is visible in all objects of the class**

```java

public class VarCheck {
    int a, b;
    static int c;

    VarCheck(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) {
        VarCheck v1 = new VarCheck(1, 2, 3);
        VarCheck v2 = new VarCheck(4, 5, 6);
        System.out.println(v1.a + " " + v1.b + " " + v1.c);
        System.out.println(v2.a + " " + v2.b + " " + v2.c);
    }
}

```
Output:
```bash
java VarCheck
1 2 6
4 5 6
```

---

## Static and Instance Methods

