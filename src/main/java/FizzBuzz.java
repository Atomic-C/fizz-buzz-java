import java.util.List;

public class FizzBuzz {


        public String convert(int convertToFizzBuzz) {

            for (int i = 1; i <= 100 ; i++) {

                
            }

            if(((convertToFizzBuzz % 3) == 0) && ((convertToFizzBuzz % 5) == 0)) {
                return "FizzBuzz";
            }
            if((convertToFizzBuzz % 3) == 0) {
                return "Fizz";
            }
            if((convertToFizzBuzz % 5) == 0 ) {
                return "Buzz";
            }
            else {

            return Integer.toString(convertToFizzBuzz);
            }
        }
// https://www.educative.io/edpresso/what-is-the-fizzbuzz-problem-in-java
}

