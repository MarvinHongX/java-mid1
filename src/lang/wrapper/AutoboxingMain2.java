package lang.wrapper;

public class AutoboxingMain2 {
    public static void main(String[] args) {
        int value = 7;

        Integer boxedValue = value; // 오토 박싱(Auto-boxing), compiler 단계에서 수정해줌
        int unboxedValue = boxedValue; // 오토 언박싱(Auto-unboxing), compiler 단계에서 수정해줌

        System.out.println("boxedValue = " + boxedValue);     // boxedValue.toString()
        System.out.println("unboxedValue = " + unboxedValue); // String.valueOf(unboxedValue) 를 통해 문자열로 변환됨
    }
}