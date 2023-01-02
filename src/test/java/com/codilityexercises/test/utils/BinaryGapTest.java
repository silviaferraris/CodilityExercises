package test.java.com.codilityexercises.test.utils;
import main.java.com.codilityexercises.utils.BinaryGap;
import org.testng.annotations.Test;

public class BinaryGapTest {

    @Test
    void numberOfZeros(){

        int number = 1041;
        int sol = BinaryGap.findLongestZerosSequence(number);

        System.out.println(sol);

    }
}
