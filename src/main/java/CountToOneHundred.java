import java.util.ArrayList;
import java.util.List;

public class CountToOneHundred {

    private List<Integer> myList = new ArrayList<Integer>();


    public List<Integer> outputTheHundredFizzBuzzes() {


        for (int i = 1; i <= 100 ; i++) {


            myList.add(i); // We successfully add 100 integers to our list!
            //System.out.println(i);

        }
        return myList;
    }

}
