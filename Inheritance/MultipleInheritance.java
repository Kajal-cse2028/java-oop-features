// First interface
interface Printable {
    void print();
}

// Second interface
interface Showable {
    void show();
}

// A class implementing both interfaces → Multiple Inheritance
class Demo implements Printable, Showable {
    public void print() {
        System.out.println("Printing...");
    }
    public void show() {
        System.out.println("Showing...");
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.print();  // from Printable
        d.show();   // from Showable
    }
}


//  Output
   
// Printing...
// Showing...
