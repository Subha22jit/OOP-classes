>**Explain the meaning of each token of `public static void main(String[] args)`**  
>- `public`: Access Specifier. The `main()` method must be public because it is called from out outside of the class. It is called by JVM.
>- `static`: The `main()` must be static so that without creating any instance, JVM can call it. If the main method was not declared static, then JVM has to create an instance of the class having the `main()`. If the `main()` is static, then accessing without object is possible.
>- `void`: Return type. Does not return any value.
>- `main`: It is the entry point of a program if there is no static block.
>- `String[] args`: It is an array of strings. It is used to take command line arguments.
---
>**Explain each of the tokens of `System.out.println()`**
>- `System`: System class. It is a pre-defined class under Java.lang package. Java.lang is the default package. It provides access to the system.
>- `out`: It is a static field of System class. 
>- `print`/`println`: It is used to print a string. It is a method of *PrintStream* class.
---

#### Package
- Predefined Packages: 
> 1. java.lang
> 2. java.util
> 3. java.io

- User Defined Packages:
> `package Pack1;`  

In JAVA, there's no pre-processor.  
A Package is a collection of related java entries such as classes, interfaces, exceptions, errors, enums, and annotations.  
Benefits of using package:

- Used to avoid name conflicts.
- It provides modularity.
- It hides information.

`package` statement must be the first statement, followed by import statements. If we omit the package statement, then classes are put into a default package. `import` statement gives the fully qualified class path name.

#### Access Specifier/Modifier:
Access specifier specifies the accessiblity or scope of a field/variable, method, constructors or/and classes from other class.  
(*[Further reading](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html)*)

| Modifier | Class | Package | Subclass | World |
| :------- | :---: | :-----: | :------: | :---: |
| `public` | Y | Y | Y | Y |
| `protected` | Y | Y | Y | N |
| `default` | Y | Y | N | N |
| `private` | Y | N | N | N |
