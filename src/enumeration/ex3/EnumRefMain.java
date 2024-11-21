package enumeration.ex3;

import static enumeration.ex3.Grade.*;

public class EnumRefMain {
    public static void main(String[] args) {
        System.out.println("BASIC.getClass() = " + BASIC.getClass());
        System.out.println("GOLD.getClass() = " + GOLD.getClass());
        System.out.println("DIAMOND.getClass() = " + DIAMOND.getClass());

        System.out.println("BASIC = " + BASIC); // toString()을 오버라이딩 해둠
        System.out.println("GOLD = " + GOLD);
        System.out.println("DIAMOND = " + DIAMOND);

        System.out.println("BASIC = " + refValue(BASIC)); // toString()을 오버라이딩 해둠
        System.out.println("GOLD = " + refValue(GOLD));
        System.out.println("DIAMOND = " + refValue(DIAMOND));
    }

    private static String refValue(Object obj) {
        return obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
    }
}
