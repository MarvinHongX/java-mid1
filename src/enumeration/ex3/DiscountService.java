package enumeration.ex3;

import static enumeration.ex3.Grade.*;

public class DiscountService {
    public int discount(Grade grade, int price) {
        int discountPercent = 0;

        if (grade == BASIC) {
            discountPercent = 10;
        } else if (grade == GOLD) {
            discountPercent = 20;
        } else if (grade == DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println(grade + "등급은 할인이 없습니다.");
        }
        return price * discountPercent / 100;
    }
}
