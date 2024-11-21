package enumeration.ex2;

import static enumeration.ex2.ClassGrade.*;

public class ClassGradeEx2 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(BASIC, price);
        int gold = discountService.discount(GOLD, price);
        int diamond = discountService.discount(DIAMOND, price);

        System.out.println("basic 할인 금액: " + basic);
        System.out.println("gold 할인 금액: " + gold);
        System.out.println("diamond 할인 금액: " + diamond);
    }
}