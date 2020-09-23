# Constructors, Objects and Variables
##### Day 6 - 23 Sept, 2020

#### Why are constructors useful?

It can be tedious to initialize all of the variables in a class each time an instance is created.  
*Default constructor initializes all the instance variables to their default values.* For example, for integer type, it is 0, for floating point type, it is 0.0, for character it is '\u0000' and for reference type, it is null.  
If no constructor is provided, java compiler provides a default constructor which is parameterless.  
**Once a programmer writes any constructor, then the java compiler will not provide any default constructor**

#### Data types (*[further reading on data types](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)*):
| Data type | Default value |
| :--: | :--: | :--: |
| `byte` | 0 |
| `short` | 0 |
| `int` | 0 |
| `long` | 0 |
| `float` | 0.0f |
| `double` | 0.0d |
| `char` | '\u0000' |
| `String` | null |
| `boolean` | false |
| `object` | null |

#### Explain Different types of constructors:

- Default Constructor
- no-arg Constructor (Parameterless constructor)
- Parameterized Constructor