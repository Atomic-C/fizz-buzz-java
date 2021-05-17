import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();



    // sources I'm working with ATM: https://docs.oracle.com/javase/7/docs/api/java/util/List.html
    // ALSO: https://www.baeldung.com/java-list-capacity-array-size
    //TODO: FIGURE OUT HOW TO ADD TO LIST, ACCESS AND PASS TO CONVERTER. Currently asking for: List type


    @Test
    public void convertLeavesNormalNumbersAlone() {

        String inputTest = "3";
        InputStream in = new ByteArrayInputStream(inputTest.getBytes());
        System.setIn(in);
        assertEquals(1, fizzBuzz.convert(1));
        assertEquals(2, fizzBuzz.convert(2));
        assertEquals(4, fizzBuzz.convert(4));

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

    @Test
    public void multiplesOfThreeAndFive() {

        String inputTest = "3";
        InputStream in = new ByteArrayInputStream(inputTest.getBytes());
        System.setIn(in);
        assertEquals("FizzBuzz", fizzBuzz.convert(15));

    }
}


// https://www.youtube.com/watch?v=b5W8bR4y-g4


