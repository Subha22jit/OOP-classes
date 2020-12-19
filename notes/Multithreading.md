## What is thread?

Each part of a program is a thread

## Advantage of multi thread over single thread?

Provides optimized times

# Thread Schedular

JVM has this  
It takes decision which thread will execute next.  
main() to us is a method, but to JVM, it is a thread.  
Each program has atleast 1 program, that is main.  

## Advantages of multi thread

- Time is optimized

## Disadvantages of multi Thread

- Synchronization problem
- Deadlocks, Starvation, etc etc..

# Thread Lifecycle

diagram needed to be added

## There are 2 ways to create a new thread 

1. Extends Thread
2. Implements Runnable


## Can you start a thread twice? Explain with code.

No, we get `java.lang.IllegalThreadStateException`. 
```java
public class testing extends Thread {

    testing(String name) {

        super(name);
    }

    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(t);
    }

    public static void main(String[] args) {
        // testing t0 = new testing("FI");
        testing t = new testing("FIRST");
        t.start();
        try {
            t.start();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
```
```bash
> java .\testing.java
java.lang.IllegalThreadStateException
Thread[FIRST,5,main]
EXIT: 0
```

## Thread priority

There are three priority value of a thread class. One is MAX_PRIORITY (10), one is MIN_PRIORITY (1) and the last one is NORM_PRIORITY (5); and we can set any priority value from 1 to 10. We can set priority value using `setPriority(int priority)`.  
However a Thread priority always doesn't gurentee the order of execution.  

