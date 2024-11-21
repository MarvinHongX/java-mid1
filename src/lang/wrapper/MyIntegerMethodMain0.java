package lang.wrapper;

public class MyIntegerMethodMain0 {
    public static void main(String[] args) {
        int value = 10;
        int i1 = compareTo(value, 5);
        System.out.println(i1);

        int i2 = compareTo(value, 10);
        System.out.println(i2);

        int i3 = compareTo(value, 20);
        System.out.println(i3);
    }

    public static int compareTo(int value, int target) {
        return (value > target) ? 1 : (value < target) ? -1 : 0;
    }
}
