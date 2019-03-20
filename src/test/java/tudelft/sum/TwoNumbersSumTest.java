package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoNumbersSumTest {

    @Test
    public void singleNumber() {
        TwoNumbersSum twoNumbers = new TwoNumbersSum();

        ArrayList<Integer> a = new ArrayList<Integer>();
        //Integer[] otherList = new Integer[] {1, 2};
        //a.addAll(Arrays.asList(otherList));
        a.add(2);
        a.add(4);
        a.add(3);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(5);
        b.add(6);
        a.add(4);

        ArrayList<Integer> result = twoNumbers.addTwoNumbers(a,b);

        ArrayList<Integer> expected =  new ArrayList<Integer>();
        expected.add(7);
        expected.add(0);
        expected.add(8);

        Assertions.assertEquals(expected, result);
    }
}
