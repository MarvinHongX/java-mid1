package enumeration.ex2;

import static enumeration.ex2.ClassGrade.*;

public class ClassRefMain {
    public static void main(String[] args) {
        System.out.println("BASIC.getClass() = " + BASIC.getClass());
        System.out.println("GOLD.getClass() = " + GOLD.getClass());
        System.out.println("DIAMOND.getClass() = " + DIAMOND.getClass());

        System.out.println("BASIC = " + BASIC);
        System.out.println("GOLD = " + GOLD);
        System.out.println("DIAMOND = " + DIAMOND);
    }
}
