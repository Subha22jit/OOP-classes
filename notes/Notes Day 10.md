## Inheritance

### access specifiers

- Private access specifier specifies the accessability within the class only.
- Public means accessible from any place.

Private and public can be used with instance or static members only.

5 types of inheritance:

- Single
- Multilevel
- Hierarchical
- Multiple
- Hybrid

Java class does not support multiple inheritance.

### `this` keyword

it is a non static reference variable of the containing class so we can't use it from static context specified by Java Language Specification. `this` keyword helps solve ambiguity issues with instance and local variables. Uses of this:

- Used to refer containing class instance and static variable
- Used to invoke containing class constructor

### `super` keyword

non-static keyword, can't be accessed from static context. helps solve ambiguity between super class and sub class variables having same name.

- Used to access parent class instance and static variable.
- Used to invoke super class constructor (Constructor Chaining)

First line in a constructor block is `super();` if we don't specify explicitly. Java compiler provides this if not specified.

It is used to invoke parent class methods.

---

# Day 11 Lab Work:

[Rectangle.java](./../codes/Rectangle.java)
