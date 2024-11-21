package lang.string.builder;

public class StringBuilderMain1_2 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        String string = s.append("Hello").append(", ").append("J").append("A").append("V").append("A").append("!")
            .insert(5, ", Python")
            .delete(13, 19)
            .reverse().toString();
        System.out.println("string = " + string);
    }
}