package lang.wrapper;

public class MyIntegerMethodMain1 {
    public static void main(String[] args) {
        MyInteger value = new MyInteger(10);
        System.out.println(value);

        int i1 = value.compareTo(5);
        System.out.println(i1);

        int i2 = value.compareTo(10);
        System.out.println(i2);

        int i3 = value.compareTo(20);
        System.out.println(i3);
    }
}