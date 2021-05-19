
public class FizzBuzz {

        public String convert(int convertToFizzBuzz) {

            //https://www.educative.io/edpresso/what-is-the-fizzbuzz-problem-in-java

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
}

