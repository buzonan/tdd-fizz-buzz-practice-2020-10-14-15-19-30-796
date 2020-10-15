package tdd.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";

    public String countOff(int orderNumber) {
        if(isModuloOf(orderNumber, 3)){
            return FIZZ;
        }
        if(isModuloOf(orderNumber, 5)){
            return BUZZ;
        }
        if(isModuloOf(orderNumber, 7)){
            return WHIZZ;
        }
        return String.valueOf(orderNumber);
    }

    private boolean isModuloOf(int orderNumber, int i) {
        return orderNumber % i == 0;
    }
}
