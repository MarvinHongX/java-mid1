package lang.immutable.address;

public class RefMain1_1 {
    public static void main(String[] args) {
        // 객체를 공유함.
        Address a = new Address("서울");
        Address b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산");

        System.out.println("a = " + a); // 사이드 이펙트 발생
        System.out.println("b = " + b);
    }
}