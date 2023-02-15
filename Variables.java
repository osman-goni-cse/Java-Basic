class Variables {
    int instance_variable;
    static int static_variable;

    public static void main(String[] args) {
        int local_variable = 5;
        System.out.println(local_variable);
        System.out.println(static_variable);
        // Variables obj = new Variables();
        // System.out.println(obj.instance_variable);
    }
}