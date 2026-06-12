// Demonstrate the working of hybrid inheritance in Java.

// Base class
class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

// Derived class (Single Inheritance)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Another base interface
interface Pet {
    void play();
}

// Hybrid Inheritance: Dog inherits Animal and implements Pet
class Puppy extends Dog implements Pet {
    public void play() {
        System.out.println("Puppy loves to play");
    }
}

public class HybridInheritanceDemo {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();   // from Animal
        p.bark();  // from Dog
        p.play();  // from Pet
    }
}


// Output

// Animal eats food
// Dog barks
// Puppy loves to play
