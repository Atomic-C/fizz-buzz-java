import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void convert() {

        String inputTest = "3";
        InputStream in = new ByteArrayInputStream(inputTest.getBytes());
        System.setIn(in);
        assertEquals("3", fizzBuzz.convert(3));

    }
}