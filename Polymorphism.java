public class Polymorphism {
    public static void main(String args[]) {
        Dog g = new Dog();
        g.sound();
        g.sound("happy");

        Animal a1 = new Dog();
        Animal a2 = new Dog();

        a1.sound();
        a2.sound();
        
    }
}

class Animal {
    public void sound() {
     System.out.println("Animal makes sound");
    }
}
class Dog extends Animal {
    @Override 
    public void sound() {
        System.out.println("Dog barks");
    }
    public void sound(String mood) {
        System.out.println("Dog barks when " + mood);
    }
}
class cat extends Animal {
    @Override
    public 
    void sound() {
        System.out.println("Cat meows");
    }
}