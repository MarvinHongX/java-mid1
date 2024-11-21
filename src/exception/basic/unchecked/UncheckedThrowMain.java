package exception.basic.unchecked;

public class UncheckedThrowMain {
    public static void main(String[] args) {
        Service service = new Service();
        try {
            service.catchThrow();
        } catch (MyUncheckedException e) {
            System.out.println("메인에서 처리함: " + e.getMessage());
        }
        System.out.println("정상 종료");
    }
}
