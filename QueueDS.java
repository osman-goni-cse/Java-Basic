import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueDS {
    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<>();
        Queue<Double> students = new PriorityQueue<>();

        numbers.offer(5);
        numbers.offer(1);
        numbers.offer(2);

        System.out.println(numbers);
        System.out.println(numbers.peek());
        System.out.println(numbers.poll());

        System.out.println(numbers);

        students.offer(3.52);
        students.offer(3.99);
        students.offer(3.66);

        System.out.println("Students with CGPA: "+students);
        System.out.println(students.poll());
        System.out.println(students.poll());
    }
}
