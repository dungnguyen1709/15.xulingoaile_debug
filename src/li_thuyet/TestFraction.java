package li_thuyet;

public class TestFraction {
    public static void main(String[] args) {
        try {
            Fraction f = new Fraction(2,0);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
