
public class Oriented {
    public static void main(String args[]) {
        // Animal A = new Animal();
        // Dog D = new Dog();
        // Puppy P = new Puppy();
        // A.eat();
        // D.eat();
        // D.bark();

        // P.eat();
        // P.weep();

        // Number N = new Number(2, 4);
        // System.out.println(N.a + N.b);

        // Student N = new Student();
        // N.setName("Ankit");
        // // N.getName();
        // System.out.println(N.getName());

        //Encapsulation
        // Human H = new Human();
        // H.setName("Ankit");
        // H.setAge(23);
        // H.setHieght(50.5);

        // System.out.println("Name is :" + " " + H.getName());
        // System.out.println("Age is :" + H.getAge());
        // System.out.println("Hieght is :" + H.getHieght());

        //Inheritance
        // Tata T = new Tata();
        // T.brand();
        // T.name();

        //Polymorphism
        // Animal1 A = new Animal1();
        // Dog1 D = new Dog1();
        // A.sound();
        // D.bark();
        // D.eat();

        
        //Abstraction
        Animal2 A2 = new Dog2();
        A2.sound1();

    }
}

class Animal {
    public void eat() {
        System.out.println("Animal eats"); 
    }
}

class Dog extends Animal {
    @Override 
    public void eat() {
        System.out.println("Dog eat bones");
    }
    public void bark() {
        System.out.println("Dog bark");
    }
}


class Puppy extends Dog{
    @Override 
    public void eat() {
        System.out.println("Puppy eat milk");
    }
    public void weep() {
        System.out.println("Puppy weep");
    }
}
class Number {
    int a;
    int b;

    public Number(int val, int val1) {
        this.a=val;
        this.b=val1;

    }
}
class Student{
    private String name;

    public void setName(String name) {
        this.name=name;
    }
    public String getName() {
        return name;
    }
}

//Ecapsulation
class Human {
    private String name;
    private int age;
    private double height;

    //Getter
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setHieght(double hieght) {
        this.height=hieght;
    }

    //Setter
    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getHieght() {
        return height;
    }
}

// Inheritance

class Car {
    public void brand(){
        System.out.println("Tata");
    }
}
class Tata extends Car {
    public void name() {
        System.out.println("Tata Safari");
    }
}

//Polymorphism

class Animal1 {
    public void sound() {
        System.out.println("Animal Sound");
    }
}
class Dog1 extends Animal {
    @Override 
    public void eat() {
        System.out.println("Dog eat bones");
    }
    public void bark() {
        System.out.println("Dog bark");
    }
}


//Abstraction
abstract class Animal2{
    abstract void sound1();
}
class Dog2 extends Animal2{
    public void sound1() {
        System.out.println("Dog barks");
    }
}