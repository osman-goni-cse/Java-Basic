public class Factorial {
    static int factorial(int x) {
        if(x == 0) return 1;
        if(x == 1 ) return 1;

        return x * factorial(x - 1);
    }
    public static void main(String[] args) {
        System.out.println("10 Factorial = "+factorial(10));
    }
}
