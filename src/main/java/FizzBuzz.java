public class FizzBuzz {

        public String convert(int convertToFizzBuzz) {

            if(convertToFizzBuzz % 3 == 0) {
                return "Fizz";
            }
            if(convertToFizzBuzz % 5 ==0 ) {
                return "Buzz";
            }
            if((convertToFizzBuzz % 3 == 0) && (convertToFizzBuzz % 5 == 0)) {
                return "FizzBuzz";
            }

            return String.valueOf(convertToFizzBuzz);
        }

}
