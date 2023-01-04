package main.java.com.codility.lessons.arrays;

import main.java.com.codility.utils.Commons;
import org.testng.collections.Lists;

import java.util.*;
import java.util.stream.Collectors;

public class OddOccurrencesInArray {

    public int findNotPairingElement(int[] A){

        ArrayList<Integer> list = new ArrayList<>(new ArrayList<>(Arrays.stream(A)
                .boxed().toList()));
        int tmp = 0;

        while (!list.isEmpty()) {
            int e = list.get(0);
            list.remove((Integer) e);
            if( list.contains(e)){
                list.remove((Integer) e);
            }
            else{
                tmp = e;
            }
        }

        return tmp;

    }


}
