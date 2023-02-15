class Operator {
    public static void main(String[] args) {
        int a = 10, b = 15;
        System.out.println(a+b);
        String str1 = "osman", str2 = "goni";

        System.out.println("Value of a is "+a);

        char ch = 'a';
        System.out.println(ch);
        System.out.println("Character is "+ ch);

        System.out.println(ch);

        System.out.println(str1+" "+str2);

        System.out.println(a+ch);

        boolean result = str1 instanceof String;
        System.out.println("Is str1 an object of String? " + result);
    }
}