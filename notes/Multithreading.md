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


## Synchronization:

When two or more threads needs to access a common/shared resource, there needs to be some way to ensure that only one process access the resource at a time. The process by which it is achieved is called Synchronization.  
Key to synchronization is the concept of Monitor (aka Semaphore). Only one thread can own a monitor at a given time. As long as the thread holds the monitor, no other thread can enter the synchronizated section also called critical section of code.  

There are two ways to achieve Synchronization in java:
- by `synchronized` method.
  ```java
  synchronized void calculations(){
      //stuff to do in function
  }
  ```
- by `synchronized` statement or block.
  ```java
  synchronized(object){
      //statements in block
  }
  ```
  

## Difference between sleep and join.

## Explain isAlive and join().

We often want the main thread to stop last. This can be accomplished by calling sleep method on main thread with long enough delay to ensure that all child threads terminates prior the main thread, but how one thread will come to know when another thread has ended? **NEVER APPLY `.join()` ON MAIN THREAD**.


## Inter-Thread communication

- Polling System
  Polling is a process in which the computer waits for an external device to check for it's readiness. 
Usage of `wait()` and `notify()`  
`wait()` - It tells the calling thread to give up the monitor and go to sleep until some other thread enters the same monitor and calls `notify()`  
`notify()` - It wakes up a thread that called wait on the same object.  

`wait()` and `notify()` must be called from a synchronized context.