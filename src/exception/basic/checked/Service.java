package exception.basic.checked;

public class Service {
    Client client = new Client();

    public void callCatch() {
        try {
            client.call();
        } catch (MyCheckedException e) {
            String message = e.getMessage();
            System.out.println(message);
        }

        System.out.println("정상 흐름");
    }

    public void catchThrow() throws MyCheckedException {
        client.call();
    }
}
