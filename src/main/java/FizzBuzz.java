import java.util.List;

public class FizzBuzz {



        public String convert(List<Integer> convertToFizzBuzz) {

            int number = convertToFizzBuzz.iterator().next();

            if(number % 3 == 0) {
                return "Fizz";
            }
            if(number % 5 ==0 ) {
                return "Buzz";
            }
            if((number % 3 == 0) && (number % 5 == 0)) {
                return "FizzBuzz";
            }

            return String.valueOf(convertToFizzBuzz);
        }

}
