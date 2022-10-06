package CoreJava;

public class TypeCasting {
    public static void main(String[] args) {
        System.out.println("Implicit Casting");
        byte b = 25;
        int i = b;
        System.out.println(i);
        int am = 80;
        double db = am;
        System.out.println(db);
        System.out.println("Explicit Casting");
        int num = 230;
        byte a = (byte) num;
        System.out.println(a);
        float num_2 = 440.3f;
        int num_3 = (int) num_2;
        System.out.println(num_3);
    }
}
