abstract class Hide {
    abstract void display() ;
    Hide() {
        System.out.println("This is hide abstract class constructor");
    }
}

class Picci extends Hide {
    public void display() {
        System.out.println("I am from Picc  and Picci Class");
    }

    Picci() {
        super();
        System.out.println("This is Picci class constructor");
    }
}

abstract class MotorBike {
    abstract void brake();
}

class SportsBike extends MotorBike {
    public void brake () {
        System.out.println("SportsBike brake does");
    }
}

class MountainBike extends MotorBike {
    public void brake () {
        System.out.println("Mountain Bike brake does");
    }
}

public class AbstractOOP {
    public static void main(String[] args) {
        // Hide hide = new Hide();
        Hide hide = new Picci();
        hide.display();

        SportsBike sport = new SportsBike();
        sport.brake();

        MountainBike mount = new MountainBike();
        mount.brake();
    }
}
