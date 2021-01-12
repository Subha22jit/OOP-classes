# Lab Assignment 8

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

#### **1. Inherit a class from Thread and override the run( ) method. Inside run( ), print name of thread , and then call sleep( ). Repeat this three times, then return from run( ). Put a start-up message in the constructor. Make your thread object and main thread run to see what happens.**

```java
public class Question1 extends Thread {
    Question1(String naam) {
        super(naam);
        System.out.println("Started");
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(this.getName());
            try {
                this.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        Question1 q1 = new Question1("Amar Thread");
        System.out.println(Thread.currentThread().getName());
        System.out.println("BAire theke naam: " + q1.getName());
        q1.start();
        try {
            q1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Main exited");
    }
}
```

Output:  

```bash
> java .\Question1.java
Started
main
BAire theke naam: Amar Thread
Amar Thread
Amar Thread
Amar Thread
Main exited
EXIT: 0
```

---

#### **2. Implement a class from Runnable and override the run( ) method. Inside run( ), print full qualified name of thread, and then call sleep( ). Repeat this three times, then return from run(). Put a start-up message in the constructor. Make your thread object and main thread run to see what happens.**

```java
public class Question2 implements Runnable {
    Question2(String naam) {
        System.out.println("Started");
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        Question2 q2 = new Question2("Amar Thread");
        Thread t = new Thread(q2, "Custom Naam");
        System.out.println(Thread.currentThread().getName());
        System.out.println("BAire theke naam: " + t.getName());
        t.start();
        try {
            t.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Main exited");
    }
}

```

Output:  

```bash
> java .\Question2.java
Started
main
BAire theke naam: Custom Naam
Custom Naam
Custom Naam
Custom Naam
Main exited
EXIT: 0
```

---

#### **3. Make several threads (say 5) with names (by extending thread), set their priority and run them to see what happens.**

```java
public class Question3 extends Thread {
    Question3(String naam) {
        super(naam);
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(this + " [Timed: " + (i + 1) + "]");
        }
    }

    public static void main(String[] args) {
        Question3 qs[] = new Question3[5];
        for (int i = 1; i < 6; i++) {
            qs[i - 1] = new Question3("Named Number #" + i);
            qs[i - 1].setPriority(i);
            qs[i - 1].start();
        }
    }

}

```

Output:  

```bash
> java .\Question3.java
Thread[Named Number #5,5,main] [Timed: 1]
Thread[Named Number #1,1,main] [Timed: 1]
Thread[Named Number #3,3,main] [Timed: 1]
Thread[Named Number #2,2,main] [Timed: 1]
Thread[Named Number #4,4,main] [Timed: 1]
Thread[Named Number #2,2,main] [Timed: 2]
Thread[Named Number #3,3,main] [Timed: 2]
Thread[Named Number #1,1,main] [Timed: 2]
Thread[Named Number #5,5,main] [Timed: 2]
Thread[Named Number #1,1,main] [Timed: 3]
Thread[Named Number #3,3,main] [Timed: 3]
Thread[Named Number #2,2,main] [Timed: 3]
Thread[Named Number #4,4,main] [Timed: 2]
Thread[Named Number #4,4,main] [Timed: 3]
Thread[Named Number #5,5,main] [Timed: 3]
EXIT: 0
```

---

#### **4. Make several threads (say 5) with their names (implementing Runnable) set their priority and run them to see what happens.**

```java
public class Question4 implements Runnable {

    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " [Timed: " + (i + 1) + "]");
        }
    }

    public static void main(String[] args) {
        Thread qs[] = new Thread[5];
        for (int i = 1; i < 6; i++) {
            qs[i - 1] = new Thread(new Question4(), "Named Number #" + i);
            qs[i - 1].setPriority(i);
            qs[i - 1].start();
        }
    }

}

```

Output:  

```bash
> java .\Question4.java
Named Number #3 [Timed: 1]
Named Number #3 [Timed: 2]
Named Number #3 [Timed: 3]
Named Number #4 [Timed: 1]
Named Number #2 [Timed: 1]
Named Number #4 [Timed: 2]
Named Number #1 [Timed: 1]
Named Number #5 [Timed: 1]
Named Number #1 [Timed: 2]
Named Number #4 [Timed: 3]
Named Number #2 [Timed: 2]
Named Number #1 [Timed: 3]
Named Number #5 [Timed: 2]
Named Number #5 [Timed: 3]
Named Number #2 [Timed: 3]
EXIT: 0
```

---

#### **5. Implement program of locking of common method by several threads. (Using the keyword ‘synchronized’).**

```java

public class Question5 implements Runnable {
    public void run() {
        for (int i = 0; i < 3; i++) {
            showMe();
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }

    synchronized void showMe() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Question5 base = new Question5();
        Thread t1 = new Thread(base, "Thread 1");
        Thread t2 = new Thread(base, "Thread 2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
```

Output:  

```bash
> java .\Question5.java
Thread 1: 0
Thread 1: 1
Thread 1: 2
Thread 2: 0
Thread 2: 1
Thread 2: 2
Thread 1: 0
Thread 1: 1
Thread 1: 2
Thread 2: 0
Thread 2: 1
Thread 2: 2
Thread 1: 0
Thread 1: 1
Thread 1: 2
Thread 2: 0
Thread 2: 1
Thread 2: 2
EXIT: 0
```

---

#### **6. Write a program to use join() and isAlive() in Multi-Threading. Inter thread communication : Consumer consumes item produced by Producer with proper synchronization.**

```java
public class Question6 extends Thread {
    Question6(String name) {
        super(name);
    }

    public void run() {
        System.out.println(
                "Inside run() of " + Thread.currentThread().getName() + " : " + Thread.currentThread().isAlive());
        try {
            sleep(2000);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Question6 q1 = new Question6("Custom Thread");
        System.out.println("Pre start() " + q1.getName() + ":" + q1.isAlive());
        q1.start();
        System.out.println("Post start() " + q1.getName() + ":" + q1.isAlive());
        q1.join();
        // System.out.println("Hi");
        System.out.println("Post join() " + q1.getName() + ":" + q1.isAlive());
        while (q1.isAlive()) {
            Thread.sleep(100);
        }
        System.out.println("Post death " + q1.getName() + ":" + q1.isAlive());

    }
}
```

Output:  

```bash
> java .\Question6.java
Pre start() Custom Thread:false
Post start() Custom Thread:true
Inside run() of Custom Thread : true
Post join() Custom Thread:false
Post death Custom Thread:false
EXIT: 0
```

---

Made with `Code`, `Love` and `Markdown`  
By [Sayan Kundu](https://github.com/flametron/)  
Github Link: https://github.com/flametron/OOP-classes/blob/master/Assignments/Assignment8.md