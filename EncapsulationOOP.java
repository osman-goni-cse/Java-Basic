class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 0) {
            this.age = age;
        }
    }
}

public class EncapsulationOOP {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(19);
        System.out.printf("Age is %d\n", p1.getAge());
    }
}
