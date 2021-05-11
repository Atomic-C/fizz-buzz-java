import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void convertLeavesNormalNumbersAlone() {

        String inputTest = "3";
        InputStream in = new ByteArrayInputStream(inputTest.getBytes());
        System.setIn(in);
        assertEquals("3", fizzBuzz.convert(3));

    }

    @Test
    public void multiplesOfThree() {

        String inputTest = "3";
        InputStream in = new ByteArrayInputStream(inputTest.getBytes());
        System.setIn(in);
        assertEquals("Fizz", fizzBuzz.convert(3));

    }

    @Test
    public void multiplesOfFive() {

        String inputTest = "3";
        InputStream in = new ByteArrayInputStream(inputTest.getBytes());
        System.setIn(in);
        assertEquals("Buzz", fizzBuzz.convert(5));

    }




}