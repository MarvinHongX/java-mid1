package exception.basic.unchecked;

public class Client {
    public void call() {   // throws MyUncheckedException 생략해도 자동으로 예외를 던진다.
        // 문제발생
        throw new MyUncheckedException("ex");
    }
}
