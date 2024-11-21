package lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        String[] splitStr = str.split(",");
        for (String s : splitStr) {
            System.out.println(s);
        }

        String joinStr = "";
        for (int i = 0; i < splitStr.length; i++) {
            joinStr += splitStr[i];
            if (i < splitStr.length - 1) {
                joinStr += "-";
            }
        }
        System.out.println(joinStr);

        String join = String.join("-", splitStr);
        System.out.println(join);

    }
}
