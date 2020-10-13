## Final keyword:

we can mark a variable, method or class as final.

- variable: if a variable is declared as final, it's value cannot be changed.
- method: if a method is declared final, it cannot be overridden, but final method can be overloaded.
- class: final class cannot be inherited.

Constructors as final?  
NO, constructors cannot be overridden, so they cannot be set to final.

## Abstract Class:

Any class that contains one or more abstract methods, so here the Figure class contains one abstract method `area()`, must also be declared abstract.  
The general form to declare method as abstract is

```java
abstract return-type method-name(parameter-list);
```

The class who inherits and abstract class either will override the abstract method or itself declare as abstract.

```java
 class Rectangle extends Figure {
     Rectangle(double a, double b) {
         super(a, b);
     }

     double area() {
         return this._a * this._b;
     }

     public static void main(String[] args) {
         Rectangle r = new Rectangle(2, 3);
         System.out.println(r.area());
     }
 }

 abstract class Figure {
     double _a, _b;

     Figure(double a, double b) {
         this._a = a;
         this._b = b;
     }

     abstract double area();
 }
```

---

Extras:

- Here is one

  ```java
  class Rectangle extends Figure {
      Rectangle(double a, double b) {
          super(a, b);
      }

      double area() {
          return this._a * this._b;
      }

      public static void main(String[] args) {
          Rectangle r = new Rectangle(2, 3);
          System.out.println(r.area());
      }
  }

  class Figure {
      double _a, _b;

      Figure(double a, double b) {
          this._a = a;
          this._b = b;
      }

      double area() {
          System.out.println("Undefined");
          return 0;
      }
  }
  ```

  `area()` inside `Figure` is mostly a palceholder. If within `Rectangle` class `area()` is not defined, then the reference will call `Figure` class `area()` method, which has no meaning.
