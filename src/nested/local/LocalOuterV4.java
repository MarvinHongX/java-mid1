package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {
    private int outInstanceVar = 3;

    public Printer process(int paramVar) {
        final int localVar = 1; // 지역 변수는 스택 프레임이 종료되는 순간 함께 제거된다.

        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);

                // 인스턴스는 지역변수보다 더 오래 살아남는다.
                System.out.println("localVar = " + localVar); // 사실상 final
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        // 만약 localVar의 값을 변경한다면?
//        localVar = 10; // compile error
//        paramVar = 20; // compile error
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuter = new LocalOuterV4();
        Printer printer = localOuter.process(2); // 지역 변수의 생명주기는 짧고, 지역 클래스를 통해 생성한 인스턴스의 생명 주기는 길다.

        printer.print(); // process()의 스택 프레임이 사라진 이후에 실행한다.

        // 추가
        System.out.println("필드 확인");
        Field[] declaredFields = printer.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
    }
}
