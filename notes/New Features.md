## New Features in Interface from Java 8 onwards

1. default method
2. static method
3. private method

### default method:

non-abstract method.  
pre java 8, Interface was 100% abstract. Java 8 onwards, Interface is not 100% abstract.  
it defines a method with default implementation, but we can override it to have more specific implementation.  

```java
interface I{
    default void go(){
        System.out.println("Go to there");
    }
}

class Test implements I{
    public static void main(String args[]){
        new Test().go();
        I ob = new Test();
        ob.go();
    }
}
/*
Go to there
Go to there
*/

class Test2 implements I{
    @Override
    public void go(){
        System.out.println("Jabo Na!");
    }
    public static void main(String args[]){
        new Test2().go();
        I ob = new Test2();
        ob.go();
    }
}
/*
Jabo Na!
Jabo Na!
*/
```

**`super` keyword is not allowed to avoid ambiguity as we can implement multiple interfaces. Instead we use the below**  

```java
interface I1{
    default void go(){
        System.out.println("Go to there");
    }
}
interface I2{
    default void go(){
        System.out.println("Go to there 2");
    }
}
class Test implements I{
    @Override
    public void go(){
        System.out.println("Jabo Na!");
        I1.super.go();
        I2.super.go();
    }    
    public static void main(String args[]){
        new Test().go();
        I ob = new Test();
        ob.go();
    }
}
```

Before java 8, interfaces could have only abstract methods. The implementation of this method has to be provided in a separate class, so, if a new method is to be added in an interface then it's implementation code has to be provided in the class implementing that interface. to overcome this issue, default method concept has been introduced.  

### static method:

1. Can't override
2. 

```java
Interface I{
    static void go(){
        System.out.println("Going");
    }
}
class Test implements I{
    public static void main(String args[]){
        I.go();
    }
}