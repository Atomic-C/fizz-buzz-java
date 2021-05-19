import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTo100Test {

    FizzBuzzTo100 fizzBuzzTo100 = new FizzBuzzTo100();

    //TODO: LEARN MORE ABOUT MOCKITO https://www.youtube.com/watch?v=rLXLApFgzSw

    @Test
    public void convert() {

        assertEquals("FizzBuzz", fizzBuzzTo100.convert());

    }
}

