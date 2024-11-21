package lang.math.ex;

public class LottoGeneratorMain {
    public static void main(String[] args) {
        LottoGenerator generator = new LottoGenerator();
        generator.print(generator.generate());
    }
}