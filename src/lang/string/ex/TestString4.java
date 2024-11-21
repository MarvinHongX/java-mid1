package lang.string.ex;

public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";
        int i = str.indexOf(ext);
        String filename = str.substring(0, i);
        String extName = str.substring(i);
        System.out.println("filename = " + filename);
        System.out.println("extName = " + extName);
    }
}
