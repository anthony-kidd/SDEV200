import java.math.BigInteger;

public class Rational extends Number implements Comparable<Rational> {
    private BigInteger numerator;
    private BigInteger denominator;

    /** Construct a rational with default properties */
    public Rational() {
        this(BigInteger.ZERO, BigInteger.ONE);
    }

    /** Construct a rational with specified numerator and denominator */
    public Rational(BigInteger numerator, BigInteger denominator) {
        if (denominator.equals(BigInteger.ZERO)) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }

        // Normalize the sign of the rational number
        if (denominator.signum() < 0) {
            this.numerator = numerator.negate();
            this.denominator = denominator.negate();
        } else {
            this.numerator = numerator;
            this.denominator = denominator;
        }

        // Reduce to lowest terms
        BigInteger gcd = gcd(this.numerator.abs(), this.denominator.abs());
        this.numerator = this.numerator.divide(gcd);
        this.denominator = this.denominator.divide(gcd);
    }

    /** Find GCD of two BigIntegers */
    private static BigInteger gcd(BigInteger a, BigInteger b) {
        while (!b.equals(BigInteger.ZERO)) {
            BigInteger temp = b;
            b = a.mod(b);
            a = temp;
        }
        return a;
    }

    /** Return numerator */
    public BigInteger getNumerator() {
        return numerator;
    }

    /** Return denominator */
    public BigInteger getDenominator() {
        return denominator;
    }

    /** Add a rational number to this rational */
    public Rational add(Rational secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator())
                .add(denominator.multiply(secondRational.getNumerator()));
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new Rational(n, d);
    }

    /** Subtract a rational number from this rational */
    public Rational subtract(Rational secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator())
                .subtract(denominator.multiply(secondRational.getNumerator()));
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new Rational(n, d);
    }

    /** Multiply a rational number by this rational */
    public Rational multiply(Rational secondRational) {
        BigInteger n = numerator.multiply(secondRational.getNumerator());
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new Rational(n, d);
    }

    /** Divide a rational number by this rational */
    public Rational divide(Rational secondRational) {
        if (secondRational.numerator.equals(BigInteger.ZERO)) {
            throw new ArithmeticException("Division by zero");
        }
        BigInteger n = numerator.multiply(secondRational.getDenominator());
        BigInteger d = denominator.multiply(secondRational.numerator);
        return new Rational(n, d);
    }

    @Override
    public String toString() {
        if (denominator.equals(BigInteger.ONE)) {
            return numerator.toString();
        } else {
            return numerator + "/" + denominator;
        }
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof Rational)) return false;
        Rational otherRational = (Rational) other;
        return this.subtract(otherRational).getNumerator().equals(BigInteger.ZERO);
    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return numerator.doubleValue() / denominator.doubleValue();
    }

    @Override
    public long longValue() {
        return numerator.longValue() / denominator.longValue();
    }

    @Override
    public int compareTo(Rational o) {
        BigInteger difference = this.subtract(o).getNumerator();
        return difference.signum();
    }
}
