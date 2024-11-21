package lang.string.method;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = "hello, world!";
        String str3 = "Hello, Java!";

        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str1.equalsIgnoreCase(str2): " + str1.equalsIgnoreCase(str2));

        System.out.println("\"a\".compareTo(\"b\"): " + "a".compareTo("b"));
        System.out.println("\"b\".compareTo(\"a\"): " + "b".compareTo("a"));
        System.out.println("\"c\".compareTo(\"b\"): " + "c".compareTo("a"));

        System.out.println("str1.compareTo(str3) = " + str1.compareTo(str3));
        System.out.println("str1.compareToIgnoreCase(str2) = " + str1.compareToIgnoreCase(str2));

        System.out.println("str1.startsWith(\"Hello\") = " + str1.startsWith("Hello"));
        System.out.println("str2.startsWith(\"Hello\") = " + str2.startsWith("Hello"));

        System.out.println("str3.endsWith(\"Java!\") = " + str3.endsWith("Java!"));
    }
}
