package exception.ex2;

public class NetworkService {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClient client = new NetworkClient(address);

        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (NetworkClientException e) {
            System.out.println("메세지: " + e.getMessage());
        } finally {
            client.disconnect();
        }
    }
}