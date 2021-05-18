import java.util.ArrayList;
import java.util.List;

public class CountToOneHundred {

    private int [] array = new int[100];

    public int outputTheHundredFizzBuzzes() {


        for (int i = 1; i <= 100 ; i++) {
            array[i] = i + 1;

             // We successfully add 100 integers to our list!
            //System.out.println(i);
        }
        return 1;
    }

}
