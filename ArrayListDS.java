import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Iterator;
import java.util.Stack;

public class ArrayListDS {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();
        List<String> days = new LinkedList<>();
        Vector<String> university = new Vector<>();

        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");

        // System.out.println("AddAll elements: "+animals.addAll("Cow", "Bird"));

        System.out.println("Animals: "+animals);

        animals.remove(0);
        System.out.println("Animals "+animals);

        numbers.add(32); numbers.add(12); numbers.add(101);
        days.add("sat");days.add("sun");days.add("mon");days.add("tue");

        System.out.println("Numbers: "+ numbers);
        System.out.println("Days: "+days);

        for(int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        university.add("JUST");university.add("Sust");university.add("Du");

        Iterator<String> iterate = university.iterator();

        while(iterate.hasNext()) {
            System.out.println("Value: "+iterate.next());
        }

        System.out.println(university.contains("DU"));

        Vector<String> low = new Vector<>();
        low.add("CU");low.add("Ru");low.add("KU");

        low.set(2, "CUET");

        university.add(2, "DUET");
        university.addAll(low);
        System.out.println(university);

        Stack<Integer> stk = new Stack<>();

        stk.push(5);
        stk.push(12);
        stk.push(3);
        stk.push(9);

        System.out.println(stk);
        System.out.println(stk.peek());
        System.out.println(stk.pop());
        System.out.println(stk.peek());
        System.out.println(stk.search(12));

    }
}
