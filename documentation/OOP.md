## FOUR OOP Concepts

### Encapsulation
Encapsulation is demonstrated by how Java's `Math` class handles its methods and constructors. The class makes extensive use of static methods, allowing them to be called at the class level without needing an instance of the class. This is particularly evident in how the `Math` class sets its default constructor to private, preventing instantiation.

### Inheritance
In Java, inheritance is a core concept where every class implicitly extends the `Object` class. This inheritance allows any class to use the methods defined in the `Object` class, showcasing a fundamental aspect of Java's Method overriding occurs when a subclass provides its own implementation of a method declared by one of its parent classes.

object-oriented programming model.

### Polymorphism
Polymorphism in Java allows a method or constructor to take multiple forms. It can be categorized into two types:
- **Overloading**: Where methods within the same class share the same name but have different parameters.
Compile-time polymorphism (also known as static polymorphism or method overloading) is achieved through method overloading.
- **Overriding**: Where a method in a subclass has the same name and method signature as a method in its superclass. 
The `@Override` annotation is used to ensure that a method is correctly overriding a method from its superclass.
-Method overriding occurs when a subclass provides its own implementation of a method declared by one of its parent classes.



### Abstraction
- Abstraction in Java can be achieved through interfaces and abstract classes. 
- the class is meant to be extended but cannot initialize objects

- **Interfaces**: An interface in Java is a reference type, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types. Methods in interfaces are abstract by default.
- by default all variables in in interfaces are public static final constants.  
Run-time polymorphism (also known as dynamic polymorphism or method overriding) is achieved through method overriding. This is when a subclass provides a specific implementation for a method already defined in its superclass. The Java runtime determines which method to invoke based on the type of object on which the method is called at runtime.
  
```java
interface Income {
    double calculate(double salary, double taxes);
}

public class InterfaceExample {
    public static void main(String[] args) {
        // Implementation code here
    }

    class Employee implements Income {
        @Override
        public double calculate(double salary, double taxes) {
            return salary - taxes;
        }
    }
}

```
![alt text](image.png)


### Abstract Class
```
If I need to use methods with code use abstract classes. technically you can use default methods to accomplish this, but don't do this it's bad practice.
Methods in abstract classes are not public by default
```

---

## Wednesday Static Method
### Static Method
- We can use static methods when the static method does not depend on the attributes of the class
- static methods cannot access attributes of instances since they would not know which attribute to access directly
``` java
class ClassName {
  // static variable
  public static type variableName;

  // static method
  public static returnType methodName(parameters) {
      // implement the logic for your method here  
  }
}
// To call a static method or variable, use the Class Name
System.out.println(ClassName.staticVariable);
ClassName.staticMethod();
```
- Q static methods only have access to other static variables and static methods (unless the static method creates an object through which to access instance variables and methods). 
- to access methods from main MAKE THEM STATIC !!!!
- Static methods cannot access or change the values of instance variables, but they can access or change the values of static variables contained within their class.

### Access Modifier
![alt text](image-1.png)
![alt text](image-5.png)

### UML
```
- + or - – Along with # and ~, these symbols represent the visibility of the attribute:
- +: a visibility setting of public means that any other class can access this attribute.
- -: a visibility setting of private means that these attributes are only available to this class itself.
- #: a visibility setting of protected is somewhere in between private and public–it means that these attributes can be accessed by this class or its subclasses, but nothing else.
- ~: a visibility setting of package/default means that any other class within the same package can access this attribute. 
Class Diagram is the most important
```
![alt text](image-2.png)
![alt text](image-3.png)
```
Inheritance is exactly what it sounds like: it shows which subclasses (aka child classes) inherit from a superclass (aka parent class). This keeps us from having to write out lists of attributes/methods that a group of classes share. Note that this is an empty arrow, not a filled in one, just as aggregation is an empty diamond. These differences are often very important.

Association is used to connect classes based on other kinds of relationships, such as connecting a student class to a computer class to show which kind of computer they use. Without a student to own the computer, we may still need to know about the computer class for our lessonCreation class or something similar. There's no inheritance involved here, but we can connect the two with a simple line to show association. We can also write the relationship on the line we draw, such as "uses", if we so choose. 

Aggregation, which is just a fancy word for "adding up", is used to show a relationship between more singular entities and what they combine to form. For example, you can have a student class without a cohort, but a cohort can't exist without a number of students. In this case, the open diamond would be drawn on the cohort class, with a simple line leading to the student class.

Composition is the opposite of aggregation, and it's easiest to think about in terms of "these parts compose the whole, but they can't exist without the whole." To continue with our student example, without a course class, a grades class, or a rollSheet class wouldn't exist. 

```
![alt text](image-4.png)
### Wrapper Class

```java
- Char -> Character , int -> Integer
Converting from a primitive data type into a wrapper class object is straightforward. For example, to convert int into an Integer object, we can do the following:
Integer intObject = Integer.valueOf(100); // or
AutoBoxing
Integer intObject = 100;

// In older versions of Java, no need to do this anymore:
Integer i = new Integer(2); // create an object with 2 in it
Double d = new Double(3.5); // create an object with 3.5 in it

// In newer versions of Java (9+), make sure you do this:
Integer i = 2;
Double d = 3.5;

We declare and instantiate an Integer object by passing a primitive int value of 100.  If we want to convert the Integer object back to an int, we can do the following:
int intPrimitive = intObject.intValue();
Unboxing
int intPrimitive = intObject;

Useful example:
public class Test2 {
   public static void main(String[] args) {
     Integer i = 2;
     Double d = 3.5;
     System.out.println( i.intValue() ); // intValue() returns the primitive value 2
     System.out.println( d.doubleValue() ); // 3.5

     String ageStr = "16";
     // Integer.parseInt and Double.parseDouble are often used to
     // convert an input string to a number so you can do math on it.
     System.out.println("Age " + ageStr + " in 10 years is " + (Integer.parseInt(ageStr) + 10) ); // 16 26
     System.out.println("Note that + with strings does concatenation, not addition: " + (ageStr + 10));
   }
   """
   Output:
        2
        3.5
        Age 16 in 10 years is 26
        Note that + with strings does concatenation, not addition: 1610
   """
}



String can be an int
int num = Integer.parseInt("100");

```
