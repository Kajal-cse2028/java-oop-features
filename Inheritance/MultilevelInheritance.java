// Demonstrate the working of multilevel inheritance in Java.

class Animal{    // Base class
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{     // Intermediatory class
void bark(){System.out.println("barking...");}  
}  
class BabyDog extends Dog{    // Derived class
void weep(){System.out.println("weeping...");}  
}  
public class Main{  
public static void main(String args[]){  
BabyDog d=new BabyDog();  
d.weep();  
d.bark();  
d.eat();  
}}  



// Output:

// weeping...
// barking...
// eating...
