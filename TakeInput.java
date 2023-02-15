import java.util.Scanner;
import java.util.*;

class TakeInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a integer number");
        int number = input.nextInt();
        System.out.println("Entered integer number is "+number);
        System.out.println("Enter a double number");
        double dbl_value = input.nextDouble();
        System.out.println("Entered double number is "+dbl_value);
        System.out.println("Enter a floating point number");
        float float_value = input.nextFloat();
        System.out.println("Enterd Float number is "+ float_value);
        System.out.println("Enter a string");
        String str = input.nextLine();
        String str1 = input.nextLine();
        System.out.println("Entered string is "+str1);

        // String str = input.nextLine();
        // System.out.println("Entered string is "+str);

    }
}