package lang.immutable.address;

public class RefMain1_3 {
    public static void main(String[] args) {
        // 객체를 공유함.
        Address a = new Address("서울");
        Address b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        change(b, "부산");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    private static void change(Address address, String newAddress) {
        System.out.println("주소값을 변경합니다: " + newAddress);
        address.setValue(newAddress);
    }
}