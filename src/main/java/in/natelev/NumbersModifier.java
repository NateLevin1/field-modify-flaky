package in.natelev;

public class NumbersModifier {
    public int add(int b) {
        Numbers.num = Numbers.num + b;
        return Numbers.num;
    }
    public void reset() {
        Numbers.num = 0;
    }
}
