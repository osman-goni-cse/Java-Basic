class Lamp {
    boolean isOn;

    void turnOn() {
        isOn = true;
        System.out.println("Light is On? "+isOn);
    }

    void turnOff() {
        isOn = false;
        System.out.println("Light is On? "+isOn);
    }
}

class Polygon {
    public double Area(int width, int height) {
        double area = 0.5*width*height;
        return area;
    }
}

class Language {
    String name;
    public Language(String lang) {
        System.out.println("Programmng languages "+lang);
    }
}

class ThisOp {
    int instVar;
    ThisOp(int var) {
        this.instVar = var;
        System.out.println("This reference = "+this);
    }
}

class ThisExample {
    int x, y;
    ThisExample(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Before Add x = "+this.x+ " y = "+this.y);
        add(this);
        System.out.println("After Add x = "+this.x+ " y = "+this.y);
    }

    void add(ThisExample obj) {
        obj.x += 3;
        obj.y += 5;
    }
}

public class OOP_1 {
    private static void display(int a){
        System.out.println("Arguments: "+a);
    }

    private static void display(int a, double b) {
        System.out.println("Arguments "+a+" and "+b);
    }

    private static int getSquare(int x) {
        return x*x;
    }

    public static void main(String[] args) {
        Lamp led = new Lamp();
        Lamp halogen = new Lamp();

        led.turnOn();
        halogen.turnOff();

        Polygon triangle = new Polygon();
        double areaOfTriangle = triangle.Area(15, 12);
        System.out.println("Area of triangle is "+areaOfTriangle);

        for(int i = 1; i <= 5; i++) {
            System.out.println("Square is "+ getSquare(i));
        }

        display(10);
        display(5, 3.2);

        String first = "Osman Goni";
        
        StringBuilder second = new StringBuilder(first);
        second.setCharAt(0, 'F');
        System.out.println(second);

        String sec = "Md. ";

        System.out.println("Lenght of a string : "+second.length());
        String third = first.concat(sec);
        System.out.println("Concate: "+third );

        System.out.println("Strings first and third are equal?"+first.equals(third));

        ThisOp abc = new ThisOp(7);
        System.out.println("Object reference = "+abc);

        ThisExample xy = new ThisExample(4, 9);

    }
}
