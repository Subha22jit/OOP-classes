## Abstract Class

- Abstract class is not 100% abstract.
- Abstract classes can have constructors to support constructor chaining.
- An Object of an Abstract class object cannot exist because an Abstract class is not fully defined. But we can create a reference variable.  

#### Static Abstract methods:  
No, not possible. Because Abstract methods needs to be overridden, however, Static methods cannot be overridden. Same for Abstract Final methods, they too are not possible.


## Interface

Using the keyword interface we can fully create an abstraction,i.e 100% abstract. (Implemented from Java 7)  
It can hold only public, static, final variables and public and abstract methods. While implementing a Interface in a class, the interface methods access modifiers must match the one being defined.  
Defaults:
- method - public abstract
- variables - public static final

Interfaces do not have any constructor. Because:
1. interface supports multiple inheritance
2. interfaces are 100% abstract but constructor cannot be abstract, so they don't have one.


>Why java class dones not support multiple inheritance?  
Interfaces in java DO support multiple inheritance while Java Classes do not. This is due to the ambiguity that may rise on referring to `super()` methods or constructos from a subclass with two or more super classes. 

| Sub | Super | keyword |
| :-- | :-- | :-- | 
|Class |Class |  `extends` |
| Class | Interface | `implements` |
| Interface | Interface | `extends` |
| Interface | Class | Not possible |


#### Hybrid Inheritance

Class gives the identity.  
Interface gives the operations you can perform.
```java
interface Pet {...}
class Animal {...}

class Dog extends Animal implements Pet {...}
```

> - Difference between abstract classes and interface?  
> - giWhen to use abstract class and when to use interface?