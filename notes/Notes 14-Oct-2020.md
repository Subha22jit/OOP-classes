## Blocks

There are two types of blocks in java:  
1. Static initialization block
2. Instance initialization block

#### Static initialization block

Static blocks are loaded while a program is loaded and it does not depends upon the instance of the class.

#### Instance initialization / Normal block

Instance blocks are dependent upon the instance of the class. It is called each time an instance is created.  
In a class hierarchy instance initialization blocks run after the constructor call to `super()`.  


##### Common Features

Both initialization blocks are executed in the order they appear in a program

```java
class Blocks{
    static{
        System.out.println("Static Block");
    }
    {
        System.out.println("Instance Block")
    }
    public static void main(String[] args) {
        Blocks b = new Blocks();
    }
}
```

> **Can we write a program without` public static void main(String[] args)`?**
>  We can write, but from Java 7 onwards, JVM requires a `public static void main(String[] args)` method to run. Although compiling one without `main()` method is allowed. Prior to Java 7, a java program could have ran through that static block itself without any `main()` method.