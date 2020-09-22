# Object Oriented Concepts

## Encapsulation

It is a way of *hiding information*. The wrapping up of data and methods into a single unit is known as **Encapsulation**  
Java class is the basis of encapsulation. Then though access specifier (there are 4 access specifiers **Public**, **Protected**, **Default**, **Private**) we can control the access of class information.
```java
class Box{
    int w,h,d;
}

//int w,h,d cannot be accessed directly outside Box class.
//for example

class SquareBox{
    w,h,d;
    //w, h, d of Box class cannot be accessed here.
}
```

## Abstraction

It is a way of *hiding implementation*. Both Abstraction and Encapsulation are used for hiding.  

## Inheritance

It is a process by which one object acquires the properties of another object.

## Polymorphism

It is a feature that allows one interface to be used for general class of actions, i.e one interface multiple methods. Ploymorphism is derived from two greek workds *Poly* and *Morph*. *Poly* means many and *Morph* means forms.