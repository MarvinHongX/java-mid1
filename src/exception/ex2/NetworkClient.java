package exception.ex2;

public class NetworkClient {
    private final String address;
    private boolean connectError;
    private boolean sendError;

    public NetworkClient(String address) {
        this.address = address;
    }

    public void connect() throws NetworkClientException {
        if (connectError) {
            throw new NetworkClientException(address + " 서버 연결 실패");
        }
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) throws NetworkClientException {
        if (sendError) {
            throw new NetworkClientException(address + " 서버에 데이터 전송 실패: " + data);
            // 중간에 다른 예외가 발생한다면?
//            throw new RuntimeException("error");
        }
        System.out.println(address + " 서버에 데이터 전송: " + data);
    }

    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }
    }

}
