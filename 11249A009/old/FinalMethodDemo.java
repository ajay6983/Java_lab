class Animal {
    final void display() {
        System.out.println("This is a final method.");
    }
}

class Dog extends Animal {
    
}

public class FinalMethodDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}