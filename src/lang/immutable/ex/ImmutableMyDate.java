package lang.immutable.ex;

public class ImmutableMyDate {
    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    private ImmutableMyDate change(int year, int month, int day) {
        return new ImmutableMyDate(year, month, day);
    }

    public ImmutableMyDate withYear(int year) {
        return change(year, this.month, this.day);
    }

    public ImmutableMyDate withMonth(int month) {
        return change(this.year, month, day);
    }

    public ImmutableMyDate withDay(int day) {
        return change(this.year, this.month, day);
    }


    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
