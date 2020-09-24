# Constructors, Objects and Variables
##### Day 6 - 23 Sept, 2020

#### Why are constructors useful?

It can be tedious to initialize all of the variables in a class each time an instance is created.  
*Default constructor initializes all the instance variables to their default values.* For example, for integer type, it is 0, for floating point type, it is 0.0, for character it is '\u0000' and for reference type, it is null.  
If no constructor is provided, java compiler provides a default constructor which is parameterless.  
**Once a programmer writes any constructor, then the java compiler will not provide any default constructor**

#### Data types (*[further reading on data types](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)*):
| Data type | Default value |
| :-------: | :-----------: |
| `byte` | 0 |
| `short` | 0 |
| `int` | 0 |
| `long` | 0L |
| `float` | 0.0f |
| `double` | 0.0d |
| `char` | '\u0000' |
| `String` | null |
| `boolean` | false |
| `object` | null |

#### Explain Different types of constructors:

- Default Constructor
- no-arg Constructor (Parameterless constructor)
- Parameterized Constructor


## Variables

There are three types of variables in java:
1. local variables
2. instance variables / *object variables*
3. static variables / *class variables*

### Local Variables

Variables declared within methods, constructors, etc are called local variables.  
In Java there is no garbage value concept, that's why we can't use local variable without initialization.

### Instance variables

Variables declared within class but outside of the body of any methods are called instance variables. It is not declared as `static`. It has one copy per object. Java compiler assign default value to the instance variables. These can be accessed only via an object - directly or indirectly.  
Accessing directly: `new Box().w`;

### Static variables

Left for next day

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
### Lab Work
#### Assignment 2 - 4 to 9

- Create a class First, make instance variable [int x], method [void show()] and also put main method inside that class and use the instance variable and method from main. [Code](../codes/First.java)
- Create a class; make its instance variable and method. Use them from main, declared
in different class. [Code](../codes/Second.java)
- Create a class; put a method inside this class which will return a class reference return
same class and/or different class object. [Code](../codes/ClassRef.java)