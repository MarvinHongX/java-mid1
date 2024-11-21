package lang.object.tostring;

public class Dog {
    private String dogName;

    public Dog(String dogName) {
        this.dogName = dogName;
    }

    @Override
    public String toString() {
        return super.toString() + "@" + dogName;
    }
}
