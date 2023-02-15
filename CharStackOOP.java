import java.util.Arrays;
import java.util.StringJoiner;

class CharStack {
    private char[] elements;
    private int count;

    CharStack() {
        elements = new char[10];
        count = 0;
    }

    public void push(char ch) {
        if(isFull()) {
            grow();
        }
        elements[count] = ch;
        count++;
    }

    public boolean isFull() {
        return elements.length == count;
    }

    public void grow() {
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count < 0;
    }

    public char pop() {
        count--;
        if(isEmpty()) {
            System.out.println("Stack is Empty");
            return '\t';
        }
        char ch = elements[count];
        return ch;
    }

    public void printElements() {
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        for(int i = 0; i < count; i++) {
            joiner.add(String.valueOf(elements[i]));
        }
        
        System.out.println(joiner);
    }
}

public class CharStackOOP {
    public static void main(String[] args) {
        System.out.println("Osman Goni");
        CharStack charStack = new CharStack();

        charStack.push('J');
        charStack.push('U');
        charStack.push('S');
        charStack.push('T');
        charStack.printElements();
        charStack.pop();
        charStack.printElements();
        charStack.pop();
        charStack.printElements();
        charStack.push('s');
        charStack.printElements();
        charStack.pop();
        charStack.pop();
        charStack.pop();
        charStack.pop();
        charStack.pop();
        charStack.printElements();
    }
}
