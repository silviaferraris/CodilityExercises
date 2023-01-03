package main.java.com.codility.exercises.bitwiseops;

import main.java.com.codility.utils.Commons;

import java.util.ArrayList;
import java.util.Collections;

public class BinaryGap {

    public static int findLongestZerosSequence(int N){

        int sol = 0,
                solMax = 0,
                temp = 0;

        if(N < 1) return 0;

        int dimension = Commons.calculateDimension(N);
        ArrayList<Integer> binary = new ArrayList<>(dimension);

        while(N > 0){
            binary.add(N%2);
            N = N/2;
        }
        Collections.reverse(binary);

        if(binary.contains(1)){
            for (int i = 0; i< binary.size(); i++) {
                if(binary.get(i) == 1){

                    if(i==0){
                        solMax = 0;
                    }
                    else{
                        sol = i - temp - 1;
                        if(sol > solMax){
                            solMax = sol;
                        }
                    }
                    temp = i;
                }
            }
        }
        return solMax;
    }



}
