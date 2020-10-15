package tdd.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";
    public static final int FIZZ_SPECIAL_NUMBER = 3;
    public static final int BUZZ_SPECIAL_NUMBER = 5;
    public static final int WHIZZ_SPECIAL_NUMBER = 7;

    public String countOff(int orderNumber) {
        if(isModuloOf(orderNumber, FIZZ_SPECIAL_NUMBER)){
            return FIZZ;
        }
        if(isModuloOf(orderNumber, BUZZ_SPECIAL_NUMBER)){
            return BUZZ;
        }
        if(isModuloOf(orderNumber, WHIZZ_SPECIAL_NUMBER)){
            return WHIZZ;
        }
        return String.valueOf(orderNumber);
    }

    private boolean isModuloOf(int orderNumber, int i) {
        return orderNumber % i == 0;
    }
}
