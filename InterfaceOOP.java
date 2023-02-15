interface Polygono {

    void getArea() ;
    default void getPerimeter(int... sides) {
        int perimeter = 0;
        for(int side: sides)
            perimeter += side;

        System.out.println("Perimeter is " +perimeter);
    }
}

class Triangle implements Polygono {
    private int a, b, c;
    private double s, area;

    Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        s = 0;
    }

    public void getArea() {
        s = (double) (a+b+c) / 2;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area is "+area);
    }
}

public class InterfaceOOP {
    public static void main(String[] args) {
        Triangle t = new Triangle(5, 6, 4);
        t.getArea();  
        t.getPerimeter(2, 3 ,4, 10, 15);
    }
}
