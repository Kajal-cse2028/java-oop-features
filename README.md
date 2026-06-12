# Object-Oriented Programming Features in Java

This repository demonstrates the four pillars of OOP in Java with simple, beginner-friendly examples.

---
## 🚀 Features Covered
- **Inheritance**: Code reuse and hierarchy
- **Polymorphism**: Method overriding and dynamic dispatch
- **Abstraction**: Abstract classes and interfaces
- **Encapsulation**: Data hiding with getters/setters

---
# Inheritance 
 Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of  a parent object.
 ## Syntax
    class Subclass-name extends Superclass-name  
    {  
      //methods and fields  
    } 
## Types of Inheritance
There are several types of inheritance supported in Java:

1. Single Inheritance:
   Single inheritance allows a subclass inherits from one superclass only.
2. Multilevel Inheritance:
   Multilevel inheritance allows a class is derived from a subclass, forming a chain of inheritance.
3. Hierarchical Inheritance:
   Hierarchical inheritance allows multiple subclasses inherit from the same superclass.
4. Hybrid Inheritance (Through Interfaces):
   Hybrid inheritance combines two or more types of inheritance using interfaces to avoid multiple      inheritance issues.
5. Multiple Inheritance
   Multiple Inheritance A class's capacity to inherit traits from several classes is referred to as     multiple inheritances.
-  In Java, multiple inheritance and hybrid inheritance are supported only through interfaces, because Java does not allow multiple inheritance with classes directly.
 
---
# Polymorphism
  Polymorphism in Java is an object-oriented concept that allows the same method name to perform       different tasks based on the object or parameters.
## There are two types of polymorphism in Java:
 - Compile-time Polymorphism
 - Runtime Polymorphism.
## 1. Java Compile-Time Polymorphism
  In Java, method overloading is used to achieve compile-time polymorphism. Using method     overloading, a class can have multiple methods with the same name but different parameter lists. The   compiler determines which method to call at compile time based on the number, type, and order of   parameters passed.
## 2. Runtime Polymorphism in Java
  Runtime polymorphism, also known as Dynamic Method Dispatch, is a process in which the call to an    overridden method is resolved at runtime rather than at compile time.
   In this process, an overridden method is invoked using a superclass reference variable that     refers to a subclass object. The method that gets executed is determined by the actual object being     referred to, not by the reference type.
   
---
# Abstraction
Abstraction is the process of hiding implementation details and showing only the required functionality to the user. In other words, it displays only the essential features while hiding internal details.
## There are two ways to achieve abstraction in Java:

- Using Abstract Class (can provide 0% to 100% abstraction)
- Using Interface (provides 100% abstraction)

---
## 1. Abstract Class in Java
- An abstract class must be declared with an abstract keyword.
- It can have abstract and non-abstract methods.
- It cannot be instantiated.
- It can have constructors and static methods also.
- It can have final methods which will force the subclass not to change the body of the method.
## Syntax
    public abstract class Shape {  
      public abstract double area();  
      public void display() {  
        System.out.println("This is a shape.");  
      }  
    } 
## 2. Interface in Java
- An interface is a blueprint of a class that contains static constants and abstract methods.
- Interfaces are used to achieve abstraction.
- An interface contains only abstract methods (methods without a body) and variables.
- It cannot be instantiated, similar to an abstract class, and represents an IS-A relationship.
## Syntax 
    interface <interface_name> {  
      // declare constant fields  
      // declare abstract methods  
    }  
---
# Encapsulation
Encapsulation is the process of wrapping data and code (methods) together into a single unit. A capsule is a good example of encapsulation because it contains a mixture of several medicines in one unit.


<img width="331" height="230" alt="image" src="https://github.com/user-attachments/assets/dfaffb7a-0a1d-4c43-a119-947413e024cb" />


- Encapsulation helps to protect data and control access to it.
- It protects sensitive data from being access directly.
- It hides unnecessary data from the user of a class, and only shows the functionality of a class.
- Changes can be made internally without affecting the external interface.
- It is easier to scale applications because it provides flexibility to add or modify features without impacting the entire codebase.
- Encapsulated classes can be reused across projects.
---
## 📂 How to Run
1. Clone the repo:
   ```bash
   git clone https://github.com/Kajal-cse2028/java-oop-features.git
2. Navigate to src folder and compile:
   
       javac InheritanceDemo.java
       java InheritanceDemo

---
## 📖 Quick Revision (English + Hindi)

| Feature        | Definition (English) | परिभाषा (Hindi) | Example | Key Benefit |
|----------------|----------------------|-----------------|---------|-------------|
| **Inheritance** | Mechanism of acquiring properties/methods of another class | एक क्लास की विशेषताओं/मेथड्स को दूसरी क्लास में लेना | `class Dog extends Animal` | Code reuse, hierarchy |
| **Polymorphism** | Ability of a method to behave differently based on context | एक ही मेथड का अलग-अलग रूप में व्यवहार करना | `Animal a = new Dog(); a.sound();` | Flexibility, dynamic behavior |
| **Abstraction** | Hiding implementation details, showing only essentials | Implementation छुपाना और केवल ज़रूरी बातें दिखाना | `abstract class Shape { abstract void draw(); }` | Focus on “what” not “how” |
| **Encapsulation** | Wrapping data + methods together, restricting direct access | डेटा और मेथड्स को एक साथ बाँधना और direct access रोकना | `private String name; public void setName(...)` | Security, controlled access |

---

