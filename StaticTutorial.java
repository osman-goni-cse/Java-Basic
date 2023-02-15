class Person {
    static int numberOfObject = 0;
    private String name;
    public Person(String name) {
        this.name = name;
        numberOfObject++;
        System.out.println("Object is created");
    }
}

public class StaticTutorial {
    public static void main(String[] args) {
        Person foo = new Person("Osman");
        
    }
}
