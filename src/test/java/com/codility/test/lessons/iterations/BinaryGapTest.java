package test.java.com.codility.test.lessons.iterations;
import main.java.com.codility.exercises.bitwiseops.BinaryGap;
import org.testng.annotations.Test;

public class BinaryGapTest {

    @Test
    void numberOfZeros(){

        int number = 1041;
        int sol = BinaryGap.findLongestZerosSequence(number);

        System.out.println(sol);

    }
}
