package lang.object.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("모델 Y");
        Dog dog = new Dog("호두");

        System.out.println("1. toString 호출");
        System.out.println(car.toString());
        System.out.println(dog.toString());

        System.out.println("2. println 내부에서 toString 호출");
        System.out.println(car);
        System.out.println(dog);

        System.out.println("3. Object 다형성 활용"); // 추상적인 것에 의존함.
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog);

        System.out.println("4. 실제 내부 구조");
        System.out.println(car.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(car)));
        System.out.println(dog.getClass().getName() + "@" + dog.hashCode());
    }
}