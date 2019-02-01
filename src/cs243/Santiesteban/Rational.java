package cs243.Santiesteban;

public class Rational {

    //All Public Properties
    public Rational() {
        m_numerator = 1;
        m_denominator = 1;
    }

    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero!");
        }
        if (numerator < 0 || denominator < 0) {
            throw new IllegalArgumentException("Numertor and/or Denominator cannot be negative!");
        } else {

            m_numerator = numerator;
            m_denominator = denominator;

            temp_numerator = numerator;
            temp_denominator = denominator;
        }
    }

    public String reduce() {
        reduce_completely();

        return (temp_numerator + "/" + temp_denominator);
    }

    public String add(Rational rationalNum)
    {
       restart_tempNum();
       rationalNum.restart_tempNum();

        if(m_denominator != rationalNum.m_denominator)
        {
            temp_numerator = temp_numerator * rationalNum.m_denominator;
            temp_denominator = temp_denominator * rationalNum.m_denominator;

            rationalNum.temp_numerator = rationalNum.temp_numerator * m_denominator;
            //rationalNum.temp_denominator = rationalNum.temp_denominator * m_denominator
        }
        int numeratorSum = temp_numerator + rationalNum.temp_numerator;
        int denominatorSum = temp_denominator;

        Rational sumRational = new Rational(numeratorSum,denominatorSum);

        return sumRational.reduce();
    }

    public String multiply(Rational rationalNum)
    {
        restart_tempNum();
        rationalNum.restart_tempNum();

        int multNumerator = m_numerator * rationalNum.m_numerator;
        int multDenominator = m_denominator * rationalNum.m_denominator;

        Rational multRational = new Rational(multNumerator, multDenominator);

        return multRational.reduce();
    }

    //All Private Properties
    private void reduce_completely() {

        //Check if num are divisible by 2,3,5,7,9
        restart_tempNum();
        while (temp_numerator % 2 == 0 && temp_denominator % 2 == 0) {
            temp_denominator = temp_denominator / 2;
            temp_numerator = temp_numerator / 2;
        }
        while (temp_numerator % 3 == 0 && temp_denominator % 3 == 0) {
            temp_denominator = temp_denominator / 3;
            temp_numerator = temp_numerator / 3;
        }
        while (temp_numerator % 5 == 0 && temp_denominator % 5 == 0) {
            temp_denominator = temp_denominator / 5;
            temp_numerator = temp_numerator / 5;
        }
        while (temp_numerator % 7 == 0 && temp_denominator % 7 == 0) {
            temp_denominator = temp_denominator / 7;
            temp_numerator = temp_numerator / 7;
        }
        while (temp_numerator % 9 == 0 && temp_denominator % 9 == 0) {
            temp_denominator = temp_denominator / 9;
            temp_numerator = temp_numerator / 9;
        }
    }
    private void restart_tempNum()
    {
        temp_denominator = m_denominator;
        temp_numerator = m_numerator;
    }

    private int m_numerator;
    private int temp_numerator;

    private int m_denominator;
    private int temp_denominator;

}

