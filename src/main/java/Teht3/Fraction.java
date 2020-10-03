package Teht3;

public class Fraction {

    /**
     *
     * @param numerator
     * @param demoninator
     * limits:  -2147483648 to 2147483647 on variables. Over this will loop number to other end 2147483647+1 -> -2147483648
     * both cannot be 0 otherwise program will stop with illegalargumenexception
     */
    private int numerator;
    private int demoninator;

    public Fraction(int numerator, int demoninator) {
        if(numerator == 0) throw new IllegalArgumentException("numerator is 0");
        if(demoninator == 0) throw new IllegalArgumentException("demoninator is 0");
        this.numerator = numerator;
        this.demoninator = numerator;


    }
}
