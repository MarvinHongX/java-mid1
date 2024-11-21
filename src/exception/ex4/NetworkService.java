package exception.ex4;

public class NetworkService {
    public void sendMessage(String data) {
        String address = "http://example.com";

        try (NetworkClient client = new NetworkClient(address)) {
            client.initError(data);
            client.connect();
            client.send(data);
        } catch (Exception e) {
            System.out.println("예외 확인: " + e.getMessage());
            throw e;
        }
    }
}