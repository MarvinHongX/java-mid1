package nested.nested;

public class NestedOuterMain {
    public static void main(String[] args) {
        NestedOuter.Nested nested = new NestedOuter.Nested();
        nested.print();

        System.out.println("nested.getClass() = " + nested.getClass()); // 내부 클래스는 $로 구분

    }
}
