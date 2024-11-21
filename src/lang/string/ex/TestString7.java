package lang.string.ex;

public class TestString7 {
    public static void main(String[] args) {
        String original = "    Hello Java  ";

        String trim = original.trim();
        System.out.println("trim = '" + trim + "'");
        String strip = original.strip();
        System.out.println("strip = '" + strip + "'");
    }
}
