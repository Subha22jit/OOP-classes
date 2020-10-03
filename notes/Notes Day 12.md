# Overriding

When a method in a subclass has the same name, same parameters and same return type (or subtype of reference type) as a method in it's super class, then the method in the sub class is said to override the methods in the super class. if method name and parameter list in a sub class both are same, then return type must be same or _compatible for reference type_.  
The pre-requisit of overriding is inheritance.

# Dynamic Method Dispatching

Method Overriding supports run time polymorphism.  
Method Overriding is the basis of DMD. It is a process by which called over return method is dissolved at runtime.  
The pre-requisit of DMD is Overriding.  
Here it is the type of the object being referred to that determines which version of the overridden method is called.  
Super class reference variables can refer subclass object.

```java
class Sup{
    void disp(){
        System.out.println("Sup");
    }
}

class Sub extends Sup{
    void disp(){
        System.out.println("Sub");
    }

    public static void main(String[] args){
        Sup ref;
        ref = new Sup();
        ref.disp();
        ref = new Sub();
        ref.disp();
    }
}
```
