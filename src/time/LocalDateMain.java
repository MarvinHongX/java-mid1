package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(1990, 11, 14);
        System.out.println("오늘 날짜: " + nowDate);
        System.out.println("지정 날짜: " + ofDate);

        LocalDate ofDatePlus = ofDate.plusDays(10); // 모든 날짜 클래스는 불변이므로 반환값을 꼭 받아야 한다.
        System.out.println("ofDatePlus = " + ofDatePlus);
    }
}
