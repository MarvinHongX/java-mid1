package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInteger = new Integer(10);
        Integer integerObj = Integer.valueOf(10); // -128 ~ 127 자주 사용하는 숫자 값 재사용
        System.out.println("newInteger = " + newInteger);
        System.out.println("integerObj = " + integerObj);

        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(1.234567890123456789);
        Float floatObj = Float.valueOf(10.3f);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);
        System.out.println("floatObj = " + floatObj);

        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue();
        long longValue = longObj.longValue();
        double doubleValue = doubleObj.doubleValue();
        float floatValue = floatObj.floatValue();
        System.out.println("intValue = " + intValue);
        System.out.println("longValue = " + longValue);
        System.out.println("doubleValue = " + doubleValue);
        System.out.println("floatValue = " + floatValue);

        System.out.println("비교");
        System.out.println("==: " + (newInteger == integerObj));
        System.out.println("equals: " + newInteger.equals(integerObj));
    }
}