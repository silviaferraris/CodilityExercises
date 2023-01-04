package test.java.com.codility.test.lessons.arrays;

import main.java.com.codility.lessons.arrays.OddOccurrencesInArray;
import org.junit.Test;

public class OddOccurrencesInArrayTest {

    @Test
    public void findNotPairingElementTest(){

        OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();
        int[] A = new int[]{2,4,3,2,3,5,4};
        System.out.println(oddOccurrencesInArray.findNotPairingElement(A));
    }

}
