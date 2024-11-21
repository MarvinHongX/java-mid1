package lang.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        // 현재 시간(밀리초)을 가져온다.
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        // 현재 시간(나노초)을 가져온다.
        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano = " + currentTimeNano);

        // 운영체제의 환경 변수를 가져온다.
        System.out.println("System.getenv() = " + System.getenv());

        // 자바의 시스템 속성을 가져온다.
        System.out.println("System.getProperties() = " + System.getProperties());
        System.out.println("System.getProperty(\"java.version\") = " + System.getProperty("java.version"));

        // 배열을 고속으로 복사한다.
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

        System.out.println("originalArray = " + Arrays.toString(originalArray));
        System.out.println("copiedArray = " + Arrays.toString(copiedArray));

        // 프로그램 종료
        System.exit(0);
        System.out.println("hello");
    }
}
