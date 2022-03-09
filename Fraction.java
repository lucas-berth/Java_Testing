public class Fraction {
    
    private int numerator;
    private int denominator;
    private Names currentName;

    public Fraction(int numerator, int denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;
        this.currentName = currentName;
    }

    void display()
    {
        System.out.println(this.numerator + " / " + this.denominator);
    }

    int getNum()
    {
        return this.numerator;
    }

    public void setName(Names n)
    {
        this.currentName = n;
    }

}
