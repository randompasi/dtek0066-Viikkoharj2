package Teht3;

public class Fraction {
    private int numerator;
    private int demoninator;



    /**
     *
     * @param numerator
     * @param demoninator
     * @.pre numerator != 0 && demoninator != 0
     * @.post this.numerator == numerator && this.demoninator == demoninator
     * limits:  -2147483648 to 2147483647 on variables. Over this will loop number to other end 2147483647+1 -> -2147483648
     * both cannot be 0 otherwise program will stop with Illegalargumenexception
     * same if negative numbers
     * @throws Illegalargumenexception
     */
    public Fraction(int numerator, int demoninator) {
        if(numerator == 0 || numerator < 0) throw new IllegalArgumentException("numerator is 0");
        if(demoninator == 0 || demoninator < 0) throw new IllegalArgumentException("demoninator is 0");
        this.numerator = numerator;
        this.demoninator = demoninator;
    }


}
