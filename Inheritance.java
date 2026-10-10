public class Inheritance {
    public static void main(String args[]) {
        Puppy P = new Puppy();
        P.eat();
        P.barks();
        P.weep();
        
    }
}

class Animal {
    public void eat() {
        System.out.println("Animal is eat");
    }
}
class Dog extends Animal {
    public void barks() {
        System.out.println("Dog is barks");
    }
}
class Puppy extends Dog{
    public void weep() {
        System.out.println("Puppy is weep");
    }
}