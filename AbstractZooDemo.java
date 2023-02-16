abstract class Animal {
    private final String name;
    private final int legs;

    Animal(String name, int legs) {
        this.name = name;
        this.legs = legs;
    }

    @Override
    public String toString() {
        return "Animal " + this.name + " has "+this.legs;
    }
}

class Tiger extends Animal {
    Tiger(String name, int legs) {
        super(name, legs);
    }

}

class Lion extends Animal {
    Lion(String name, int legs) {
        super(name, legs);
    }
}

class Snake extends Animal {
    Snake(String name, int legs) {
        super(name, legs);
    }
}

class Zoo {
    private Animal[] animals;

    public Zoo(Animal[] animals) {
        this.animals = animals;
    }

    public void printInfo() {
        for(Animal animal: animals) {
            System.out.println(animal.toString());
        }
    }
}


public class AbstractZooDemo {
    public static void main(String[] args) {
        
        Animal[] animals = new Animal[3];
        animals[0]= new Tiger("Tiger Bulldfa", 4);
        animals[1]= new Lion("Lion",4);
        animals[2]= new Snake("King Kobra", 0);

        Zoo chittagongZoo = new Zoo(animals);
        chittagongZoo.printInfo();

    }
}
