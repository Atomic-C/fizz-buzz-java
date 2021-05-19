public class FizzBuzzTo100 {

    public void convert() {

        for (int i = 1; i <= 100 ; i++) {
            int convertToFizzBuzz = i;

        if(((convertToFizzBuzz % 3) == 0) && ((convertToFizzBuzz % 5) == 0)) {
            System.out.println("FizzBuzz");
        }
        if((convertToFizzBuzz % 3) == 0) {
            System.out.println("Fizz");
        }
        if((convertToFizzBuzz % 5) == 0 ) {
            System.out.println("Buzz");
        }
        else {
            System.out.println(convertToFizzBuzz);
        }
        }
    }

}
