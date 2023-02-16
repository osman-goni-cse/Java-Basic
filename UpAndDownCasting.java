class Sport {
    void displayName() {
        System.out.println("Sport");
    }
}

class Cricket extends Sport {
    void displayName() {
        System.out.println("Cricket");
    }
}

class Football extends Sport {
    void displayName() {
        System.out.println("Football");
    }
}

public class UpAndDownCasting {
    public static void main(String[] args) {
        System.out.println("######### Up Casting in Java #########");

        Sport sport1 = new Cricket();
        Sport sport2 = new Football();

        sport1.displayName();
        sport2.displayName();

        System.out.println("###### Down Casting in Java ######");
        Sport sport = new Cricket();
        Cricket castedToCricket = (Cricket) sport;
        // Cricket cricket = (Cricket) new Sport(); // throws ClassCastException
        castedToCricket.displayName();
    }
}
