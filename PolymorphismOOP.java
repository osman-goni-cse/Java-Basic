import java.util.ArrayList;

class Liquid {
    public void swirl(boolean clockwise) {
        System.out.println("Swirling liquid");
    }
}

class Coffee extends Liquid {
    @Override
    public void swirl(boolean clockwise) {
        System.out.println("Swirling Coffee");
    }
}

class Milk extends Liquid {
    @Override
    public void swirl(boolean clockwise) {
        System.out.println("Swirling Milk");
    }
}

class Cup {
    ArrayList<Liquid> liquids = new ArrayList<>();

    public void addLiquid(Liquid liquid) {
        liquids.add(liquid);
    }

    public void mix() {
        for(Liquid liquid: liquids) {
            liquid.swirl(true);
        }
    }
}

public class PolymorphismOOP {
    public static void main(String[] args) {
        Liquid genericLiquid = new Liquid();
        Liquid milk = new Milk();
        Liquid coffee = new Coffee();


        Cup cup = new Cup();
        cup.addLiquid(genericLiquid);
        cup.addLiquid(milk);
        cup.addLiquid(coffee);
        cup.mix();
    }
}
