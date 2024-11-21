package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {
    public static void main(String[] args) {
        // 날짜를 문자로
        LocalDate date = LocalDate.of(2024, 12, 31);
        System.out.println("date = " + date);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        String formattedDate = date.format(formatter);
        System.out.println("formattedDate = " + formattedDate);

        // 문자를 날짜로
        String string = "2030년 01월 01일";
        LocalDate parsedDate = LocalDate.parse(string, formatter);
        System.out.println("parsedDate = " + parsedDate);
    }
}