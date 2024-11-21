package lang.string.method;

public class StringSearchMain {
    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java world";
        System.out.println("str1.contains(\"Java\") = " + str.contains("Java"));
        System.out.println("str1.indexOf(\"Java\") = " + str.indexOf("Java"));
        System.out.println("str1.indexOf(\"Java\", 10) = " + str.indexOf("Java", 10));
        System.out.println("str1.lastIndexOf(\"\") = " + str.lastIndexOf("Java"));
    }
}