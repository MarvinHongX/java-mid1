package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {
    public static void main(String[] args) {
        // 날짜와 시간을 문자로
        LocalDateTime now = LocalDateTime.of(2024, 12, 31,13,30,59);
        System.out.println("now = " + now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초");
        String formattedDateTime = now.format(formatter);
        System.out.println("formattedDateTime = " + formattedDateTime);

        // 문자를 날짜로
        String string = "2030년 01월 01일 13시 30분 59초";
        LocalDateTime parsedDateTime = LocalDateTime.parse(string, formatter);
        System.out.println("parsedDateTime = " + parsedDateTime);
    }
}