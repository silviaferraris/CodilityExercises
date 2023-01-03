package test.java.com.codility.test.lessons.arrays;
import main.java.com.codility.lessons.arrays.CyclicRotation;
import org.junit.Test;

public class CyclicRotationTest {

    @Test
    public void rotateArrayTest(){

        int[] A = new int[]{6, 3, 8, 9, 7};
        int k = 2;

        CyclicRotation cyclicRotation = new CyclicRotation();
        cyclicRotation.rotateArray(A,k);
    }

}
