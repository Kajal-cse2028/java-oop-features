 // Demonstrate the single inheritance in Java.

class Animal{  // Parent Class
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  // Child class
void bark(){System.out.println("barking...");}  
}  
public class Main{  
public static void main(String args[]){  
Dog d=new Dog();  
d.bark();  
d.eat();  
}}  



// Output:

// barking...
// eating..
