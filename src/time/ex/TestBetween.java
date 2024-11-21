package time.ex;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {
    public static void main(String[] args) {
        LocalDate sDate = LocalDate.of(2024, 1, 1);
        LocalDate eDate = LocalDate.of(2024, 11, 14);
        System.out.println("시작일: " + sDate);
        System.out.println("목표일: " + eDate);

        Period between = Period.between(sDate, eDate);
        System.out.println("남은기간 " + between.getYears() + "년 " + between.getMonths() + "개월 " + between.getDays() + "일");

        long between1 = ChronoUnit.DAYS.between(sDate, eDate);
        System.out.println("D-Day: " + between1 + "일");
    }
}
