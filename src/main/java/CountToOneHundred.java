import java.util.ArrayList;
import java.util.List;

public class CountToOneHundred {

    private List<Integer> myList = new ArrayList<Integer>();

    public List<Integer> outputTheHundredFizzBuzzes() {


        for (int i = 1; i <= 100 ; i++) {

              myList.add(i);
            //System.out.println(i);

        }
        return myList;
    }

}
