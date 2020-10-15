package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_return_Fizz_when_number_modulo_3_given_3() {
        //Given
        int orderNumber = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //When
        String actual = fizzBuzz.countOff(orderNumber);

        //Then
        assertEquals("Fizz", actual);
    }
}
