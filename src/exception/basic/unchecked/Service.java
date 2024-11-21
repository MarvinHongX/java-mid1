package exception.basic.unchecked;

public class Service {
    Client client = new Client();

    public void callCatch() {
        try {
            client.call();
        } catch (MyUncheckedException e) {
            String message = e.getMessage();
            System.out.println(message);
        }

        System.out.println("정상 흐름");
    }

    public void catchThrow() { // throws MyUncheckedException 생략 해도 된다.
        client.call();
    }
}
