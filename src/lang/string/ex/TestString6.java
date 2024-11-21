package lang.string.ex;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        int index = 0;
        while ((index = str.indexOf(key, index)) != -1) {
            count++;
            index += key.length();
        }
        System.out.println(count);
    }
}
