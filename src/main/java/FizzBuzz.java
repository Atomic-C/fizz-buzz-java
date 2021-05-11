public class FizzBuzz {

        public String convert(int convertToFizzBuzz) {

            if(convertToFizzBuzz%3==0) {
                return "Fizz";
            }

            return String.valueOf(convertToFizzBuzz);
        }

}
