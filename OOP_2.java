class Animal {
    protected String name;

    protected String type = "Animal";

    Animal() {
        System.out.println("I am an Animal");
    }
    Animal(String type) {
        System.out.println("Type: "+type);
    }
    
    public void eat() {
        System.out.println("I can eat.");
    }
}

class Dog extends Animal {
    protected String type = "Mammal";
    
    Dog() {
        super("Animal Viral");
        System.out.println(" I am dog");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("I can eat dog food");
    }

    protected void display() {
        System.out.println("I am an animal "+name);
    }

    public void bark() {
        System.out.println("I can bark");
    }
}

public class OOP_2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
        dog.name = "Kutta";
        dog.display();
    }
}
