public class Fraction {
    
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    void display()
    {
        System.out.println(this.numerator + " / " + this.denominator);
    }

    
}
