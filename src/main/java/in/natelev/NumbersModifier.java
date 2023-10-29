package in.natelev;

public class NumbersModifier {
    public int add(int b) {
        Numbers.num = Numbers.num + b;
        return Numbers.num;
    }
    public int reset() {
        Numbers.num = 0;
    }
}
