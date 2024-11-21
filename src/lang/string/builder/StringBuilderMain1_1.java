package lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        s.append("Hello");
        s.append(", ");
        s.append("J");
        s.append("A");
        s.append("V");
        s.append("A");
        s.append("!");

        System.out.println("s = " + s);
        s.insert(5, ", Python");
        System.out.println("s = " + s);
        s.delete(13, 19);
        System.out.println("s = " + s);

        s.reverse();
        System.out.println("s = " + s);
        String string = s.toString();
        System.out.println("string = " + string);
    }
}