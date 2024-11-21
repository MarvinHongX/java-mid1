package lang.string.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        System.out.println("String.valueOf(num) = " + String.valueOf(num));
        System.out.println("String.valueOf(bool) = " + String.valueOf(bool));
        System.out.println("String.valueOf(obj) = " + String.valueOf(obj));
        System.out.println("String.valueOf(str) = " + String.valueOf(str));

        System.out.println("(\"\" + num) = " + ("" + num));
        System.out.println("(\"\" + bool) = " + ("" + bool));
        System.out.println("(\"\" + obj) = " + ("" + obj));
        System.out.println("(\"\" + str) = " + ("" + str));

        char[] strCharArray = str.toCharArray();
        for (char c : strCharArray) {
            System.out.print(c);
        }
    }
}
