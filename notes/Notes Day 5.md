# Object Oriented Concepts
##### Day 5 - 22 Sept, 2020


## Encapsulation

It is a way of *hiding information*. The wrapping up of data and methods into a single unit is known as **Encapsulation**  
Java class is the basis of encapsulation. Then though access specifier (there are 4 access specifiers **`public`**, **`protected`**, **`default`**, **`private`**) we can control the access of class information.
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


#### Access Levels (*[Further reading](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html)*)

| Modifier | Class | Package | Subclass | World |
| :------- | :---: | :-----: | :------: | :---: |
| `public` | Y | Y | Y | Y |
| `protected` | Y | Y | Y | N |
| `default` | Y | Y | N | N |
| `private` | Y | N | N | N |



## Abstraction

It is a way of *hiding implementation*. Both Abstraction and Encapsulation are used for hiding.  

## Inheritance

It is a process by which one object acquires the properties of another object.

## Polymorphism

It is a feature that allows one interface to be used for general class of actions, i.e one interface multiple methods. Ploymorphism is derived from two greek workds *Poly* and *Morph*. *Poly* means many and *Morph* means forms.



## Constructors

It is a special method. A constructor initializes the internal state of an object immediately upon creation. It has the same name as class name in which it resides.  
Every class we create has a constructor provided by java compiler.  
Constructors are called immediately and automatically once an object is created.  
It has no return type, not even `void`

```java
Class Box{
    int w,h; //Instance Variables
    static int d; //Static Variable

    //constructor - parameterless
    Box(){
        w=2;
        h=3;
        d=4;
    }
    // execution begins here by default
    public static void main(String[] args){
        // Creating object below
        Box b1 = new Box();
        System.out.println(b1.w+" "+b1.h);
        System.out.println(b1.d);
    }
}
```

***

### Lab Work

***Assignment 2** - from question 2 onwards*

Completed:

- Write a program to find surface area and volume of Cylinder Using Constructors - Keyboard Input or Command Line Input. 
[Code](../codes/Cylinder.java)
- Write a program to find surface area and volume of Cone Using Constructors - keyboard input or command line input.
[Code](../codes/Cone.java)
- Create a class named Test, make method inside it and pass object as parameter of this method using (a) pass same class‟s object, (b) pass different class‟s object [Code](../codes/Test.java)