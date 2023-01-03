package main.java.com.codility.lessons.arrays;

import java.util.Arrays;

public class CyclicRotation {

    public int[] rotateArray(int[] A, int K){

        int[] B = new int[A.length];

        for(int i= 0; i < A.length; i++){

            B[(K + i ) % A.length] = A[i];

        }
        System.out.println("Original array: " + Arrays.toString(A));
        System.out.println("Rotated array of " + K + " positions: " + Arrays.toString(B));
        return B;
    }

}
