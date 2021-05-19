import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

@ExtendWith(MockitoExtension.class)
public class FizzBuzzTo100Test {

    FizzBuzzTo100 fizzBuzzTo100 = new FizzBuzzTo100();

    //TODO: LEARN MORE ABOUT MOCKITO https://www.youtube.com/watch?v=rLXLApFgzSw

    @Autowired
    @Test
    public void convert() {

        fizzBuzzTo100.convert();

        //assertEquals("FizzBuzz", fizzBuzzTo100.convert());

    }
}

