package exception.ex3;

import exception.ex3.exception.*;

public class NetworkService {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClient client = new NetworkClient(address);

        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (ConnectException e) {
            System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메세지: " + e.getMessage());
        } catch (NetworkClientException e) {
            System.out.println("[네트워크 오류] 메세지: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("[알 수 없는 오류] 메세지: " + e.getMessage());
        } finally {
            client.disconnect();
        }
    }
}