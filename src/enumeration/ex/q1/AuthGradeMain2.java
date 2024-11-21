package enumeration.ex.q1;

import java.util.Arrays;
import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AuthGrade[] authGrades = AuthGrade.values();
        String gradeStr = Arrays.toString(authGrades);
        System.out.print("당신의 등급을 입력하세요" + gradeStr + ": ");
        String choice = scanner.nextLine();
        AuthGrade choiceGrade = AuthGrade.valueOf(choice.toUpperCase());
        System.out.println("당신의 등급은 " + choiceGrade.getDescription() + "입니다.");
        showMenu(choiceGrade);
    }

    private static void showMenu(AuthGrade grade) {
        System.out.println("==메뉴 목록==");
        if (grade.getLevel() >= 1) {
            System.out.println("- 메인 화면");
        }
        if (grade.getLevel() >= 2) {
            System.out.println("- 이메일 관리 화면");
        }
        if (grade.getLevel() >= 3) {
            System.out.println("- 관리자 화면");
        }
    }
}
