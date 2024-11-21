package lang.string.equals;

public class StringEqualsMain2 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        String str3 = "hello";
        String str4 = "hello";

        System.out.println(isSame(str1, str2));
        System.out.println(isSame(str3, str4));

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));
    }

    private static boolean isSame(String str1, String str2) {
//        return str1 == str2;
        return str1 == null ? str2 == null : str1.equals(str2);
    }


}
