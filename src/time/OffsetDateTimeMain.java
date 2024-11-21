package time;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeMain {
    public static void main(String[] args) {
        OffsetDateTime nowODt = OffsetDateTime.now();
        System.out.println("nowODt = " + nowODt);

        LocalDateTime lDt = LocalDateTime.of(2030, 1, 1, 13, 30, 20);
        System.out.println("lDt = " + lDt);
        OffsetDateTime oDt = OffsetDateTime.of(lDt, ZoneOffset.of("+01:00"));
        System.out.println("oDt = " + oDt);
    }
}
