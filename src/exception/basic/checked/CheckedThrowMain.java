package exception.basic.checked;

public class CheckedThrowMain {
    public static void main(String[] args) {
        Service service = new Service();
        try {
            service.catchThrow();
        } catch (MyCheckedException e) {
            System.out.println("메인에서 처리함: " + e.getMessage());
        }
        System.out.println("정상 종료");
    }
}
