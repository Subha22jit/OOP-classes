## Nested Class

Nested class is a class within another class.  
It is divied into two categories: (1) Static, (2) Non-Static  
```JAVA
class Outer{
    class NonStaicNested{

    }

    static class StaticNested{

    }
}
```

We can't make top level class as static because all top level classes are by definition static. So, having the static keyword in a top level class definition is pointless.

#### Static Nested Class features:
- It can access the static members of ounter class directly. but non static memberss can be accessed via object. 

#### Outer Class features:
- Outer class cannot have access of nested class members directly. 
- A nested class can be declared as `private`, `default`, `protected` and `public`.
- If outer class is declared as `private` then compiler will complain that private is not allowed here.