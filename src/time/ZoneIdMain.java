package time;

import java.time.ZoneId;

public class ZoneIdMain {
    public static void main(String[] args) {
        for (String zoneId : ZoneId.getAvailableZoneIds()) {
            ZoneId id = ZoneId.of(zoneId);
            System.out.println(id + " | " + id.getRules());
        }

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("zoneId = " + zoneId);

        ZoneId seoulZoneId = ZoneId.of("Asia/Seoul");
        System.out.println("seoulZoneId = " + seoulZoneId);
    }
}
