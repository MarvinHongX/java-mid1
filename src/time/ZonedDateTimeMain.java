package time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeMain {
    public static void main(String[] args) {
        ZonedDateTime nowZdt = ZonedDateTime.now();
        System.out.println("nowZdt = " + nowZdt);

        LocalDateTime lDt = LocalDateTime.of(2030, 1, 1, 13, 30, 20);
        System.out.println("lDt = " + lDt);

        ZonedDateTime zDt1 = ZonedDateTime.of(lDt, ZoneId.of("Asia/Seoul"));
        System.out.println("zDt1 = " + zDt1);

        ZonedDateTime zDt2 = ZonedDateTime.of(2030, 1, 1, 13, 30, 20, 0, ZoneId.of("Asia/Seoul"));
        System.out.println("zDt2 = " + zDt2);

        ZonedDateTime utcZDt = zDt2.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println("utcZDt = " + utcZDt);
    }
}
