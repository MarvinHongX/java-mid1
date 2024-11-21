package lang.wrapper;

public class MyInteger {
    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int compareTo(int target) {
        return (value > target) ? 1 : (value < target) ? -1 : 0;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
