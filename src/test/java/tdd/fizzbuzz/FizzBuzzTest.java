package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_return_Fizz_when_count_off_given_order_number_3() {
        //Given
        int orderNumber = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //When
        String actual = fizzBuzz.countOff(orderNumber);

        //Then
        assertEquals("Fizz", actual);
    }

    @Test
    void should_return_Buzz_when_count_off_given_order_number_5() {
        //Given
        int orderNumber = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //When
        String actual = fizzBuzz.countOff(orderNumber);

        //Then
        assertEquals("Buzz", actual);
    }

    @Test
    void should_return_Whizz_when_count_off_given_order_number_7() {
        //Given
        int orderNumber = 7;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //When
        String actual = fizzBuzz.countOff(orderNumber);

        //Then
        assertEquals("Whizz", actual);
    }

    @Test
    void should_return_FizzBuzz_when_count_off_given_order_number_15() {
        //Given
        int orderNumber = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //When
        String actual = fizzBuzz.countOff(orderNumber);

        //Then
        assertEquals("FizzBuzz", actual);
    }

    @Test
    void should_return_FizzWhizz_when_count_off_given_order_number_21() {
        //Given
        int orderNumber = 21;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //When
        String actual = fizzBuzz.countOff(orderNumber);

        //Then
        assertEquals("FizzWhizz", actual);
    }

    @Test
    void should_return_BuzzWhizz_when_count_off_given_order_number_35() {
        //Given
        int orderNumber = 35;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //When
        String actual = fizzBuzz.countOff(orderNumber);

        //Then
        assertEquals("BuzzWhizz", actual);
    }
}
