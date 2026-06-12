// Demonstrate the working of hierarchical inheritance in Java.
// Base class
class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

// Derived class 1
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Derived class 2
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // from Animal
        d.bark();  // from Dog

        Cat c = new Cat();
        c.eat();   // from Animal
        c.meow();  // from Cat
    }
}


// Output
// Animal eats food
// Dog barks
// Animal eats food
// Cat meows
