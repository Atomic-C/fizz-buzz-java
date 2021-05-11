public class FizzBuzz {

        public String convert(int convertToFizzBuzz) {

            if(convertToFizzBuzz %3 == 0) {
                return "Fizz";
            }
            else if(convertToFizzBuzz % 5 ==0 ) {
                return "Buzz";
            }

            return String.valueOf(convertToFizzBuzz);
        }

}
