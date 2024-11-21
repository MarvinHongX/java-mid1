package exception.ex4;

import exception.ex4.exception.ConnectException;
import exception.ex4.exception.SendException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NetworkService networkService = new NetworkService();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }

            try {
                networkService.sendMessage(input);

            } catch (Exception e) {
                exceptionHandler(e);
            }
            System.out.println();

        }
        System.out.println("프로그램을 정상 종료합니다.");
    }

    private static void exceptionHandler(Exception e) {
        System.out.println("죄송합니다. 알 수 없는 문제가 발생했습니다.");

        System.out.println("== 디버깅 메세지 ==");
        e.printStackTrace(System.out);
        if (e instanceof ConnectException f) {
            System.out.println("주소: " + f.getAddress());
        } else if (e instanceof SendException f) {
            System.out.println("데이터: " + f.getSendData());
        }
    }
}
