package CoreJava;

public class Operators {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10;
        int b = 20;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        // Relational Operators
        System.out.println("Relational Operators");
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a != b);

        // Logical Operators
        System.out.println("Logical Operators");
        boolean var = true;
        boolean num = false;
        boolean x = true;

        System.out.println(var & x);
        System.out.println(var & num);
        System.out.println(var | num);
        System.out.println(var | x);
    }

}
