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
```

### Difference between Abstract class and interface:

1. Interface supports multiple inheritance.
2. Interface does not have consturctor.


### Functional Interface

An Interface that contains exactly one abstract method, but it can have any number of default method, static method, private methods. This is why it is also called Single Abstract Method (SAM) Interface and it provides support for lambda expression and method reference.  
For example, Runnable interface.  
Annotation: `@FunctionalInterface`  

```java
@FunctionalInterface
interface I{
	void go();
	//void show();
}
class Main implements I{
	@Override
	public void go(){
		System.out.println("Hello");
	}
	public static void main(String a[]){
		new Main().go();
	}
}
```

Converting to anonymous inner class:


```java
@FunctionalInterface
interface I{
	void go();
	//void show();
}
class Main{
	
	public static void main(String a[]){
        I ob = new I(){
            @Override
         	public void go(){
         		System.out.println("Hello");
         	}
        };
		ob.go();
	}
}
```

### Lambda Expressions

`(arguments list) -> {Block of code}`  

1. Compact
2. Fast

```java
@FunctionalInterface
interface I{
	void go();
	//void show();
}
class Main{
	
	public static void main(String a[]){
        I ob = () -> {
         		System.out.println("Hello");
        }; //No new class creation like anonymous inner class
		ob.go();
	}
}
```
> How lambda expression brings functional programming concept in java?
> if the lambda expression matches the parameter type then the lambda expression is turned into a function that implements the same interface

#### Right Shift Operator

`>>`: Signed right shift operator  
`>>>`: Unsigned right shift operator (Zero fill right shift)  

`>>`: Shifts the bits of the number to the right by the number of shift. **The leftmost bits exposed by the shift are filled in with the previous content of the top bit (Most Significant Bit).**  

`>>>`: This operator is only meaningful for 32 bit value. This operator is useful in pixel based position calculations.  


> Why computers represent negative numbers by 2's complement?
> In 2's complement, -0 and 0 have same representation.
> It helps in subtraction, by utilizing the same circuit as for addition.

`instanceof`  

> Is java strongly typed or weakly typed?
> Java is strongly typed, Loosely typed is JavaScript, PERL

The main difference between strongly typed and weakly typed languages is that weakly typed can make conversions between unrelated types implicitly (String and integer are unrelated types), while strongly typed will disallow implicit conversion between unrelated types. Furthermore, strongly typed requires an explicit conversion between related types (integer and short are related types) when there is possibility of data loss.  

