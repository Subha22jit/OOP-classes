# Polymorphism

- Overloading
- Overriding

### Overloading

- Method Overloading
- Constructor Overloading

#### Method Overloading

Within a class, when two or more methods having same name but different parameters is known as Method Overloading. There are three ways to overload methods in java:

1. By changing the number of parameters
2. By changing the type of parameters
3. By combining both 1 and 2

Return type has no role to distinguish between overloaded methods. That is, Overloaded methods does not depend on return type.

Uses of overloading:

- It increases the readibility of the program because we need not to use different names for the same action.

Method overloading is called compile time polymorphism because the arguments are specified at compile time.

In java there is no unsigned data type.

#### Method Overloading and Type Promotion

ref. Implicit type conversion

#### Constructor overloading

In a class when two or more constructor are differentiated by their parameter list then these constructors are called overloaded constructors. Types:

- Different number of parameters
- Different types of parameters
- Both

Constructor overloading supports compile time polymorphism.

# Inheritance

Using inheritance we can create a general class that can be inherited by other more specific class. Using inheritance we can create a general class that can be inherited by other more specific class.  
A class that is inherited is called super class while the class that is inheriting the super class is called sub class. Super classes cannot inherit the properties of sub classes. Sub class can inherit all members of it's super class except private members.

---

# LAB Work:

_aar bhalo lage na_

- Create a class and determine if method overloading holds good for return type of methods or not [Code](../codes/Overloading.java)
- Overload the constructors for class Box for cube and cone and also display its volume (also method overloading included)[Code](../codes/Box.java)
- Create a class EMP having instance variable name and id. Create its subclass (say Scientist) which has instance variable
  no_of_publication and experience. Now create its subclass, say Dscientist which has instance variable award. Put a method:
  public String toString () { } in every class where you describe about the class and from main create object of each class and print each object. [Code](../codes/EMP.java)
